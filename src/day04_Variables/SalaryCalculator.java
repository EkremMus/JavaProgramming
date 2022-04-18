package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        // HourlyRate, WeeklyHours

        int HourlyRate = 55;
        int WeeklyHours = 40;
        int NumberOfWeeks= 52;

        int salary = HourlyRate * WeeklyHours * NumberOfWeeks;

        System.out.println("HourlyRate = $" + HourlyRate);
        System.out.println("WeeklyHours = " + WeeklyHours);
        System.out.println("NumberOfWeeks = " + NumberOfWeeks);
        System.out.println("salary = $" + salary);


    }

}
