package org.krab;

import org.krab.enums.PackageDrink;
import org.krab.enums.Gasification;
import java.util.GregorianCalendar;

public class NonAlckoDrink extends Drinks
{
    private int caloricContent;
    private Gasification gasification;


    public NonAlckoDrink(String name, String manufacturer, PackageDrink packageDrink, int price, GregorianCalendar dateManufacturer, int shelfLifeMonthes, int caloricContent, Gasification gasification) {
        super(name, manufacturer, packageDrink, price, dateManufacturer, shelfLifeMonthes);
        this.caloricContent = caloricContent;
        this.gasification = gasification;
    }

    @Override
    public String toString() {
        return "Alcodrink "+ super.getName()+"\n Manufacturer: "+super.getManufacturer()+ "\n Pacage: "+getPackageDrink()+
                "\n dateManufacturer: "+super.getDateManufacturer().getTime()+ "\n Self life in monthes: "+super.getShelfLifeMonthes()+
                "\n To drink: "+checkShelfLife(super.getShelfLifeMonthes(),super.getDateManufacturer())+
                "\n CaloricContent : "+caloricContent+ "\n Gasification=" + gasification;
    }

    public int getCaloricContent() {
        return caloricContent;
    }

    public void setCaloricContent(int caloricContent) {
        this.caloricContent = caloricContent;
    }
    public Gasification getGasification() {
        return gasification;
    }

    public void setGasification(Gasification gasification) {
        this.gasification = gasification;
    }

}
