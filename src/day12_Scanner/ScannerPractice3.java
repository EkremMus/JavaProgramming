package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your programming language: ");
        String programming = scan.nextLine();

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        scan.nextLine(); //Enter

        System.out.println("Enter your school name: ");
        String schoolName = scan.nextLine(); //Enter

        System.out.println("Full Name = " + fullName);
        System.out.println("Programming = " + programming);
        System.out.println("Age = " + age);
        System.out.println("School Name = " + schoolName);

        scan.close();




    }
}
