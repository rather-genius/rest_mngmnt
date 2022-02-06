package com.akash;


import com.akash.inventory.Inventory;
import com.akash.orders.CustomerOrder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class AppMain {

    public static void main(String[] args) throws FileNotFoundException {


        Scanner sc = new Scanner(System.in);

        for(int  i = 0; i <= 2; i++) {
            System.out.println("Enter Your Option");
            System.out.println("Command #1 : View Available Ingredients");
            System.out.println("Command #2 : Order Specific Ingredients");
            System.out.println("Command #3 : View Total Sales");
            System.out.println("Command #4 : View Total Expenses");
            System.out.println("Command #5 : View Net Profit" );
            System.out.println("Command #6 : Place Order");
            System.out.println("Command #7 : Exit Program");
            int option = sc.nextInt();
            switch (option) {
                case 1://View Available Ingredient
                    Inventory inventory = new Inventory();
                    List<HashMap> result = inventory.getInventory();
                    Set<Map.Entry<String, Integer>> entries = result.get(1).entrySet();

                    for (Map.Entry<String, Integer> entry : entries) {
                        System.out.println("Ingredient: " + entry.getKey() + " Quantity: " + entry.getValue());
                    }


                case 6:
                    CustomerOrder customerOrder = new CustomerOrder();
                    customerOrder.order("Sandwich",1);

            }
            System.out.println(" ");
        }


    }

    private static void getIngredientName(String s1) {
        String[] parts = s1.split(" ");
        String ingredient = parts[0];
        System.out.println(ingredient);
    }

    private static void getPrice(String s1) {
        String[] parts = s1.split(" ");
        int price = Integer.parseInt(parts[parts.length - 1]);
        System.out.println(price);
    }


    private static FileReader getReceipe() throws FileNotFoundException {
        try {
            FileReader receipe = new FileReader("resources\\Recipe.txt");
            BufferedReader br1 = new BufferedReader(receipe);
            List<String> str1 = br1.lines().collect(Collectors.toList());
            HashMap<String, Integer> map = new HashMap<>();
            for (String s1 : str1) {


            }

            System.out.println(str1);
            return receipe;


        } catch (FileNotFoundException e) {
            System.out.println("invalid input");
            e.printStackTrace();
        }
        return null;
    }
}

