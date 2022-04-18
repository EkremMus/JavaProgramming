package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        int number = 100;

        //System.out.println("Odd Number");

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;

        if (evenNumber) { // even number
            System.out.println(number + " is even number.");
        }

        if (oddNumber) { // odd number
            System.out.println(number + "is odd number");
        }
        //System.out.println("Even number");

        System.out.println("------------------------------");

        // positive, negative, zero

    }
}
