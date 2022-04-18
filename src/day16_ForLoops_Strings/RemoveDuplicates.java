package day16_ForLoops_Strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str= "aabbaacdddcee";

        String result ="";

        for (int i = 0; i < str.length() ; i++) { // i: represents the index number of str
            String ch = "" + str.charAt(i); // represents each character of the str
            System.out.print(ch + " ");
            if (!result.contains(ch)){ // if the character is not contained in the result it will be added
                result += ch; // the character will be added to the result

            }
        }
        System.out.println();
        System.out.println(result);



    }
}
