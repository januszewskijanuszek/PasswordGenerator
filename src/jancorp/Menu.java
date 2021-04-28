package jancorp;

public class Menu {
    // Menu void
    static public void menu(){
        System.out.println("Chose:");
        System.out.println("1 - Generate password");
        System.out.println("2 - Exit");
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
