package jancorp;

import java.util.Scanner;

public class Menu {
    // Menu void
    static public void menu(){
        System.out.println("Chose:");
        System.out.println("1 - Generate password");
        System.out.println("2 - Exit");
    }

    // Special character tab
    static public String specialCharacterTab(){
        // Strings
        String done = "5 - Done";

        // Classes
        Scanner scan = new Scanner(System.in);
        SpecialOption capitalLetter     = new SpecialOption("1 - Capital letter");
        SpecialOption specialCharacter  = new SpecialOption("2 - Special character");
        SpecialOption specialNumber     = new SpecialOption("3 - Special number");
        SpecialOption smallLetter     = new SpecialOption("4 - Small letter");

        // Other
        boolean exit = false;
        String finalReturn = "";

        // Menu
        do{
            // Printing menu
            System.out.println("Special characters: ");
            System.out.println(capitalLetter.getContent());
            System.out.println(specialCharacter.getContent());
            System.out.println(specialNumber.getContent());
            System.out.println(smallLetter.getContent());
            System.out.println(done);

            // Input user choice
            String input = scan.next();
            switch (input){

                // Case 1
                case "1":{
                    // CapitalLetter change statement
                    capitalLetter.changeCondition();
                    break;
                }

                // Case 2
                case "2":{
                    // Special character change statement
                    specialCharacter.changeCondition();
                    break;
                }

                // Case 3
                case "3":{
                    // Special number change statement
                    specialNumber.changeCondition();
                    break;
                }

                // Case 4
                case "4":{
                    // Small letter change statement
                    smallLetter.changeCondition();
                    break;
                }

                // Any other character
                default:{
                    exit = true;
                }
            }
        }while(!exit);
        if(specialCharacter.isCondition()) finalReturn += "1";
        else finalReturn += "0";
        if(capitalLetter.isCondition()) finalReturn += "1";
        else finalReturn += "0";
        if(specialNumber.isCondition()) finalReturn += "1";
        else finalReturn += "0";
        if(smallLetter.isCondition()) finalReturn += "1";
        else finalReturn += "0";
        return finalReturn;
    }

    // Text 1
    static public void answerApprove(int input){
        System.out.println("Generated password: " + input);
    }

    // Text 2
    static public void answerOne(){
        System.out.println("Password length: ");
    }

    // Error case
    static public void answerError(){
        System.out.println("Type correct data format");
    }

    static public void amountOfCharacters(){
        System.out.println("Password must have " + 3 + " characters");
    }
}
