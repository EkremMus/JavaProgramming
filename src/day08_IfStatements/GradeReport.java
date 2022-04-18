package day08_IfStatements;

import java.sql.SQLOutput;

public class GradeReport {

    public static void main(String[] args) {

        /*
        System.out.println( true == !false); // true
        System.out.println( !true !=false); // false
        System.out.println( !false == true); // false
        System.out.println(!!false); //false
        System.out.println(!!!true); //false
         */

        int score = 85; // 0-100 points
        boolean A = score >= 90 && score <=100;
        boolean B = score >= 80 && score <=89; // boolean B = score >= 90 && !A;
        boolean C = score >= 70 && score <=79; // boolean C = !A && !B && score <=79;
        boolean D = score >= 60 && score <=69; // boolean D = score >= 60 && !C;
        boolean F = score >= 0 && score <=59; // boolean F = !A && !B && !C && !D;

        if(A){
            System.out.println("Excellent");
        }

        if (B) {
            System.out.println("Great");
        }

        if (C) {
            System.out.println("Good");
        }

        if (D) {
            System.out.println("Passed");
        }

        if (F) {
            System.out.println("Failed");
        }

    }
}
