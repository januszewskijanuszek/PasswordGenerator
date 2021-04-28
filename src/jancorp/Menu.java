package jancorp;

import java.util.Scanner;

public class Menu {
    // Enums
    private static final String EMPTY = "";
    private static final String STAR = "-> ";

    // Menu void
    static public void menu(){
        System.out.println("Chose:");
        System.out.println("1 - Generate password");
        System.out.println("2 - Exit");
    }

    // Special character tab
    static public String specialCharacterTab(){
        // Strings
        String done = "3 - Done";

        // Classes
        Scanner scan = new Scanner(System.in);
        SpecialOption capitalLetter     = new SpecialOption("1 - Capital letter");
        SpecialOption specialCharacter  = new SpecialOption("2 - Special character");

        // Other
        boolean exit = false;

        // Menu
        do{
            // Printing menu
            System.out.println("Special characters: ");
            System.out.println(capitalLetter.getContent());
            System.out.println(specialCharacter.getContent());
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

                // Any other character
                default:{
                    exit = true;
                }
            }
        }while(!exit);
        if(specialCharacter.isCondition() && capitalLetter.isCondition())
            return "11";
        else if(specialCharacter.isCondition())
            return "10";
        else if(capitalLetter.isCondition())
            return "01";
        else
            return "00";
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
}
