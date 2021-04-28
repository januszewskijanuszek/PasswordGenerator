package jancorp;

import java.util.Random;

public class Password {
    // Declaration of variable
    private static final String EMPTY = "";
    private char[] charTable;
    private final int mainCharacterCounter;

    // Constructor
    public Password(int mainCharacterCounter) {
        // Using Validation Data Checking method to avoid errors
        this.mainCharacterCounter = mainCharacterCounter;
    }

    // Password generator
    public void generatePassword(){
        // Setting length of main array
        this.charTable = new char[mainCharacterCounter];
        Random rand = new Random();
        for(int i = 0; i < this.charTable.length ; i++){
            // Menu method
            // Randomising all characters
            this.charTable[i] = (char)(rand.nextInt(92) + 33);
        }
        // Menu method
        Menu.answerApprove(mainCharacterCounter);
        printPassword();
    }

    // Special character include
    //private void specialCharacter

    // Print password
    private void printPassword(){
        for(char item : charTable){
            System.out.print(item);
        }
        System.out.println("");
    }
}
