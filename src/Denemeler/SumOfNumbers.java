package Denemeler;

public class SumOfNumbers {

    public static void main(String[] args) {

        double sum = 0; // 1+2+3+4.....

        for (int i = 1; i <101 ; i+=2) { // 1- 100
            sum +=i;

        }
        System.out.println(sum);
    }
}
