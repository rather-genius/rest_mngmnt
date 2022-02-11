package com.akash.orders;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class CustomerOrder {

    Scanner scan = new Scanner(System.in);
    String dish = scan.next();
    int quantity = scan.nextInt();

    public void order(String dish, int quantity) throws FileNotFoundException {
        FileReader recipe = new FileReader("resources//Recipe.txt");
        BufferedReader br = new BufferedReader(recipe);
        List<String> availableDishes = br.lines().collect(Collectors.toList());
        HashMap<String,Integer> placeOrder = new HashMap();


        for (String s : availableDishes) {
            if (getDishName(s).equals(dish)){
                int i =1;
                String[] parts = s.split(" ");
                int size = parts.length;
                while(i<=size-3){
                    placeOrder.put(getIngredientDetails(s,i),Integer.parseInt(getIngredientDetails(s,i+1)));
                    i+=2;
                }
                double cost = quantity * getPrice(s);
                System.out.println(" your order is placed");

            }
            else {
                System.out.println("Dish Not Found");
            }

            }



        }


    private String getIngredientDetails(String s,int i) {
        String[] parts = s.split(" ");
        String var  = parts[i];
        return var;
    }

    private double getPrice(String s) {
        String[] parts = s.split(" ");
        int price = Integer.parseInt(parts[parts.length - 1]);
        return price;
    }

    private String getDishName(String str) {
        String[] parts = str.split(" ");
        String dish = parts[0];
        return dish;
    }
}
