package com.dsa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    public static void main(String[] args){

    }
    static String destCity(List<List<String>> paths) {
        Set<String> set= new HashSet<>();
        for(List<String> l : paths) set.add(l.get(1));
        for(List<String> l : paths) set.remove(l.get(0));
        return set.iterator().next();
    }
}
