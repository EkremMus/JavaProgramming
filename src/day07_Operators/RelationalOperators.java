package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, <, <=,

        boolean result1 = 20>40; // false
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150;
        System.out.println("result2 = " + result2); // true

        boolean result3 = 100 >= 100; // true
        System.out.println("result3 = " + result3);

        boolean result4 = 100 >=150; // false
        System.out.println("result4 = " + result4);

        //credit score of 720
        int creditScore = 745;
        boolean isEligibleForLoan = creditScore >= 720;

        boolean result5 = 200 < 100; // true
        System.out.println("result5 = " + result5);

        int score = 59;
        boolean hasFailed = score <= 59; // true
        System.out.println("hasFailed = " + hasFailed);

        boolean number7 = 45<= 60;
        System.out.println("number7 = " + number7); //true

        System.out.println("---------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x == y; // false
        System.out.println("equal = " + equal);

        boolean result9 = "A" == "a"; // false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; // true

        System.out.println("----------------------------------------------");

        boolean result11 = 100 !=200.5; //true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break";
        System.out.println("result12 = " + result12);








    }
}
