package Shoppingportal;

import Shoppingportal.groceryshop.cookies;
import Shoppingportal.groceryshop.maggie;
import Shoppingportal.groceryshop.soyasauce;

import java.util.ArrayList;
import java.util.Scanner;

public class callfunction3 {

    public callfunction3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 3 to Enter Grocery Sale (30%)off");
        int cust = scanner.nextInt();


        ArrayList<String> groceryshop = new ArrayList<String>();
        groceryshop.add("          :  GROCERY SHOP : " + "\nMaggie(1)");
        groceryshop.add("Soya Sauce(2)");
        groceryshop.add("Cookies(3)");


        switch (cust) {
            case 3:
                for (int i = 0; i < groceryshop.size(); i++) {
                    System.out.println(groceryshop.get(i));
                }
                System.out.println("Enter Values As per Your Product Tag .");
                int userlist2 = scanner.nextInt();

                switch (userlist2) {
                    case 1:
                        maggie mag = new maggie();
                        break;

                    case 2:
                        soyasauce soya = new soyasauce();
                        break;


                    case 3:
                        cookies cook = new cookies();
                        break;

                }


        }


    }}
