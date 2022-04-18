package day10_NestedIfTernaries;

public class GradeReport2 {

    public static void main(String[] args) {
    // Solution1
        /*
        if(score>= 0 && score <=100){

            if (score>=90){
                System.out.println("Excellent");
            }else if(score>=80) {
                System.out.println("Great");
            }else if (score>=70){
                System.out.println("Good");
            }else if (score >=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{ // if the score is invalid
            System.out.println("Invalid score");
        }
        */

        System.out.println("-----------------------------------------------");
        // Solution2
        int s = 100;

       String result= (s>=0 && s<= 100)? (s>=90)?"Excellent" :(s>=80)?"Great" :(s>=70)?"Good" :(s>=60)?"Passed" :
                    "Failed" : "Invalid score";

        System.out.println(result);

        System.out.println("-----------------------------------");

        // Solution3



    }
}
