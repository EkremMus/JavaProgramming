package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Ekrem Mus",
                buildingNumber = "11828B",
                streetName = "Janes Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode ="22035";

        //System.out.println(name + "\n" + buildingNumber+ " " + streetName + "\n" + city + ", " + state + " " + zipCode);

        String address = name + "\n" + buildingNumber+ " " + streetName + "\n" + city + ", " + state + " " + zipCode;

        System.out.println(address);


    }
}
