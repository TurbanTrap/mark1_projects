package Shoppingportal.Functions;

import Shoppingportal.Products.fruitshop.grapes;
import Shoppingportal.Products.fruitshop.mango;
import Shoppingportal.Products.fruitshop.watermelon;

import java.util.ArrayList;
import java.util.Scanner;

public class callfunction2 extends main{
    public static void main(String[] args) {

    }

    public callfunction2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 2 to avail 20% off on !! ");
        int cust = scanner.nextInt();
        ArrayList<String> fruitshop = new ArrayList<String>();
        fruitshop.add("           :  FRUITSHOP : " + " \nMango(1)");
        fruitshop.add("Grapes(2)");
        fruitshop.add("Watermelon(3)");


        switch (cust) {
            case 2:
                for (int i = 0; i < fruitshop.size(); i++) {
                    System.out.println(fruitshop.get(i));
                }
                System.out.println("");
                System.out.println("");
                System.out.println("Enter Values As per Your Product Tag .");
                int userlist = scanner.nextInt();

                switch (userlist) {
                    case 1:
                        mango man = new mango();
                        break;
                    case 2:
                        grapes gra = new grapes();

                        break;
                    case 3:
                        watermelon wat = new watermelon();

                }


        }


    }}
