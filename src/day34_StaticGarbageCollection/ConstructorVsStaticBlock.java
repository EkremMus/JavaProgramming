package day34_StaticGarbageCollection;

public class ConstructorVsStaticBlock {
    static{
        System.out.println("Static Block");
    }

    public ConstructorVsStaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new ConstructorVsStaticBlock(); //1
        new ConstructorVsStaticBlock(); //2
        new ConstructorVsStaticBlock(); //3
        new ConstructorVsStaticBlock(); //4
        new ConstructorVsStaticBlock(); //5



    }
}
