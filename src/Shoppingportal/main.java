package Shoppingportal;

import java.util.ArrayList;
import java.util.Scanner;

//Multiple arraylists at a single instance.
public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //creating multiple arraylists


        ArrayList<String> wineshop = new ArrayList<String>();
        wineshop.add("            :  WINESHOP : " + "\nBlack & white(1)");
        wineshop.add("Old Monk(2)");
        wineshop.add("Jack Daniels(3)");

        ArrayList<String> fruitshop = new ArrayList<String>();
        fruitshop.add("           :  FRUITSHOP : " + " \nMango(1)");
        fruitshop.add("Grapes(2)");
        fruitshop.add("Watermelon(3)");

        ArrayList<String> groceryshop = new ArrayList<String>();
        groceryshop.add("          :  GROCERY SHOP : " + "\nMaggie(1)");
        groceryshop.add("Soya Sauce(2)");
        groceryshop.add("Cookies(3)");

//LIST OF ARRAYLIST TO DISPLAY AS 2D
        ArrayList<ArrayList<String>> bulk = new ArrayList();
        bulk.add(wineshop);
        bulk.add(fruitshop);
        bulk.add(groceryshop);
        System.out.println("             DN REGALIA          ");
        System.out.println("    Which Section Do You want to Visit ??   ");
        //to display list of lists
        for (int i = 0; i < bulk.size(); i++) {
            System.out.println(bulk.get(i));
        }
        String cust = scanner.next();
        cust = cust.toUpperCase();


            if (cust.equals("FRUITSHOP"))
        {
            for (int i = 0; i < fruitshop.size(); i++)
                System.out.println(fruitshop.get(i));}
           else if (cust.equals("GROCERYSHOP")) {
                for (int i = 0; i < groceryshop.size(); i++)
                    System.out.println(groceryshop.get(i));}
           else if (cust.equals("WINESHOP")) {
                for (int i = 0; i < wineshop.size(); i++)
                {
                System.out.println(wineshop.get(i));
            }

                    System.out.println("");
                    System.out.println("");
                    System.out.println("Enter Values As per Your Product Tag .");
                    int userlist = scanner.nextInt();
                    switch (userlist) {
                        case 1:
                            blackandwhite bw = new blackandwhite();
                            break;
                        case 2:
                            Oldmonk olmnk = new Oldmonk();
                            break;
                        case 3:
                            Jackdaniels jack = new Jackdaniels();
                            break;


                    }
                }
            }}











