package com.akash;


import com.akash.inventory.Inventory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppMain {

    public static void main(String[] args) throws FileNotFoundException {



       Scanner sc = new Scanner(System.in);
       System.out.println("enter the value");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                Inventory inventory = new Inventory();
                inventory.getInventory();
            case 2:

       }
//        Accounts account1 = new Accounts();
//        account1.getAccountsDetails();



        String s1 = "Rice 10 50";
        getPrice(s1);
        getIngredientName(s1);
    }

    private static void getIngredientName(String s1) {
        String[] parts = s1.split(" ");
        String ingredient = parts[0];
        System.out.println(ingredient);
    }

    private static void getPrice(String s1){
         String[] parts = s1.split(" ");
         int price = Integer.parseInt(parts[parts.length -1]);
        System.out.println(price);
    }







    private static FileReader getReceipe() throws FileNotFoundException {
        try {
            FileReader receipe = new FileReader("resources\\Receipe.txt");
            BufferedReader br1 = new BufferedReader(receipe);
            List<String> str1 = br1.lines().collect(Collectors.toList());
            HashMap<String,Integer> map = new HashMap<>();
            for (String s1:str1) {


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

