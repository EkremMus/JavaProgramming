package day06_Primitives;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println("12" + 1); //121 Concatenation
        System.out.println(10 +30); //40
        System.out.println(100-50); //50
        System.out.println(10*6); //60

        System.out.println(100.0/3); //33
        System.out.println( 100 / (double)3);
        System.out.println(100/3);

        int a = 100;
        double b= a/6; //16.0

        System.out.println("b = " + b);

        System.out.println(b);

        double c= (double)a/6; // 16.66666
        double d= a/6.0; // 16.66666

        System.out.println(c);

        double e= a/6.0d; //16.666666
        System.out.println(e);

        System.out.println(100D);

        System.out.println( 10%4);
        System.out.println(25%3);

    }
}

/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
            integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal
            in math:
                10/4 = 2.5
                100/3 = 33.333....
            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33
    %: Remainder
 */