package Shoppingportal.Functions;

import Shoppingportal.Products.wineshop.Jackdaniels;
import Shoppingportal.Products.wineshop.Oldmonk;
import Shoppingportal.Products.wineshop.blackandwhite;

import java.util.ArrayList;
import java.util.Scanner;

public class callfunction1 {


    public callfunction1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 to Get A1 Quality Deals .");
        int cust = scanner.nextInt();


        ArrayList<String> wineshop = new ArrayList<String>();
        wineshop.add("            :  WINESHOP : " + "\n" + "\nBlack & white(1)");
        wineshop.add("Old Monk(2)");
        wineshop.add("Jack Daniels(3)" + "\n");
        switch (cust) {

            case 1:
                for (int i = 0; i < wineshop.size(); i++) {
                    System.out.println(wineshop.get(i));
                }

                System.out.println("");

                System.out.println("Enter Values As per Your Product Tag .");
                int userlist = scanner.nextInt();

                switch (userlist) {
                    case 1:
                        blackandwhite bw = new blackandwhite();
                        break;
                    case 2:
                        Oldmonk olmnk = new Oldmonk();
                        break;
                    case 3:
                        Jackdaniels jack = new Jackdaniels();
                        break;
                }


        }


    }}
