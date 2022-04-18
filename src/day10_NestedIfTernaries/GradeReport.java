package day10_NestedIfTernaries;

public class GradeReport {

    public static void main(String[] args) {

        int score = 195;

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


        System.out.println("----------------------------------------------------");

        //ORRRR

        int score1 = 95;

        String result =""; // temporary

        if(score1>= 0 && score1 <=100){

            if (score1>=90){
                result ="Excellent";
            }else if(score1>=80) {
                result = "Great";
            }else if (score1>=70){
                result = "Good";
            }else if (score1 >=60){
                result = "Passed";
            }else{
                result = "Failed";
            }
        }else{ // if the score is invalid
            result = "Invalid score";
        }

        System.out.println(result);
    }
}


