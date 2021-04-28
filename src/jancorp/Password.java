package jancorp;

import java.util.Random;

public class Password {
    /*
    --- Position in array ---
    Special character   0
    Capital letter      1
    Special number      2
    Small letter        3
     */

    // Declaration of variable
    private char[] charTable;
    private final int mainCharacterCounter;

    Random rand = new Random();

    // Constructor
    public Password(int mainCharacterCounter) {
        // Using Validation Data Checking method to avoid errors
        this.mainCharacterCounter = mainCharacterCounter;
    }

    // Password generator
    public void generatePassword(){
        // Setting length of main array
        this.charTable = new char[mainCharacterCounter];
        String choice = Menu.specialCharacterTab();
        specialOptionManager(choice);
        for(int i = 4 ; i < this.charTable.length ; i++){
            this.charTable[i] = (char)(rand.nextInt(125 - 33) + 33);
        }
        for(int i = 0 ; i < this.charTable.length ; i++){
            int random = rand.nextInt(this.charTable.length);
            char buffer = this.charTable[random];
            this.charTable[random] = this.charTable[i];
            this.charTable[i] = buffer;
        }
        // Menu method
        Menu.answerApprove(mainCharacterCounter);
        printPassword();
    }
    // Special manager
    private void specialOptionManager(String choice){
        if(choice.charAt(0) == '1') specialCharacterInclude();
        else this.charTable[0] = (char)(rand.nextInt(125 - 33) + 33);
        if(choice.charAt(1) == '1') capitalCharacterInclude();
        else this.charTable[1] = (char)(rand.nextInt(125 - 33) + 33);
        if(choice.charAt(2) == '1') specialNumberInclude();
        else this.charTable[2] = (char)(rand.nextInt(125 - 33) + 33);
        if(choice.charAt(3) == '1') smallLetterInclude();
        else this.charTable[3] = (char)(rand.nextInt(125 - 33) + 33);
    }

    // Special character include
    private void specialCharacterInclude(){
        // Special characters ascii 33 - 47; 58 - 64; 91 - 96; 123 - 125
        int[] random = new int[4];
        random[0] = (rand.nextInt(47 - 33) + 33);
        random[1] = (rand.nextInt(64 - 58) + 58);
        random[2] = (rand.nextInt(96 - 91) + 91);
        random[3] = (rand.nextInt(125 - 123) + 123);
        int finalRandom = rand.nextInt(4);
        this.charTable[0] = (char)(random[finalRandom]);
    }

    // Capital letter include
    private void capitalCharacterInclude(){
        // Capital letters ascii 65 - 90
        this.charTable[1] = (char) (rand.nextInt(25) + 65);
    }

    // Special number include
    private void specialNumberInclude(){
        // Numbers ascii 48 - 57
        this.charTable[2] = (char) (rand.nextInt(9) + 48);
    }

    // Small letter include
    private void smallLetterInclude(){
        // Numbers ascii 97 - 122
        this.charTable[3] = (char) (rand.nextInt(25) + 98);
    }

    // Print password
    private void printPassword(){
        for(char item : charTable){
            System.out.print(item);
        }
        System.out.println();
    }
}
