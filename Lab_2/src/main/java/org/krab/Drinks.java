package org.krab;

import org.krab.enums.PackageDrink;

import java.util.GregorianCalendar;

abstract class Drinks {
    private String name;
    private String manufacturer;

    private PackageDrink packageDrink;
    private int price;
    private GregorianCalendar dateManufacturer;
    private int shelfLifeMonthes;

    public Drinks (String name, String manufacturer, PackageDrink packageDrink, int price, GregorianCalendar dateManufacturer, int shelfLifeMonthes){
        this.name=name;
        this.manufacturer=manufacturer;
        this.packageDrink=packageDrink;
        this.price=price;
        this.dateManufacturer=dateManufacturer;
        this.shelfLifeMonthes = shelfLifeMonthes;
    }


    public String checkShelfLife (int shelfLife, GregorianCalendar dateManufacturer){
        String res = "overdue"; // прострочений

        dateManufacturer.set(dateManufacturer.MONTH, dateManufacturer.MONTH + shelfLife);
        if(dateManufacturer.compareTo(GregorianCalendar.getInstance()) > 0){
            res = "appropriate";
        }

        return res;
    }


    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public PackageDrink getPackageDrink() {
        return packageDrink;
    }

    public void setPackageDrink(PackageDrink packageDrink) {
        this.packageDrink = packageDrink;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public GregorianCalendar getDateManufacturer() {
        return dateManufacturer;
    }

    public void setDateManufacturer(GregorianCalendar dateManufacturer) {
        this.dateManufacturer = dateManufacturer;
    }

    public int getShelfLifeMonthes() {
        return shelfLifeMonthes;
    }

    public void setShelfLifeMonthes(int shelfLifeMonthes) {
        this.shelfLifeMonthes = shelfLifeMonthes;
    }
}
