package day08_IfStatements;

public class NumberOfMonths {
    public static void main(String[] args) {

        int number = 4; //1-12

        boolean has28Days = number ==2;
        boolean has30Days = number == 4 || number ==6 || number ==8 || number == 10;
        boolean has31Days = !has28Days && !has30Days;

        if (has28Days){
            System.out.println("28 days");
        }

        if (has30Days){
            System.out.println("30 days");
        }

        if (has31Days) {
            System.out.println("31 days");
        }
    }
}
