package Denemeler;
import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        //WRITE YOUR CODE HERE:

        if(a>b){
            System.out.println("a is bigger than b");
        }else
            System.out.println("b is bigger than a");

        System.out.println("-------------------------------");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = in.nextInt();

        if (input % 2 ==0){
            System.out.println (input + " is even");
        }else{
            System.out.println ( input + " is odd");
        }

    }
}
