package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufReader = new BufferedReader(file);
            bufReader.readLine(); // Skip First String contains line
            String line;
            while ((line = bufReader.readLine()) != null){
                String[] index = line.split("\\|");
                int id = Integer.parseInt(index[0]);
                String name = index[1];
                double hoursWorked = Double.parseDouble(index[2]);
                double payRate = Double.parseDouble(index[3]);
                Employee emp = new Employee(id, name, hoursWorked, payRate);
                System.out.printf("ID: %d | Name %s | Gross Pay: $%.2f\n", emp.getEmployeeId(), emp.getName(), emp.getGrossPay());
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
