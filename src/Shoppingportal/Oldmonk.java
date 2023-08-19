package Shoppingportal;

import java.util.Scanner;
public class Oldmonk extends main {
    Oldmonk(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no(s) of Old monk .");
        int liq22 = scanner.nextInt();
        System.out.println(liq22 + " no(s)Old monk has been added to your cart.");
        System.out.println("Bill amount (1000 per piece ) : " +  liq22*1000+"Rs" );
        System.out.println("Thank You For Your Purchase");
    }

}
