package ooplab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {

        SuperCar s = new SuperCar();
        s = inputData(s);
        s.getSuperCarinfo (s);
    }

    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter SuperCar info:");
        System.out.print("Enter SuperCar carbrand:");
        s.setCarbrand(scanner.nextLine());
        System.out.print("Enter SuperCar carcolor:");
        s.setCarcolor(scanner.nextLine());
        System.out.println("Enter SuperCar Carenginesize:");
        s.setCarenginesize(scanner.nextLine());
        System.out.println("Enter SuperCar Maxspeed:");
        s.setMaxspeed(scanner.nextLine());
        System.out.println("Enter SuperCar countryoforigin:");
        s.setCountryoforigin(scanner.nextLine());
        return s;
    }


}