package day15_Loops;

public class LoopIntro {

    public static void main(String[] args) {
        String str = "Ekrem\n";
        str= str.repeat(10);
        System.out.println(str);

        System.out.println("-------------------------------------------");
        //   1         2      5
        for(int i=1; i<=10; i+=2){ //1,3,5,7,9 5 times
            System.out.println("Ekrem Mus1");
        }

    }
}
