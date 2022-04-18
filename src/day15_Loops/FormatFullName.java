package day15_Loops;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName ="EkREm";
        String lastName = "mus";

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);


    }
}
/*
3. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper
case)
input:
firstName = "cyDEo"
lastName = "SCHOOL";
output:
Cydeo School
 */