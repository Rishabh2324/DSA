package com.dsa;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String content = in.next();
            System.out.println(content.matches(new MyRegex().ip0to255));
        }
    }
}

class MyRegex {
    String ip0to255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";

    public String pattern = ip0to255 + "." + ip0to255 + "." + ip0to255 + "." + ip0to255;

}