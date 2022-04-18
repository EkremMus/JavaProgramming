package day25_Customs_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programing";
        StringUtility.printEachChar(str);

        System.out.println("-------------------------");

        String s1= "Wooden Spoon";
        StringUtility.reverse(s1);
        System.out.println(s1);


        System.out.println("-----------------------");
        String word = "Civic";

        boolean palindrome= StringUtility.isPalindrome(word);
        System.out.println(palindrome);


        System.out.println("--------------------");

        String s2 ="aaabbbcccddddeee";

        String nonDup= StringUtility.removeDuplicates(s2);
        System.out.println(s2);

    }




}
