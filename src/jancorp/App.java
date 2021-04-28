package jancorp;

import java.util.*;

public class App {
    // Password generator
    public static void main(String[] args) {
        String EXIT = "2";
        // Creating object od Scanner
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        // Main loop
        do{
            // Menu method
            Menu.menu();
            // Switch
            final String input = scan.next();
            // Comparing to Enum
            if(EXIT.equals(input)){
                exit = true;
            }
            else{
                // Error validation
                try{
                    // If no error detected
                    // Menu method
                    Menu.answerOne();
                    final int inputs = scan.nextInt();
                    Password pass = new Password(inputs);
                    pass.generatePassword();
                }catch(InputMismatchException e){
                    // Error detected
                    // Menu method
                    Menu.answerError();
                }
            }
        }while (!exit);
    }
}