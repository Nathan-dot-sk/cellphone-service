package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args){

        //create the phone
        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);

        /*
        What is the serial number? 2597153
        What model is the phone? iPhone 15 Pro Max
        Who is the carrier? Verizon
        What is the phone number? 888-555-1234
        Who is the owner of the phone? Sandra
         */

        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestion(input, "What is your serial number") ));
        newPhoneWhoDis.setModelNumber(askQuestion(input, "what model is the phone"));
        newPhoneWhoDis.setCarrierNumber(askQuestion(input, "who is your carrier"));
        newPhoneWhoDis.setPhoneNumber(askQuestion(input, "what is the phone number"));
        newPhoneWhoDis.setOwner(askQuestion(input, "who is the owner of the phone"));

        System.out.println(newPhoneWhoDis.getSerialNumber());
        System.out.println(newPhoneWhoDis.getModelNumber());
        System.out.println(newPhoneWhoDis.getCarrierNumber());
        System.out.println(newPhoneWhoDis.getPhoneNumber());
        System.out.println(newPhoneWhoDis.getOwner());

    }
    public static String askQuestion(Scanner scanner, String question){
        System.out.println(question + ":");
        return scanner.nextLine().trim();
    }
}
