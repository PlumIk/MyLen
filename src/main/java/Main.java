import CodeGen.ClassGen;
import CodeGen.CodeGenListener;
import antlr.MyLenGLexer;
import antlr.MyLenGParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main( String[] args) throws Exception
    {
        System.out.println(args.length);
        if(args.length==2) {
            String name= args[1];
            System.out.println(name);
            String a = name.split("\\.")[0];
            System.out.println(a);
            ClassGen gener = new ClassGen(a);
            org.antlr.v4.runtime.CharStream input= CharStreams.fromFileName(name);
            MyLenGLexer lexer = new MyLenGLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MyLenGParser parser = new MyLenGParser(tokens);
            ParseTree tree = parser.parse();
            CodeGenListener visitor = new CodeGenListener(gener);
            visitor.visit(tree);
            gener.End();

            try {
                Files.write(Path.of(a+".class"), gener.GetCode());
            } catch (IOException e) {
                System.out.println("ops");
                e.printStackTrace();
            }

        }
        else {
            System.out.println("OPS");
        }
    }
    /*
    public static void main( String[] args) throws Exception {


        ClassGen gener = new ClassGen("test");
        org.antlr.v4.runtime.CharStream input = CharStreams.fromString("" +
                "a=43;\n" +
                "log (a);\n" +
                "b=47;\n" +
                "end =\"by\";\n" +
                "while (b!=a){\n" +
                    "\tb=b-1;\n" +
                    "\tlog(\"hi\");\n" +
                "}\n" +
                "log (end);");
        MyLenGLexer lexer = new MyLenGLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MyLenGParser parser = new MyLenGParser(tokens);
        ParseTree tree = parser.parse();
        CodeGenListener visitor = new CodeGenListener(gener);
        visitor.visit(tree);
        gener.End();

        try {
            Files.write(Path.of("test.class"), gener.GetCode());
        } catch (IOException e) {
            System.out.println("ops");
            e.printStackTrace();
        }


    }

*/
}
