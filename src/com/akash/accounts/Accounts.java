package com.akash.accounts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Accounts {
    public double getAccountsDetails() {
        double account = 0.0;
        try {
            FileReader fr = new FileReader("resources\\accounts.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            System.out.println(str);
            account = Double.parseDouble(str);
            return account;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return account;
    }
}
