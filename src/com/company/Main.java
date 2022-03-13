package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        var item = "Shirt";
        var size = "M";
        float price = (float) 14.99;
        var color = "Red";

//        Locale.setDefault(new Locale("it", "IT"));
//        Locale.setDefault(new Locale("en", "GB"));
        Locale.setDefault(new Locale("en", "US"));

        var locale = Locale.getDefault();

        var country = locale.getDisplayCountry();
        var numCurr = NumberFormat.getCurrencyInstance(locale);


        var template = "Clothing item:  %s, size %s, color %s, price in %s %s";
        var itemString = String.format(template, item, size, color, country,
                numCurr.format(Double.parseDouble(Float.toString(price))));
//                Double.toString(Double.parseDouble(Float.toString(price))));
        System.out.println(itemString);


    }
}
