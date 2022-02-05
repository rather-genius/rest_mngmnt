import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccountManagement {
    public double getAccountDetails() {
         double account=0.0;
        try {
            FileReader fr = new FileReader("resources\\accounts.txt");
            BufferedReader br = new BufferedReader(fr);
            String str = br.readLine();
            account = Double.parseDouble(str);


        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
            ex.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return account;
    }
}
