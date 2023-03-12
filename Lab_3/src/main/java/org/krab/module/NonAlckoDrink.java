package org.krab.module;
import org.krab.enums.Gasification;
import org.krab.enums.PackageDrink;
import org.krab.interfaces.INonAlco;

import java.util.GregorianCalendar;

/**
 * Represents class of nonalcodrinks
 */
public class NonAlckoDrink extends Drinks implements INonAlco
{
    private int caloricContent;
    private Gasification gasification;

    /**
     * Create nonalcodrink with given values
     * @param name name of the drink
     * @param manufacturer manufacturer of the drink
     * @param packageDrink package of the drink (glass, plastic ect)
     * @param price price of the drink
     * @param dateManufacturer date when product was produced
     * @param shelfLifeMonthes  how many monthes product will live
     * @param caloricContent how many calories contain this product
     * @param gasification gasification of the product
     */
    public NonAlckoDrink(String name, String manufacturer, PackageDrink packageDrink, int price, GregorianCalendar dateManufacturer, int shelfLifeMonthes, int caloricContent, Gasification gasification) {
        super(name, manufacturer, packageDrink, price, dateManufacturer, shelfLifeMonthes);
        this.caloricContent = caloricContent;
        this.gasification = gasification;
    }

    /**
     * Generate string that contains all information about nonalcodrink
     * @return information about nonalcodrink
     */
    @Override
    public String toString() {
        return "Alcodrink "+ super.getName()+"\n Manufacturer: "+super.getManufacturer()+ "\n Pacage: "+getPackageDrink()+
                "\n dateManufacturer: "+super.getDateManufacturer().getTime()+ "\n Self life in monthes: "+super.getShelfLifeMonthes()+
                "\n To drink: "+checkShelfLife(super.getShelfLifeMonthes(),super.getDateManufacturer())+
                "\n CaloricContent : "+caloricContent+ "\n Gasification=" + gasification+"\nDrinked: "+drinked;
    }

    /**
     * Generate hashcode by gasification
     * @return hashcode by gasification
     */
    @Override
    public int hashCode(){
//        return 10 * typeAlcoDrink.hashCode();
        return 10 + super.getName().hashCode();
    }

    /**
     * Compare objects by gasification
     * @param obj object to compare
     * @return equals it or not
     */
    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof NonAlckoDrink)) return false;

        NonAlckoDrink nonAlc = (NonAlckoDrink)obj;
        return this.gasification.equals(nonAlc.gasification);
    }

    /**
     * Get gasification
     * @return gasification
     */
    public Gasification getGasification() {
        return gasification;
    }


}
