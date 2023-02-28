package org.krab;

import org.krab.enums.PackageDrink;
import org.krab.enums.TypeAlcoDrink;

import java.util.GregorianCalendar;

public class AlkoDrink extends Drinks{
    private int concentration;
    private TypeAlcoDrink typeAlcoDrink;

    public AlkoDrink(String name, String manufacturer, PackageDrink packageDrink, int price, GregorianCalendar dateManufacturer, int shelfLifeMonthes, int concentration) {
        super(name, manufacturer, packageDrink, price, dateManufacturer, shelfLifeMonthes);
        this.concentration = concentration;

        setTypeAlcoDrink(concentration);
    }

    private void setTypeAlcoDrink(int concentration) {
        if(concentration <6) typeAlcoDrink = TypeAlcoDrink.light;
        else if(concentration > 39) typeAlcoDrink = TypeAlcoDrink.hard;
        else typeAlcoDrink=TypeAlcoDrink.medium;
    }

    @Override
    public String toString() {
        return "Alcodrink "+ super.getName()+"\n Manufacturer: "+super.getManufacturer()+ "\n Pacage: "+getPackageDrink()+
                "\n dateManufacturer: "+super.getDateManufacturer().getTime()+ "\n Self life in monthes: "+super.getShelfLifeMonthes()+
                "\n To drink: "+checkShelfLife(super.getShelfLifeMonthes(),super.getDateManufacturer())+
                "\n Concentration in %: "+concentration+ "\n TypeAlcoDrink: " + typeAlcoDrink;
    }
    @Override
    public int hashCode(){
//        return 10 * typeAlcoDrink.hashCode();
        return 10 * super.getName().hashCode();
    }
    @Override
    public boolean equals(Object obj){

        if (!(obj instanceof AlkoDrink)) return false;

        AlkoDrink alc = (AlkoDrink)obj;
        return this.getName().equals(alc.getName());
    }

    public TypeAlcoDrink getTypeAlcoDrink() {
        return typeAlcoDrink;
    }

    public void setTypeAlcoDrink(TypeAlcoDrink typeAlcoDrink) {
        this.typeAlcoDrink = typeAlcoDrink;
    }

    public int getConcentration() {
        return concentration;
    }

    public void setConcentration(int concentration) {
        this.concentration = concentration;
    }


}
