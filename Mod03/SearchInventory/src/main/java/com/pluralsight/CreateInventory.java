package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateInventory {
    private int id;
    private String product;
    private double price;

    public CreateInventory(int id, String product, double price) {
        this.id = id;
        this.product = product;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static CreateInventory createInventory(){
        Scanner sc = new Scanner(System.in);
        try{
            BufferedWriter bfwriter = new BufferedWriter(new FileWriter("src/main/resources/newInventory"));
            while (true){
                System.out.print("Enter ID:");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter product name: ");
                String product = sc.nextLine();
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                String line = String.format("ID: %d | Product: %s | Price: $%.2f", id,product,price);
                bfwriter.write(line);
                bfwriter.newLine();
                System.out.println("Do you want add again? 1.Yes 2.No");
                int answer = sc.nextInt();
                if(answer == 1){
                    continue;
                } else if (answer == 2) {
                    Thread.sleep(1000);
                    System.out.println("Closing" +"." + "." + ".");
                    break;
                }
                else{
                    System.out.println("Wrong option!");
                }

            }
             bfwriter.close();
        }

        catch (Exception e){

        }


        return null;
    }
}
