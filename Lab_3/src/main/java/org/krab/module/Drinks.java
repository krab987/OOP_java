package org.krab.module;

import org.krab.enums.PackageDrink;
import org.krab.interfaces.IDrinkable;

import java.util.GregorianCalendar;

/**
 * Represents abstract class of drinks
 */
abstract class Drinks implements IDrinkable {
    private String name;
    private String manufacturer;

    private PackageDrink packageDrink;
    private int price;
    private GregorianCalendar dateManufacturer;
    private int shelfLifeMonthes;
    boolean drinked;

    /**
     * Create drink with given values
     * @param name name of the drink
     * @param manufacturer manufacturer of the drink
     * @param packageDrink package of the drink (glass, plastic ect)
     * @param price price of the drink
     * @param dateManufacturer date when product was produced
     * @param shelfLifeMonthes how many monthes product will live
     */
    public Drinks (String name, String manufacturer, PackageDrink packageDrink, int price, GregorianCalendar dateManufacturer, int shelfLifeMonthes){
        this.name=name;
        this.manufacturer=manufacturer;
        this.packageDrink=packageDrink;
        this.price=price;
        this.dateManufacturer=dateManufacturer;
        this.shelfLifeMonthes = shelfLifeMonthes;
        drinked = false;
    }

    /**
     * Drink the product
     */
    public void drink(){
        drinked = true;
    }

    /**
     * Check overdue product or not
     * @param shelfLife how many monthes product will live
     * @param dateManufacturer date when product was produced
     * @return message overdue or appropriate
     */
    public String checkShelfLife (int shelfLife, GregorianCalendar dateManufacturer){
        String res = "overdue"; // прострочений

        dateManufacturer.set(dateManufacturer.MONTH, dateManufacturer.MONTH + shelfLife);
        if(dateManufacturer.compareTo(GregorianCalendar.getInstance()) > 0){
            res = "appropriate";
        }

        return res;
    }

    /**
     * Gets name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Gets manufacturer
     * @return manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }
    /**
     * Gets packageDrink
     * @return packageDrink
     */
    public PackageDrink getPackageDrink() {
        return packageDrink;
    }
    /**
     * Gets dateManufacturer
     * @return dateManufacturer
     */
    public GregorianCalendar getDateManufacturer() {
        return dateManufacturer;
    }
    /**
     * Gets shelfLifeMonthes
     * @return shelfLifeMonthes
     */
    public int getShelfLifeMonthes() {
        return shelfLifeMonthes;
    }


}
