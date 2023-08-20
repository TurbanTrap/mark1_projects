package Shoppingportal;

import java.util.Scanner;

public class finalcallfunctions {



    public finalcallfunctions() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter [1] for LIQUOR" + "\n" + "Enter [2] for FRUITS" +"\n"+ "Enter [3] for GROCERY");
        int cust = scanner.nextInt();
        switch (cust) {
            case 1:
                callfunction1 call1 = new callfunction1();
                call1.getClass();
                break;
            case 2:
                callfunction2 call2 = new callfunction2();
                call2.getClass();
                break;

            case 3:
                callfunction3 call3 = new callfunction3();
                call3.getClass();
                break;

        }

    }}
