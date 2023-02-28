package org.krab;

import org.krab.enums.PackageDrink;
import org.krab.enums.TypeAlcoDrink;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<AlkoDrink> alcoList = new ArrayList<AlkoDrink>();

        alcoList.add(new AlkoDrink("Jack Daniel`s", "Jack", PackageDrink.glass, 200, new GregorianCalendar(2014, 2, 25), 120, 40));
        alcoList.add(new AlkoDrink("Jack Daniel`s", "Jack", PackageDrink.glass, 200, new GregorianCalendar(2014, 2, 25), 120, 40));
        alcoList.add(new AlkoDrink("Jack Daniel`s", "Jack", PackageDrink.glass, 200, new GregorianCalendar(2014, 2, 25), 120, 40));


        equalCheck(alcoList, 0, 1);
        print(alcoList);
    }

    private static void equalCheck(List<AlkoDrink> alcoList, int ind1, int ind2) {
        String res = " ";

        if(alcoList.get(ind1).equals(alcoList.get(ind2))) res += alcoList.get(ind1).getName()+" is equal "+alcoList.get(ind2).getName();
        else res += alcoList.get(ind1).getName()+" is NOT equal "+alcoList.get(ind2).getName();

        System.out.println(res);

    }

    private static void print(List list) {
        for (var el: list) {
            System.out.println(el.toString());
            System.out.println("---------");
        }
    }
}