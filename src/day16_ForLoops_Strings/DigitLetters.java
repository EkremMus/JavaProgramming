package day16_ForLoops_Strings;

public class DigitLetters {
    public static void main(String[] args) {
        String str = "Cydeo12345School?)/    &%+^Woode  nSpoon";

        String digits = ""; //12345
        String letters = ""; // CydeoSchoolWoodenSpoon
        String specialChars = ""; // ?)/&%+^

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') { // digit
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') { // letter
                letters += ch;
            } else { // special character
                if (ch != ' ') { // excludes space
                    specialChars += ch;
                }

            }
            System.out.println("letters = " + letters );
        }


        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}