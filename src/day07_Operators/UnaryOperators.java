package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0); // false
        System.out.println(num2<0); // true

        System.out.println("-----------------------------------------");

        int a=5;
        //++a; pre increment: increases the value by 1
        //--a; pre increment: decrases the value by 1

        System.out.println(++a);

        int c=100;

        System.out.println(c++); //post increment: increases value by 1 at the next step
        System.out.println(c); //101


        System.out.println("--------------------------------------------------");

        int x= 200;
        System.out.println(--x); // pre increment: decreases value by 1 right away

        int y=200;
        System.out.println(y--); //post decrement:

        int d = 25;
        System.out.println(++d);
        System.out.println(--d);

        System.out.println("-----------------------------------------");

        int z=45;

        System.out.println(++z); //46 z=46
        System.out.println(--z); //46 z = 47
        System.out.println(z); //47



    }
}
