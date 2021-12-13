package com.dsa;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String testString= "G()(al)";
        System.out.println(interpret(testString));
    }
    static String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    };
}
