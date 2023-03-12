package org.krab.module;

import org.krab.enums.Gasification;
import org.krab.enums.PackageDrink;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Represents main class
 * @author Vitalii_Krab
 */
public class Main {
    public static void main(String[] args) {
        List<AlcoDrink> alcoList = new ArrayList<AlcoDrink>();
        List<NonAlckoDrink> nonAlckoList = new ArrayList<NonAlckoDrink>();

        alcoList.add(new AlcoDrink("Jack Daniel`s", "Jack", PackageDrink.glass, 200, new GregorianCalendar(2014, 2, 25), 120, 40));
        alcoList.add(new AlcoDrink("Aperol", "Jenna S", PackageDrink.glass, 100, new GregorianCalendar(2005, 3, 21), 60, 42));
        alcoList.add(new AlcoDrink("Jack Daniel`s", "NOJack", PackageDrink.glass, 200, new GregorianCalendar(2014, 2, 25), 120, 40));
        alcoList.add(new AlcoDrink("BeerMix", "Obolon", PackageDrink.glass, 10, new GregorianCalendar(2022, 11, 25), 12, 4));

        nonAlckoList.add(new NonAlckoDrink("Coca-Cola", "Coca-Cola", PackageDrink.plastic, 5, new GregorianCalendar(2023, 1, 1), 6, 125, Gasification.highly));
        nonAlckoList.add(new NonAlckoDrink("Juicy", "Sandora", PackageDrink.carton, 4, new GregorianCalendar(2022, 11, 2), 1, 89, Gasification.none));
        nonAlckoList.add(new NonAlckoDrink("Baikal", "Bob-boisson", PackageDrink.plastic, 5, new GregorianCalendar(2023, 1, 1), 6, 114, Gasification.highly));

        alcoList.get(0).drink();
        nonAlckoList.get(2).drink();

        equalCheckAlco(alcoList, 0, (short) 1);
        equalCheckAlco(alcoList, 0, (short) 2);
        equalCheckNonAlco(nonAlckoList, 0, 1);
        equalCheckNonAlco(nonAlckoList, 0, 2);

        print(alcoList);
        print(nonAlckoList);
    }

    private static void equalCheckAlco(List<AlcoDrink> alcoList, int ind1, short in2) {
        String res = " "; int ind2 = in2;

        if(alcoList.get(ind1).equals(alcoList.get(ind2))) res += alcoList.get(ind1).getName()+" is equal "+alcoList.get(ind2).getName();
        else res += alcoList.get(ind1).getName()+" is NOT equal "+alcoList.get(ind2).getName();

        System.out.println(res);

    }
    private static void equalCheckNonAlco(List<NonAlckoDrink> nonAlckoList, int ind1, int ind2) {
        String res = " ";

        if(nonAlckoList.get(ind1).equals(nonAlckoList.get(ind2))) res += nonAlckoList.get(ind1).getGasification()+" is equal "+nonAlckoList.get(ind2).getGasification();
        else res += nonAlckoList.get(ind1).getGasification()+" is NOT equal "+nonAlckoList.get(ind2).getGasification();

        System.out.println(res);

    }

    private static void print(List list) {
        for (var el: list) {
            System.out.println("---------");
            System.out.println(el.toString());
        }
    }
}