package Shoppingportal.groceryshop;

import Shoppingportal.main;

import java.util.Scanner;

public class maggie extends main {

    public maggie(){


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no(s) of Maggie/s.");
        int liq223366 = scanner.nextInt();
        System.out.println(liq223366+ " no(s)Maggie has been added to your cart.");
        System.out.println("Bill amount (10 per piece ) : " +  liq223366*10+"Rs" );
        System.out.println("Thank You For Your Purchase");

    }
}
