package day17_WhileDoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str ="Java Java Pyhton Python ";
        str = str.toLowerCase();
        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java", " ");
            frequency ++;
        }
        System.out.println("frequency = " + frequency);

        System.out.println("-----------------------------------");

        String str1 =" cat cat cat cat dog cat dog cat cat CAT CAT Cat ";
        str1= str1.toLowerCase();
        int countCat = 0;

        while (str1.contains("cat")) {
            str1 = str1.replaceFirst("cat", " ");
            countCat++;
        }
        System.out.println("count = " + countCat);

    }
}
