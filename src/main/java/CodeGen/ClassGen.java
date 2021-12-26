package CodeGen;

import org.objectweb.asm.*;
import org.objectweb.asm.Label;

import java.awt.*;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Stack;

public class ClassGen {
    private ClassWriter cw = new ClassWriter(0);
    private FieldVisitor fv;
    private MethodVisitor mv;
    private AnnotationVisitor av0;
    private Label methodStart = new Label();
    private Label methodEnd = new Label();
    private int size=0;
    private Stack<Label> endLable=new Stack<>();

    public ClassGen(String name){
        cw.visit(49,
                Opcodes.ACC_PUBLIC +  Opcodes.ACC_SUPER,
                name,
                null,
                "java/lang/Object",
                null);

        cw.visitSource(name+".java", null);
        {
            mv = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            mv.visitMethodInsn(Opcodes.INVOKESPECIAL,
                    "java/lang/Object",
                    "<init>",
                    "()V");
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(1, 1);
            mv.visitEnd();
        }
        mv = cw.visitMethod(Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC,
                "main",
                "([Ljava/lang/String;)V",
                null,
                null);

        mv.visitCode();
        mv.visitLabel(methodStart);
    }

    public void AddPer(String name, String type, int num){
        mv.visitLocalVariable(name, type, null, methodStart, methodEnd, num);
        size++;
    }

    public void AddValue(int num, boolean isint){
        if(isint){
            mv.visitVarInsn(Opcodes.ISTORE, num);
        }else{
            mv.visitVarInsn(Opcodes.ASTORE, num);
        }
    }

    public void PrintAny(int num, String line, int value, String type){
        mv.visitFieldInsn(Opcodes.GETSTATIC,
                "java/lang/System",
                "out",
                "Ljava/io/PrintStream;");

        if(num>0){
            if(Objects.equals(type, "I")){
                mv.visitVarInsn(Opcodes.ILOAD, num);
            }else {
                mv.visitVarInsn(Opcodes.ALOAD, num);
            }
        }else {
            mv.visitLdcInsn(Objects.requireNonNullElse(line, value));
        }

        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL,
                "java/io/PrintStream",
                "println",
                "("+type+ ")V");
    }

    public void End(){
        mv.visitLabel(methodEnd);
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(size+2, size+1);//мои переменные +2 (входные и служебные), мои + 1 (входные)
        mv.visitEnd();
        cw.visitEnd();
    }

    public byte[] GetCode(){
        return cw.toByteArray();
    }

    public void LoadParVar(int num, String type){
        if(!Objects.equals(type,"I")){
            mv.visitVarInsn(Opcodes.ALOAD, num);
        }else {
            mv.visitVarInsn(Opcodes.ILOAD, num);
        }

    }

    public void LoadValue(int value){
        mv.visitLdcInsn(value);
    }

    public void LoadString(String value){
        mv.visitLdcInsn(value);
    }

    public void DoOp (int what){
        switch (what){
            default ->{
                mv.visitInsn(Opcodes.IADD);
            }
            case 6 ->{
                mv.visitInsn(Opcodes.ISUB);
            }
            case 7->{
                mv.visitInsn(Opcodes.IMUL);
            }
            case 8 -> {
                mv.visitInsn(Opcodes.IDIV);
            }
        }
    }

    public void StartIf(int what){
        Label IfEnd=new Label();
        endLable.push(IfEnd);
        switch (what){
            default -> {
                mv.visitJumpInsn(Opcodes.IF_ICMPNE ,IfEnd);
            }
            case 2 ->{
                mv.visitJumpInsn(Opcodes.IF_ICMPEQ,IfEnd);
            }
            case 3 ->{
                mv.visitJumpInsn(Opcodes.IF_ICMPLE,IfEnd);
            }
            case 4 ->{
                mv.visitJumpInsn(Opcodes.IF_ICMPGE,IfEnd);
            }
        }
    }
    public void StartWhile(){
        Label WhileStart=new Label();
        endLable.push(WhileStart);
        PlaceLable();
        endLable.push(WhileStart);
    }

    public void StartWhile(int what){
        Label WhileEnd=new Label();
        Label WhileStart=endLable.pop();
        endLable.push(WhileEnd);
        endLable.push(WhileStart);
        switch (what){
            default -> {
                mv.visitJumpInsn(Opcodes.IF_ICMPNE ,WhileEnd);
            }
            case 2 ->{
                mv.visitJumpInsn(Opcodes.IF_ICMPEQ,WhileEnd);
            }
            case 3 ->{
                mv.visitJumpInsn(Opcodes.IF_ICMPLE,WhileEnd);
            }
            case 4 ->{
                mv.visitJumpInsn(Opcodes.IF_ICMPGE,WhileEnd);
            }
        }
    }

    public void PlaceLable(){
        mv.visitLabel(endLable.pop());
    }

    public void PlaceGoLable(){
        mv.visitJumpInsn(Opcodes.GOTO, endLable.pop());
    }

}
