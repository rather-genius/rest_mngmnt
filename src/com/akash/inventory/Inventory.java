package com.akash.inventory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    public void getInventory() {
        try {
            FileReader inventory = new FileReader("resources\\Inventory.txt");
            BufferedReader br = new BufferedReader(inventory);
            List<String> inventoryList = br.lines().collect(Collectors.toList());

            HashMap<String,Double> ingredientPriceMap = new HashMap<>();
            HashMap<String,Integer> ingredientQuantityMap = new HashMap<>();




            for (String s:inventoryList) {
                ingredientPriceMap.put(getIngredientName(s),getPrice(s));
                ingredientQuantityMap.put(getIngredientName(s),getIngredientQuantity(s));

            }

        } catch (FileNotFoundException e) {
            System.out.println("invalid input");
            e.printStackTrace();
        }

    }

    //method to get the quantity i.e mmiddle part in the inventory file
    private static int getIngredientQuantity(String s1) {
        String[] parts = s1.split(" ");
        return Integer.parseInt(parts[1]);

    }


//method to get the ingredient  name
    private static String getIngredientName(String s1) {
        String[] parts = s1.split(" ");
        return parts[0];

    }

    private static double getPrice(String s1){
        String[] parts = s1.split(" ");
        return Double.parseDouble(parts[parts.length -1]);

    }
}
