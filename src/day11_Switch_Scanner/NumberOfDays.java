package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int year =2000;
        int num= 12;
        String result= "";

        if (num >= 1 && num<=12) {

            switch (num) {
                case 2:
                    if (year %4 ==0){
                    result = "29 days";
                }else {
                        result = "28 days";
                    }
                break;

                case 4: case 6: case 9: case 11: result = "30 days";
                    break;

                default:
                    result = " 31 days";
            }

            }else{
                result = "Invalid number";
            }

        System.out.println(result);

    }
}
