package day10_NestedIfTernaries;

public class TernariesInfo {

    public static void main(String[] args) {

        int n =12;
        if (n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        System.out.println("-----------------------------------------");

        String result = (n%2 ==00)? "Even" : "Odd";

        System.out.println(result);

        System.out.println("------------------------------------------------");

        int age = 23;

       /*
        if (age >=21){
         System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }*/

        String result1 = (age >=21)? "Eligible" : "Not Eligible";
        System.out.println( (age >=21)? "Eligible" : "Not Eligible");
        System.out.println(result1);

        System.out.println("--------------------------------");

        int n2 =100;
        /*
         if (n2>0){
            System.out.println("Positive");
        }else if (n2<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
         */

        String result3= (n2>0)? "Positive" :(n2 <0)? "Negative" : "Zero";
        System.out.println(result3);
    }






}
