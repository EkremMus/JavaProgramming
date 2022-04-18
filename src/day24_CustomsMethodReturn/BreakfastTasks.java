package day24_CustomsMethodReturn;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Ekrem", "Mus"); //E.M

        System.out.println("---------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("---------------------------------------");

        nameOfMonth(4);

        System.out.println("-----------------------------------------");

        nameOfDay(4);



    }


    // Create a method that can display the initials of the person

    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }

    // Create a method that can display the domain of the email domain (String email)

    public static void domain(String email) { //cydeo@gmail.com
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    // Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr"
                    : (number == 5) ? "May" : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug"
                    : (number == 9) ? "Sep" : (number == 10) ? "Oct" : (number == 11) ? "Nov" : "Dec";

        } else {
            name = "Invalid";
        }
        System.out.println("Month name = " + name);

    }

    // Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String name = "";
        if (number >=1 && number <=7){
            name = (number == 1)? "Monday" : (number == 2)? "Tuesday" : (number == 3)? "Wednesday"
                    : (number == 4)? "Thursday" : (number == 5)? "Friday" : (number == 6)? "Saturday"
                    : "Sunday";
        }else{
            name = "Invalid";
        }
        System.out.println("Week name = " + name);

    }



    // Create a method that can print how many days a month has

    }

