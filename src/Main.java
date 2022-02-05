import java.util.Scanner;

public class Main {
    public static void main(String[] args){

       OrderPlacement op=new OrderPlacement();
       Scanner sc=new Scanner(System.in);

        boolean entry=true;
        while(entry==true) {
            op.mainMenu();
            int option=sc.nextInt();
            switch(option){
                case 1:
                    //view ingridients after reading from text file
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    entry=false;

            }
        }
    }
}
