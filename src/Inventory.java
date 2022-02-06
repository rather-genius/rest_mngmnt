import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Inventory {
    List<String> inventoryList = new ArrayList<>();
    Map<String, Integer> ingredientQuantityMap = new HashMap<>();
    Map<String, Integer> inventoryPriceMap = new HashMap<>();
    List<String> recipeIngridientPrice = new LinkedList<>();
    Map<String, Integer> recipePriceMap = new HashMap<>();

    public void getInventory() {
        try {
            FileReader fr = new FileReader("resources\\Inventory.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null) {
                inventoryList.add(str);
            }
            //System.out.println(inventoryList);
            for (int i = 0; i < inventoryList.size(); i++) {
                String[] invntPrice = inventoryList.get(i).split(" ");
                ingredientQuantityMap.put(invntPrice[0], Integer.valueOf(invntPrice[1]));
                inventoryPriceMap.put(invntPrice[0], Integer.valueOf(invntPrice[2]));

            }
            System.out.println(ingredientQuantityMap.entrySet());
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void recipePrice() {
        try {
            FileReader fr = new FileReader("resources\\Inventory.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null) {
                recipeIngridientPrice.add(str);
            }
            for (int i = 0; i < recipeIngridientPrice.size(); i++) {
                String[] recipe = recipeIngridientPrice.get(i).split(" ");
                recipePriceMap.put(recipe[0], Integer.valueOf(recipe[recipe.length - 1]));
            }
            System.out.println(recipePriceMap.entrySet());
        } catch (IOException ioex) {
            ioex.getMessage();
        }
    }

}
