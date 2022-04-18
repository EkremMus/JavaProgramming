package day15_Loops;

public class LoopsPractice2 {

    public static void main(String[] args) {
        for (int i= 65; i<=90; i++) { // A, B, C,....Z
            System.out.print((char) i+ " ");

        }
        System.out.println();
        System.out.println("------------------------------");
        for (char i = 'A'; i<='Z'; i++) {
            System.out.print(i + " "); //A,B, C, ...Z
        }
        System.out.println();
        System.out.println("--------------------------------------");

        for (char i= 'a'; i<='z'; i++){
            System.out.print(i + " "); //a,b,c,....,z
        }
            System.out.println();

        for (char i= 'Z'; i>='A'; i--) System.out.print(i+ " "); // Z,Y,X,....A
        System.out.println();

        for (char i= 'z'; i>='a'; i--) System.out.print(i+ " "); // Z,Y,X,....A
        System.out.println();

        /*
        for (char i= 1; i<=40; i++){System.out.print(i + " ");
         */

        System.out.println();
    }
}
