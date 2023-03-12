package org.krab.interfaces;

import java.util.GregorianCalendar;


/**
 * Represents interface to drinks
 */
public interface IDrinkable {
    /**
     * Check overdue product or not
     * @param shelfLife how many monthes product will live
     * @param dateManufacturer date when product was produced
     * @return message overdue or appropriate
     */
    String checkShelfLife (int shelfLife, GregorianCalendar dateManufacturer);
    /**
     * Drink the product
     */
    void drink();

}
