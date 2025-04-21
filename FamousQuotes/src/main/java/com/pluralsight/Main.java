package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String[] quotes = new String[10];
            for (int i = 0; i < 10; i++) {
                quotes[i] = "Quote" + (i + 1);
                //System.out.println(quotes[i]);
            }
            boolean run = true;
            while(run) {
                System.out.print("Select number from 1 to 10: ");
                int num = sc.nextInt();
                switch (num) {
                    case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                        System.out.println(quotes[num - 1]);
                        break;
                    default:
                        System.out.println("Wrong option!");
                }
                System.out.println("Do you want search again?\n1.Yes\n2.No");
                int again = sc.nextInt();
                if (again == 1) continue;
                if (again != 1) {
                    System.out.println("Have a good day!");
                    run = false;
                }
            }

        } catch (Exception e) {
            System.out.println("Error try again!");
        }
    }
}