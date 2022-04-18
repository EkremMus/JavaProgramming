package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment: =

        int number = 100;

        System.out.println("number = " + number); //100

        number =200;
        System.out.println("number = " + number); //200

        String word ="Java Programming";

        System.out.println("word = " + word);

        word = " Hello";

        System.out.println("word = " + word);

        word = "Cydeo";

        System.out.println("word = " + word);


        System.out.println("----------------------------------------------");

        int x=100;

        System.out.println("x = " + x);

        //x=x+200;
        x+=200;
        System.out.println("x = " + x);

        String str="Wooden";

        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;

        num1 += 5.5; //8.0

        double availableBalance = 1000.5;
        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("-----------------------------------------");

        // withdrawing 500$ from you account

        availableBalance -=500;

        // withdrawing 200$ then 400$ depositing

        availableBalance -=200; //600.5$

        availableBalance +=400; // 1000.5$

        double salary = 50000.50;
        System.out.println("salary = " + salary);
        
        salary *= 2;
        System.out.println("salary = " + salary);
        
        double dodge = 0.000001;
        
        dodge *= 1000000;

        System.out.println("dodge = " + dodge);

        System.out.println("--------------------------------------------------");

        int num2= 25000;
        num2 /=2;

        System.out.println("num2 = " + num2);

        System.out.println("-------------------------------------------------");

        double num3 = 100;

        num3 %= 3;

        System.out.println("num3 = " + num3);

        System.out.println("------------------------------------------");

        int amount = 127; // cents

        int quarters =127/ 25;

        int cents = 127%25;

        System.out.println("cents = " + cents);

        System.out.println("-----------------------------------------------");
        
        int y= 300;
        
        y %=16;

        System.out.println("y = " + y);


    }
}
