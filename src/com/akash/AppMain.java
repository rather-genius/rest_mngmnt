package com.akash;

import com.akash.accounts.Accounts;
import com.akash.inventory.Inventory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                Inventory inventory = new Inventory();
                inventory.getInventory();
            case 2:

        }
        Accounts account1 = new Accounts();
        account1.getAccountsDetails();


        //getInventory();
//        String s1 = "Rice 10 50";
//        getPrice(s1);
//        getIngredientName(s1);
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




    public void getReceipes(){

        FileReader reader1 = null;
        try {
            reader1 = new FileReader("resources//Receipe.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int data1 = 0;
        try {
            data1 = reader1.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(data1 != -1){
            System.out.print((char)data1);
            try {
                data1 = reader1.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




    private static FileReader getReceipe(String sandwich) throws FileNotFoundException {
        try {
            FileReader receipe = new FileReader("resources\\Receipe");
            BufferedReader br1 = new BufferedReader(receipe);
            String str1 = br1.readLine();
            System.out.println(str1);
            return receipe;


        } catch (FileNotFoundException e) {
            System.out.println("invalid input");
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}

