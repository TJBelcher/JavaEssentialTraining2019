package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));

        var numCurr = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("Number: " + numCurr.format(doubleValue));

        var italyLocale = new Locale("it", "IT");
        var localeFormatter = NumberFormat.getCurrencyInstance(italyLocale);
        System.out.println("Number: " + localeFormatter.format(doubleValue));

        var myLocales = Locale.getAvailableLocales();
        System.out.println("Locations Available: " + Arrays.toString(myLocales));

        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(5000.555));

    }
}
