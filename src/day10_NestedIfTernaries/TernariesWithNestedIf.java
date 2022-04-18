package day10_NestedIfTernaries;

public class TernariesWithNestedIf {

    public static void main(String[] args) {

        int s = 98;

        /*
        if (s >=0 && s<= 100){

            if (s>=60){
                System.out.println("Passes");
            }else{
                System.out.println("Failed");
            }
        }else {
            System.out.println("Not a valid score");
        }
         */

        String score = (s>=0 && s <=100)? (s >=60)? "Passed" : "Failed" : "Invalid score";
        System.out.println(score);





    }
}
