package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 13.7;
        double euro = dollar * 1.16;
        //jpy, pound, peso, cad, riyal

        double jpy = dollar * 114.14;
        double pound = dollar * 0.73;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);

    }
}
