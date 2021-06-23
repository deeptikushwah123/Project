package com;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hashmapexample {

    public static void main(String args[])
    {
        HashMap h= new HashMap();
        h.put("jayant" ,80 );
        h.put("anushka" , 80);
        h.put("amit" ,null );

        h.put("Abhishek" , 90);
        TreeMap< String , Integer> t= new TreeMap<>(h);
        System.out.println(t);

        final Runnable ghh = () ->
        {
            System.out.println("ghh");
        };

    }
}
