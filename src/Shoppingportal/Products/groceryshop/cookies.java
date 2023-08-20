package Shoppingportal.Products.groceryshop;

import Shoppingportal.Functions.main;

import java.util.Scanner;

public class cookies extends main {

    public cookies(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no(s) of Cookie/s.");
        int liq223355 = scanner.nextInt();
        System.out.println(liq223355 + " no(s)Cookie has been added to your cart.");
        System.out.println("Bill amount (30 per piece ) : " +  liq223355*30+"Rs" );
        System.out.println("Thank You For Your Purchase");




    }


}
