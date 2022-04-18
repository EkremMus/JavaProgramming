package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        String [] myGroups = new String [5]; // contains 5 students 0-4
        myGroups [0] = "Ekrem";
        myGroups [1] = "Neira";
        myGroups [2] = "Suat";
        myGroups [3] = "Hulya";
        myGroups [4] = "Michael";
        System.out.println(Arrays.toString(myGroups));


        System.out.println("----------------------------------------------");

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 4;

        if (number < 1 || number >=7){
            System.err.println( "Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


    }


}
