package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;
        //fullName of the person is ______
        System.out.println("Full Name of the person is " + fullName+".");

        //_____ is __ years old
        System.out.println(fullName  + " is " + age + " years old.");

        //fullName is jobTittle, works at companyName, and fullName's salary is salary

        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
        + ", and " + fullName + "'s salary is $"+salary+".");


    }
}
