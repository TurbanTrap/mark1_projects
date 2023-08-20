package Shoppingportal.Products.wineshop;

import Shoppingportal.Functions.main;

import java.util.Scanner;

public class Jackdaniels extends main {
    public Jackdaniels(){

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter no(s) of Jack Daniels");
            int liq33 = scanner.nextInt();
            System.out.println(liq33 + "no(s) of Jack Daniels has been added to the list .");
            System.out.println("Bill amount (3200 per piece) : " +  liq33*3200 +"Rs" );
            System.out.println("Thank You For Your Purchase");

        }


}
