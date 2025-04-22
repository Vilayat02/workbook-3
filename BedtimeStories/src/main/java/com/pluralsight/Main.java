package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream goldilocks = new FileInputStream("DataFiles/goldilocks.txt");
            FileInputStream hanselGretel = new FileInputStream("DataFiles/hansel_and_gretel.txt");
            FileInputStream maryLittleLamb = new FileInputStream("DataFiles/mary_had_a_little_lamb.txt");
            Scanner sc = new Scanner(System.in);
            Scanner reader1 = new Scanner(goldilocks);
            Scanner reader2 = new Scanner(hanselGretel);
            Scanner reader3 = new Scanner(maryLittleLamb);
            String stories;
            boolean run = true;
            while (run) {
                System.out.println("\nChoose a story:\n1.Goldilocks and the Threee Bears\n2.Hansel and Gretel\n3.Mary had a little lamb\n4.Exit");
                int story = sc.nextInt();
                if (story == 1) {
                    while (reader1.hasNextLine()) {
                        stories = reader1.nextLine();
                        System.out.println(stories);
                    }
                    reader1.close();
                }
                else if(story == 2){
                    while (reader2.hasNextLine()) {
                        stories = reader2.nextLine();
                        System.out.println(stories);
                    }
                    reader2.close();
                }
                else if(story == 3){
                    while (reader3.hasNextLine()) {
                        stories = reader3.nextLine();
                        System.out.println(stories);
                    }
                    reader3.close();
                }
                else if (story == 4) {
                    run = false;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
