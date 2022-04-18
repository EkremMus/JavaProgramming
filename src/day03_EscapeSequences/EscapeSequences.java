package day03_EscapeSequences;
/*
Escape Sequences
    \n: starts a new line
    \t: Paragraph Space (tab)
    \\: backward slash to be printed
    \": double quote
 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java \nPython \nC#");

        System.out.println("----------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see you all! \nWhat class do we have next?");

        System.out.println("--------------------------------------");

        System.out.println("\tJava is Cool Programing Language");

        System.out.println("----------------------------------------");

        System.out.println("/ \\"); // in order to print one backward slash we need to give two

        System.out.println("----------------------------------------");

        System.out.println("My favorite TV show is \"Game of Thrones\""); // in order to print "" we need \"
    }

}
