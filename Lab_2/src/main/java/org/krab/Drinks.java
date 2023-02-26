package org.krab;

import org.krab.enums.PackageDrink;

import java.util.Calendar;

public class Drinks {
    private String name;
    private String manufacturer;

    private PackageDrink packageDrink;
    private int price;
    private Calendar dateManufacturer;
    private int shelfLife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }



    private String checkShelfLife (int shelfLife, Calendar dateManufacturer){
        String res = "overdue"; // прострочений

        dateManufacturer.roll(dateManufacturer.MONTH, + shelfLife);
        if(dateManufacturer.compareTo(Calendar.getInstance()) < 0){
            res = "appropriate";
        }

        return res;
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

    public Calendar getDateManufacturer() {
        return dateManufacturer;
    }

    public void setDateManufacturer(Calendar dateManufacturer) {
        this.dateManufacturer = dateManufacturer;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
