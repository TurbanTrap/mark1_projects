package Shoppingportal;
import java.util.ArrayList;

public class introfunction {

    public introfunction(){

        ArrayList<String> wineshop = new ArrayList<String>();
        wineshop.add("            :  WINESHOP : " + "\nBlack & white(1)");
        wineshop.add("Old Monk(2)");
        wineshop.add("Jack Daniels(3)"+"\n");

        ArrayList<String> fruitshop = new ArrayList<String>();
        fruitshop.add("           :  FRUITSHOP : " + " \nMango(1)");
        fruitshop.add("Grapes(2)");
        fruitshop.add("Watermelon(3)"+"\n");


        ArrayList<String> groceryshop = new ArrayList<String>();
        groceryshop.add("          :  GROCERY SHOP : " + "\nMaggie(1)");
        groceryshop.add("Soya Sauce(2)");
        groceryshop.add("Cookies(3)"+"\n");

        //LIST OF ARRAYLIST TO DISPLAY AS 2D
        ArrayList<ArrayList<String>> bulk = new ArrayList();
        bulk.add(wineshop);
        bulk.add(fruitshop);
        bulk.add(groceryshop);

        System.out.println("             DN REGALIA          ");
        System.out.println("    Which Section Do You want to Visit ??   ");


        for (int i = 0; i < bulk.size(); i++) {
            System.out.println(bulk.get(i));
        }


    }



}
