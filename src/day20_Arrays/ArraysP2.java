package day20_Arrays;

import java.util.Arrays;

public class ArraysP2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        char ch ='A';
        for (int i = 0;  i < letters.length; i++) {
            letters [i]= ch++;
        }
        System.out.println(Arrays.toString(letters)); // A - Z

        System.out.println("-------------------------------");

        char[] letters2 = new char[26]; // Z -A

        char ch1 ='Z';
        for (int i = 0;  i < letters2.length; i++, ch--) {
            letters2[i] = ch1;
            ch1--;
        }
            System.out.println(Arrays.toString(letters2));
    }
}
