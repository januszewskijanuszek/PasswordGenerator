package jancorp;

public class SpecialOption {
    // Enums
    private static final String EMPTY = "";
    private static final String STAR = "-> ";

    private boolean condition;
    private String content;

    public SpecialOption(String content) {
        this.condition = false;
        this.content = content;
    }

    public void changeCondition(){
        // If condition is true
        if(condition){
            // Than change it to false
            condition = false;
            // And add take pointer
            content = content.replaceFirst(STAR, EMPTY);
        }
        // If condition id false
        else{
            // Than change it to true
            condition = true;
            // And add pointer
            content = STAR + content;
        }
    }

    public String getContent() {
        return content;
    }

    public boolean isCondition() {
        return condition;
    }
}
