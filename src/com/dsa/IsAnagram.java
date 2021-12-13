package com.dsa;
import java.util.*;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        a =a.toLowerCase();
        b =b.toLowerCase();
        if (a.length() != b.length())  System.out.println(false);
        else{
            char[] tempArray1 = a.toCharArray();
            char[] tempArray2 = b.toCharArray();
            Arrays.sort(tempArray1);
            Arrays.sort(tempArray2);
            System.out.println( Arrays.equals(tempArray1,tempArray2) ? "Anagrams" : "Not Anagrams" );
        }
    }
}
