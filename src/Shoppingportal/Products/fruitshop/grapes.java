package Shoppingportal.Products.fruitshop;

import Shoppingportal.Functions.main;

import java.util.Scanner;

public class grapes extends main {

public grapes(){



    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter no(s) of Grape/s.");
    int liq2255 = scanner.nextInt();
    System.out.println(liq2255 + " no(s)grapes has been added to your cart.");
    System.out.println("Bill amount (70 per set ) : " +  liq2255*70+"Rs" );
    System.out.println("Thank You For Your Purchase");
}




}
