package Shoppingportal.fruitshop;

import Shoppingportal.main;

import java.util.Scanner;

public class mango extends main {
    public mango(){

    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no(s) of Mango/s.");
    int liq2233 = scanner.nextInt();
        System.out.println(liq2233 + " no(s)mangoes has been added to your cart.");
        System.out.println("Bill amount (50 per piece ) : " +  liq2233*50+"Rs" );
        System.out.println("Thank You For Your Purchase");
}
}