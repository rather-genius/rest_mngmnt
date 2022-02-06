import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderPlacement {
    Inventory in = new Inventory();
    AccountManagement am = new AccountManagement();
    int count =0;
    Scanner sc=new Scanner(System.in);
    String orderStr= sc.next();
    int quantity = sc.nextInt();
    Map<String, Integer> placedOrder = new HashMap<>();
    public void placeOrder() {



        boolean sufficientIngridients=true;
        if(sufficientIngridients==true) {
            System.out.println("Order Placed");
            double account = am.getAccountDetails() + in.recipePriceMap.get(orderStr);
            placedOrder.put(orderStr, quantity);
            //count=count++;
        }
        else{
            System.out.println("Insufficient Ingridients, If you wish to continue enter yes");
            String str= sc.nextLine();
            if(str.equalsIgnoreCase("yes")){
                placeOrderIngridients();
            }
            else if(str.equalsIgnoreCase("no")){
                mainMenu();
            } else {
                System.out.println("Enter Yes/No");
            }
        }
    }

    public void placeOrderIngridients() {

    }

    public void totalSales() {
        System.out.println("Total dishes sold so far" + placedOrder.size());
        for (int i = 0; i < placedOrder.size() - 1; i++) {
            System.out.println(placedOrder.entrySet());
        }
    }

    public void mainMenu() {
        System.out.println("""
                1. View Available Ingredients
                2. Order Specific Ingredients
                3. View Total Sales
                4. View Total Expenses
                5. View Net Profit
                6. Place Order
                7. Exit from the program
                """);
    }

}
