package com.dsa;

public class BalancedStrings {
    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        System.out.println(balancedStringSplit(s));
    }
    static int balancedStringSplit(String s) {
        int outputCounter = 0;
        int rCount = 0;
        int lCount = 0;
        if (s.length() == 0 || s.length() == 1 ) return 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') rCount +=1;
            if (s.charAt(i) == 'L') lCount +=1;
            if (rCount > 0 && lCount > 0  && rCount == lCount) {
                outputCounter += 1;
                rCount = 0;
                lCount = 0;
            }
        }
        return outputCounter;
    };
}
