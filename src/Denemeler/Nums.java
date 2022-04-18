package Denemeler;

import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {

        /*        int n1=11;
        int n2=10;

        if (n1==n2){
            System.out.println("n1 and n2 are equal");
        }else if(n1>n2){
            System.out.println(" n1 is greater than n2");
        }else
            System.out.println("n2 is greater than n1"); */

        /*
        switch (num){
            case 0:
                b= false;
            case 1:
                System.out.print(1);
            case 2:
                if (b){
                    System.out.print(2);
                }else {
                    b= false;
                }
            case 3:
                if(b){
                    System.out.print(3);
                    b=false;
                } else {
                    break;
                }
            case 4:
                System.out.print(4);
            case 5:
                if (!b){
                    break;
                }
                System.out.print(5);
         */


        Scanner input = new Scanner(System.in);

        String first = input.nextLine();
        String last = input.nextLine();
        int number = input.nextInt()+1;
        String fullName ="";

        if (number % 2 == 0){
            fullName = first + " "+ last;
        }else {
            fullName = "Not a valid name";
        }
        System.out.println(fullName);

    }
}
