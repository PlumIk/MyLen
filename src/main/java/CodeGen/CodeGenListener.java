package CodeGen;

import Util.MyVar;
import antlr.MyLenGBaseVisitor;
import antlr.MyLenGParser;

import java.util.HashMap;
import java.util.Map;

public class CodeGenListener extends MyLenGBaseVisitor<MyVar> {

    //Map <String, MyVar> vars=new HashMap<>();
    Map <String, Integer> order=new HashMap<>();
    Map <String, String> types=new HashMap<>();
    Map <String,String> extype=new HashMap<>();
    ClassGen gener;

    public CodeGenListener(ClassGen in){
        super();
        gener=in;
        extype.put("i","I");
        extype.put("s","Ljava/lang/String;");
    }

    @Override
    public MyVar visitAssignment(MyLenGParser.AssignmentContext ctx) {
        String id= ctx.ID(0).getText();
       // MyVar var=MyVar.VOID;
        if (ctx.s1==null){
             this.visit(ctx.procedure());
            if (order.get(id) == null) {
                order.put(id, order.size() + 1);
                types.put(id, extype.get("i"));
                gener.AddPer(id, types.get(id), order.get(id));
            }
            gener.AddValue(order.get(id),true);
        }
        else {

            if (order.get(id) == null) {
                order.put(id, order.size() + 1);
                switch (ctx.s1.getType()) {
                    case MyLenGParser.ID ->  {
                        types.put(id, types.get(ctx.s1.getText()));
                        gener.AddPer(id, types.get(id), order.get(id));
                    }
                    case MyLenGParser.STRING->{
                        types.put(id, extype.get("s"));
                        gener.AddPer(id, types.get(id), order.get(id));
                    }
                    default -> {
                        types.put(id, extype.get("i"));
                        gener.AddPer(id, types.get(id), order.get(id));
                    }
                }
            }

            switch (ctx.s1.getType()) {
                case MyLenGParser.ID ->  {
                    gener.LoadParVar(order.get(ctx.s1.getText()),types.get(id));
                    gener.AddValue(order.get(id),true);
                }
                case MyLenGParser.STRING->{
                    gener.LoadString(ForString( ctx.s1.getText()));
                    gener.AddValue(order.get(id),false);
                }
                default -> {
                    gener.LoadValue(Integer.parseInt(ctx.s1.getText()));
                    gener.AddValue(order.get(id),true);
                }
            }

        }


        return  MyVar.VOID;
    }

    @Override
    public MyVar visitProcedure(MyLenGParser.ProcedureContext ctx) {

        switch (ctx.ID().size()) {
            case (0) -> {
                gener.LoadValue(Integer.parseInt( ctx.INT(0).getText()));
                gener.LoadValue(Integer.parseInt( ctx.INT(1).getText()));
            }
            case (1)->{
                if(ctx.s1.getType()==MyLenGParser.ID){
                    gener.LoadParVar(order.get(ctx.ID(0).getText()),types.get(ctx.ID(0).getText()));
                    gener.LoadValue(Integer.parseInt( ctx.INT(0).getText()));
                }
                else{
                    gener.LoadValue(Integer.parseInt( ctx.INT(0).getText()));
                    gener.LoadParVar(order.get(ctx.ID(0).getText()),types.get(ctx.ID(0).getText()));
                }
            }
            case (2)-> {
                gener.LoadParVar(order.get(ctx.ID(0).getText()),types.get(ctx.ID(0).getText()));
                gener.LoadParVar(order.get(ctx.ID(1).getText()),types.get(ctx.ID(1).getText()));
            }
            default -> {
                gener.LoadValue(0);
                gener.LoadValue(0);
            }
        }
        gener.DoOp(ctx.op.getType());


        return MyVar.VOID;
        
    }

    @Override
    public MyVar visitIf_state(MyLenGParser.If_stateContext ctx) {
        String id=ctx.log_block().s1.getText();
        switch (ctx.log_block().s1.getType()){
            case MyLenGParser.ID -> {
               gener.LoadParVar(order.get(id),types.get(id));
            }
            case MyLenGParser.INT -> {
                gener.LoadValue(Integer.parseInt(id));
            }
            default -> {
                gener.LoadValue(0);
            }
        }
        id=ctx.log_block().s2.getText();
        switch (ctx.log_block().s2.getType()){
            case MyLenGParser.ID -> {
                gener.LoadParVar(order.get(id),types.get(id));
            }
            case MyLenGParser.INT -> {
                gener.LoadValue(Integer.parseInt(id));
            }
            default -> {
                gener.LoadValue(0);
            }
        }

        gener.StartIf(ctx.log_block().op.getType());
        this.visit(ctx.condition_block());
        gener.PlaceLable();

        return MyVar.VOID;
    }

    @Override
    public MyVar visitWhile_state(MyLenGParser.While_stateContext ctx) {
        gener.StartWhile();

        String id=ctx.log_block().s1.getText();
        switch (ctx.log_block().s1.getType()){
            case MyLenGParser.ID -> {
                gener.LoadParVar(order.get(id),types.get(id));
            }
            case MyLenGParser.INT -> {
                gener.LoadValue(Integer.parseInt(id));
            }
            default -> {
                gener.LoadValue(0);
            }
        }
        id=ctx.log_block().s2.getText();
        switch (ctx.log_block().s2.getType()){
            case MyLenGParser.ID -> {
                gener.LoadParVar(order.get(id),types.get(id));
            }
            case MyLenGParser.INT -> {
                gener.LoadValue(Integer.parseInt(id));
            }
            default -> {
                gener.LoadValue(0);
            }
        }

        gener.StartWhile(ctx.log_block().op.getType());
        this.visit(ctx.condition_block());
        gener.PlaceGoLable();
        gener.PlaceLable();

        return MyVar.VOID;

    }


    @Override
    public MyVar visitPrint(MyLenGParser.PrintContext ctx) {
        MyVar var=MyVar.VOID;
        switch (ctx.s.getType()){
            case MyLenGParser.INT -> {
                var=new MyVar(Integer.parseInt(ctx.INT().getText()));
                gener.PrintAny(0,null,var.asInt(),extype.get("i"));
            }
            case MyLenGParser.STRING -> {
                var=new MyVar(ForString( ctx.STRING().getText()));
                gener.PrintAny(0,var.asString(),0,extype.get("s"));
            }
            case MyLenGParser.ID -> {
                String id=ctx.ID().getText();
                gener.PrintAny(order.get(id),null,0,types.get(id));
            }

        }
        return var;
    }

    String ForString(String str){
        str=str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return str;
    }
}
