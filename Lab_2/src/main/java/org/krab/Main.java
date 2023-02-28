package org.krab;

import org.krab.enums.PackageDrink;
import org.krab.enums.TypeAlcoDrink;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        AlkoDrink alco1 = new AlkoDrink("Jack Daniel`s", "Jack", PackageDrink.glass, 200, new GregorianCalendar(2014, 2, 25), 120, 40);

        System.out.println(alco1.toString());
    }
}