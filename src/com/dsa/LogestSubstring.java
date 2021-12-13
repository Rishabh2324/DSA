package com.dsa;

import java.util.HashMap;
import java.util.Scanner;

public class LogestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inpString = new String(sc.next());
        System.out.println(lengthOfLongestSubstring(inpString));

    }
    static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        else {
            String uniqueString = new String();
            for (int i = 0; i < s.length(); i++) {
                if (uniqueString.indexOf(s.charAt(i)) >= 0) break;
                else uniqueString += s.charAt(i);
            }
            return uniqueString.length();
        }
    };
}
