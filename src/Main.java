import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        while(true) {
       Inventory invnt= new Inventory();
       OrderPlacement op=new OrderPlacement();
       Scanner sc=new Scanner(System.in);
        op.mainMenu();
            int option=sc.nextInt();
            switch(option){
                case 1:invnt.getInventory();
                case 2:
                case 3:op.totalSales();
                case 4:
                case 5:
                case 6:
                case 7:break;


            }
        }
    }
}
