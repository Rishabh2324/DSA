package com.dsa;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println(numJewelsInStones(jewels,stones));
    }
    static int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) if ( jewels.indexOf(stones.charAt(i)) != -1) counter +=1;
        return  counter;
    };
}
