package com.dsa;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner P = new Scanner(System.in);
        Scanner R = new Scanner(System.in);
        Scanner T = new Scanner(System.in);
        System.out.println(calulateSimpleInterest(P.nextFloat(),R.nextFloat(),T.nextFloat()));
    }
    static float calulateSimpleInterest(float P,float R,float T){
        return (P*R*T)/100;
    }
}
