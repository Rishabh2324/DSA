package com.dsa;

import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelaz ydogthequickbrownfoxjumpsoverthelazydogtheq uickbrownfoxjumpsoverthelazydogthequickbrownfoxjum psoverthelazydogthequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        boolean output = false;
        sentence = sentence.replaceAll("\\s", "");
        HashSet<Character> hash = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) hash.add(sentence.charAt(i));
        if (hash.size() == 26) output = true;
        return output;
    }
}
