package Denemeler;

public class PatientInfo {

    public static void main(String[] args) {


        String word = "Java";

        System.out.println("Today's word of the day is: " + word);
        
        String first = "55", second = "123";

        System.out.println("first is 55"+ " and second is 123");
        System.out.println("first is -124"+ " and second is -500");

        //Output: first is -124 and second is -500

        System.out.println("I will learn \"Java\" and \"SQL\" at CybertekSchool.");
        System.out.println("I \"");


        System.out.println("---------------------------------------");

        System.out.println("Welcome to the patient portal!");

        String firstName = "James";
        String lastName = "May";
        String fullName = lastName + "," +firstName;
        String email ="jamesmay@gmail.com";
        String street = "7925 Jones Branch Dr";
        String state = "VA";
        String city = "McLean";
        String address = "fullName + street + state + city +zipcode";
        String contacts = "workPhoneNumber + personalPhoneNumber + email";

        int age = 35, zipcode = 222102;
        double height = 5.10, weight = 173.2;
        boolean isMarried = true;
        long workPhoneNumber = 7896542314l, personalPhoneNumber = 2406542314l;

        System.out.println("Patient personal information " + fullName + " Address: 7925 Jones Branch Dr, McLean, VA 22102"
                + "\n" + "Contacts: " + "work phone number - " +workPhoneNumber + ", personal phone number - "
                + personalPhoneNumber+ "," + " email: " + "\n" + email + " Age:" + age + " Height:"+ height + " Weight:"+
                weight + " pounds"+ " Married?: " +isMarried);
    }
}
