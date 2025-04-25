package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Inventory> inv = Inventory.getInventory();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Show Inventory data\n2.Create a new file");
            int input = sc.nextInt();
            if (input == 1) {
                for (Inventory item : inv) {
                    System.out.printf("ID: %d | Product: %s | Price: $%.2f\n", item.getId(), item.getProduct(), item.getPrice());
                }
            } else if (input == 2) {
                CreateInventory cinv = CreateInventory.createInventory();
            }
            System.out.println("Do you want continue?\n1.Yes\n2.No");
            int a = sc.nextInt();
            if (a == 1){
                continue;
            }
            else if (a == 2){
                break;
            }
        }


    }
}


