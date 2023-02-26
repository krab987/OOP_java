package org.krab;

import org.krab.enums.TypeAlcoDrink;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Calendar;

public class AlkoDrink extends Drinks{
    private int concentration;
    private TypeAlcoDrink typeAlcoDrink;

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
