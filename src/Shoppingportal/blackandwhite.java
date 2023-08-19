package Shoppingportal;

import java.util.Scanner;

public class blackandwhite extends main{

    blackandwhite(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no(s) of B & W ");
        int liqq11 = scanner.nextInt();
        System.out.println(liqq11 + "No(s) of Black and White has been added to your cart .");
        System.out.println("Bill amount (2669 per piece) : " +  liqq11* 2669 +"Rs" );
        System.out.println("Thank You For Your Purchase");
    }
}
