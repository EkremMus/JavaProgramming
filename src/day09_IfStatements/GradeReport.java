package day09_IfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int grade= 190;

        if (grade>=90 & grade<=100){
            System.out.println("A");
        }else if (grade>=80 & grade <=89){
            System.out.println("B");
        }else if(grade >=70 & grade <= 79){
            System.out.println("C");
        }else if (grade >= 60 & grade <= 69){
            System.out.println("D");
        }else {
            System.out.println("Failed");
        }
        System.out.println("-------------------------------------------");
        // Another Option
        int score1= 55;
        char grade1;

        if (score1>=90){
            grade1 = 'A';
        }else if (score1>=80){
            grade1 ='B';
        }else if(score1 >=70){
            grade1 = 'C';
        }else if (score1 >= 60){
            grade1 = 'D';
        }else {
            grade1 = 'F';
        }
        System.out.println("grade1 is " + grade1);

    }

}
