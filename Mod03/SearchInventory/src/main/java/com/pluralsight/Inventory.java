package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
private int id;
private String product;
private double price;

    public Inventory(int id, String product, double price) {
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
    public static ArrayList<Inventory> getInventory(){
        ArrayList<Inventory> inventory = new ArrayList<>();
    try {

        BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));
        String line;
        while ((line = bufReader.readLine()) != null) {
            String[] parts = line.split("\\|");
            int id = Integer.parseInt(parts[0]);
            String product = parts[1];
            double price = Double.parseDouble(parts[2]);
            Inventory inv = new Inventory(id, product, price);
            inventory.add(inv);
        }
        bufReader.close();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
        return inventory;
    }
}
