package day10_NestedIfTernaries;

public class NestedIfIntro {

    public static void main(String[] args) {


        int score =195;

        if(score>=0 && score<=100){ // if the score is valid
            if(score>=60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else { // if the score is not valid
            System.out.println("Invalid score");
        }

        System.out.println("--------------------------------------");

        int age = 25;
        boolean hasID = true;

        if (hasID) {

            if (age >= 25) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println(" Not eligible to buy alcohol");
            }

        }else {
            System.out.println("You must have an ID to but alcohol");
        }

        System.out.println("_______________________________________________");

        int n =8;

        if (n>= 1 && n <=7){ // if the n is between 1-7
            // 7 options
            if(n==1){
                System.out.println("Monday");
            }else if(n==2){
                System.out.println("Tuesday");
            }else if (n==3){
                System.out.println("Wednesday");
            }else if (n==4){
                System.out.println("Thursday");
            }else if (n==5){
                System.out.println("Friday");
            }else if (n==6){
                System.out.println("Saturday");
            }else {
                System.out.println("Sunday");
            }

        }else{
            System.out.println("Invalid number");
        }





    }
}
