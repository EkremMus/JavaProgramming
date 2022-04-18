package day17_WhileDoWhile;

public class LoopPractice {

    public static void main(String[] args) {

        for (int i = 0; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        int j= 0;
        while (j<= 10){
            System.out.print(j + " ");
            j+=1;
        }
        System.out.println();
        System.out.println("------------------------------");

        int k= 0;
        do{
            System.out.print(k + " ");
            k++;
        }while (k<=10);



    }
}
