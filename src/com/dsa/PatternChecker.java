package com.dsa;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        in.nextLine(); // gets rid of the pesky newline.
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(Exception e) {
                System.out.println("InValid");
            }
            testCases--;
        }

    }
}
