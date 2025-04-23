package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        dateFormat1(now);
        dateFormat2(now);
        System.out.println(getFormat3(now)); //There was System.out.println(getFormat3(now)), I removed it because getFormat3 method is not void type it use return
        dateFormat4(now); //Added "now" variable in constructor
        dateFormat5(now);
        dateFormat6(now);
    }

    static void dateFormat1(LocalDateTime now) {
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/YYYY"); // Dashes(-) changed to slash(/)
        System.out.println(now.format(format1));
    }

    static void dateFormat2(LocalDateTime now) {
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); //was .ofpattern -> changed to .ofPattern. And slashes(/) changed to dashes(-) in quotes
        System.out.println(now.format(format2));
    }

    static String getFormat3(LocalDateTime now) {
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy"); // Changed DD to lower case dd
        return format3.format(now);
        //System.out.println("This will never execute"); // There was System.out.println("This will never execute") it's not correct
    }

    static void dateFormat4(LocalDateTime time) {
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("eeee ,MMM d, yyyy  hh:mm"); //Added hh:mm
        System.out.println(time.format(format4));
    }

    static void dateFormat5(LocalDateTime now) {
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("hh:mm"); // There was DateTmeFormatter.ofPattern("hh:mm") -> Changed to DateTimeFormatter.ofPattern("hh:mm") missed "i" between T m
        System.out.println(now.format(format5) + " \u00DF display in GMT time"); //Was format(format5) += changed to now.format(format5) +
    }

    static void dateFormat6(LocalDateTime now) {
        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("H:mm 'on' dd MMM yyyy");
        System.out.println(format6.format(now) + " \u00DF display in your local time zone");
    }
 }


