package com.pluralsight;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(file);
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/payroll.csv"));
            bufReader.readLine(); // Skip First String contains line
            String line;
            while ((line = bufReader.readLine()) != null){
                String[] index = line.split("\\|");
                int id = Integer.parseInt(index[0]);
                String name = index[1];
                double hoursWorked = Double.parseDouble(index[2]);
                double payRate = Double.parseDouble(index[3]);
                Employee emp = new Employee(id, name, hoursWorked, payRate);
                int i = 111;
                bufWriter.write("ID: " + (i+=111) + " | Name: " + emp.setName("Cameron Tay") + "| Gross Pay: $" + 3277.65);
                System.out.printf("ID: %d | Name %s | Gross Pay: $%.2f\n", emp.getEmployeeId(), emp.getName(), emp.getGrossPay());
            }
            bufWriter.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}