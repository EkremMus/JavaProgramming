package day19_Recap_Loops;

public class UniqueCharacter {

    public static void main(String[] args) {

        // str = "aabccdeef"; output = bdf

        String str = "aabccdeef";
        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0; // represents the frequency of the char

            for (int i = 0; i < str.length(); i++) { // compares the character with other characters
                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }

            }

            if (count == 1) { // if frequency is 1 then it is unique
                result += ch;
            }

        }

        System.out.println(result);
    }
}