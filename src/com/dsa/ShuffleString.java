package com.dsa;

public class ShuffleString {
    public static void main(String[] args) {
       String s = "aiohn";
       int[] indices = {3,1,4,2,0};
       System.out.println(restoreString(s,indices));
    }

    static String restoreString(String s, int[] indices) {
        String outputString = "";
        char ch[] = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            char temp =  s.charAt(i);
            ch[i] = s.charAt(indices[i]);
            ch[indices[i]] = temp;
        }
        return new String(ch);
    }
}
