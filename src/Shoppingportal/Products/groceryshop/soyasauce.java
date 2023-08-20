package Shoppingportal.Products.groceryshop;

import Shoppingportal.Functions.main;

import java.util.Scanner;

public class soyasauce extends main {

    public soyasauce(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no(s) of Soyasauce/s .");
        int liq223344 = scanner.nextInt();
        System.out.println(liq223344 + " no(s)soyasauce has been added to your cart.");
        System.out.println("Bill amount (90 per piece ) : " +  liq223344*90+"Rs" );
        System.out.println("Thank You For Your Purchase");




    }
}
