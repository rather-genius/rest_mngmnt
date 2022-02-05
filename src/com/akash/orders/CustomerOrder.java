package com.akash.orders;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class CustomerOrder {

    public void Order(String recipe, int quantity) {
        try {
            FileReader reader = new FileReader("resources//Recipe.txt");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void getPrice(String s1){

        String[] parts = s1.split(" ");
        int price = Integer.parseInt(parts[parts.length -1]);
        System.out.println(price);
    }
}

