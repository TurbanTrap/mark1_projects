package Shoppingportal.Products.fruitshop;

import Shoppingportal.Functions.main;

import java.util.Scanner;

public class watermelon extends main {

    public watermelon(){



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no(s) of Watermelon/s .");
        int liq2244 = scanner.nextInt();
        System.out.println(liq2244 + " no(s)Watermelon has been added to your cart.");
        System.out.println("Bill amount (100 per piece ) : " +  liq2244*100+"Rs" );
        System.out.println("Thank You For Your Purchase");
    }
}
