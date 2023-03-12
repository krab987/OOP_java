package org.krab.module;

import org.krab.enums.PackageDrink;
import org.krab.enums.TypeAlcoDrink;
import org.krab.interfaces.IAlco;

import java.util.GregorianCalendar;

/**
 * Represents class of alcodrinks
 */
public class AlcoDrink extends Drinks implements IAlco {
    private int concentration;


    private TypeAlcoDrink typeAlcoDrink;

    /**
     * Create alcodrink with given values
     * @param name name of the drink
     * @param manufacturer manufacturer of the drink
     * @param packageDrink package of the drink (glass, plastic ect)
     * @param price price of the drink
     * @param dateManufacturer date when product was produced
     * @param shelfLifeMonthes  how many monthes product will live
     * @param concentration concentration of alcodrink in percents
     */
    public AlcoDrink(String name, String manufacturer, PackageDrink packageDrink, int price, GregorianCalendar dateManufacturer, int shelfLifeMonthes, int concentration) {
        super(name, manufacturer, packageDrink, price, dateManufacturer, shelfLifeMonthes);
        this.concentration = concentration;

        setTypeAlcoDrink(concentration);
    }


    /**
     * Set Type of alco drink from light to hard
     * @param concentration concentration of alcodrink in percents
     */
    private void setTypeAlcoDrink(int concentration) {
        if(concentration <6) typeAlcoDrink = TypeAlcoDrink.light;
        else if(concentration > 39) typeAlcoDrink = TypeAlcoDrink.hard;
        else typeAlcoDrink=TypeAlcoDrink.medium;
    }


    /**
     * Generate hashcode by name
     * @return hashcode by name
     */
    @Override
    public int hashCode(){
//        return 10 * typeAlcoDrink.hashCode();
        return 10 * super.getName().hashCode();
    }

    /**
     * Compare objects by name
     * @param obj object to compare
     * @return equals it or not
     */
    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof AlcoDrink alc)) return false;

        return this.getName().equals(alc.getName());
    }

    /**
     * Get typeAlcoDrink
     * @return typeAlcoDrink
     */
    public TypeAlcoDrink getTypeAlcoDrink() {
        return typeAlcoDrink;
    }


}
