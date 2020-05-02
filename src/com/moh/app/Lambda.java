package com.moh.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {

        List<Double> integers = Arrays.asList(1.4,1.4,13.1);
        //a for loop in a lambda format

        integers.forEach(i -> System.out.println(i));
        //regular for loop
        for (double i : integers) {
            System.out.println(i);
        }

    }


}
