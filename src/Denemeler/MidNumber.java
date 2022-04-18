package Denemeler;

import java.util.Scanner;

public class MidNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, medium= 0;

        System.out.println("Enter first number: ");
        num1= scan.nextInt ();

        System.out.println("Enter second number: ");
        num2= scan.nextInt ();

        System.out.println("Enter third number: ");
        num3= scan.nextInt ();

        if(num1 > num2 && num1 > num3){
            if(num2 > num3){
                medium= num2;
            }else {
                medium = num3;
            }
        } else if (num2 > num1 && num2 > num3){
            if ( num1 > num3){
                medium = num1;
            }else {
                medium = num3;
            }
        }else if (num3 > num1 && num3 > num2){
            if (num1 > num2){
                medium = num1;
            }else {
                medium = num2;
            }
        }

        System.out.println("Medium value is: " + medium);
    }
}
