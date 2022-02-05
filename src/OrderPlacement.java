import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderPlacement {
    AccountManagement am=new AccountManagement();
    int count =0;
    Scanner sc=new Scanner(System.in);
    String orderStr= sc.next();
    Orders order= Orders.valueOf(orderStr);
    int quantity=sc.nextInt();
    Map<Orders, Integer> placedOrder=new HashMap<>();
    public void placeOrder() {



        boolean sufficientIngridients=true;
        if(sufficientIngridients==true){
               System.out.println("Order Placed");
                double account= am.getAccountDetails()+ order.getPrice();
                placedOrder.put(order,quantity);
                count=count++;
        }
        else{
            System.out.println("Insufficient Ingridients, If you wish to continue enter yes");
            String str= sc.nextLine();
            if(str.equalsIgnoreCase("yes")){
                placeOrderIngridients();
            }
            else if(str.equalsIgnoreCase("no")){
                mainMenu();
            }
            else{
                System.out.println("Enter Yes/No");
            }
        }
    }

    public void placeOrderIngridients(){

    }
    public void mainMenu(){
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
    public void totalSales(int count){
        System.out.println("Total dishes sold so far"+ count);
        for(int i=0;i<placedOrder.size()-1;i++){
            System.out.println(placedOrder.entrySet());
        }
    }

}
