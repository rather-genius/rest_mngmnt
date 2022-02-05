package com.akash.inventory;

import java.io.FileReader;
import java.io.IOException;

public class Inventory {
    public void getInventory() {
        try {
            FileReader reader = new FileReader("resources//Inventory.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();


        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}
