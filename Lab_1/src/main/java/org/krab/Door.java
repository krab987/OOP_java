package org.krab;

import org.krab.enums.StatusDoor;
import org.krab.enums.TypeDoor;

/**
 * Represents door that is included in home
 */
public class Door {
    private String color;
    private float weight_kg;
    private TypeDoor typeDoor;
    private StatusDoor statusDoor;



    /**
     * Creates a new Door with default values
     */
    Door() {
        this.typeDoor = TypeDoor.inhome;
        this.color = "Brown";
        this.weight_kg = 0;
        statusDoor = StatusDoor.opened;
    }

    /**
     * Creates a new Door with given values
     * @param typeDoor is type of the door
     */
    Door(TypeDoor typeDoor) {
        this.typeDoor = typeDoor;
        this.color = "Brown";
        this.weight_kg = 0;
        statusDoor = StatusDoor.opened;
    }

    /**
     * Creates a new Door with given values
     * @param typeDoor is type of the door
     * @param color is color of the door
     * @param weight_kg is weight of the door in kilograms
     */
    Door(TypeDoor typeDoor, String color, float weight_kg) {
        this.typeDoor = typeDoor;
        this.color = color;
        this.weight_kg = weight_kg;
        statusDoor = StatusDoor.opened;
    }





    /**
     * Close the door
     */
    void closeDoor(){
        statusDoor = StatusDoor.closed;
    }

    /**
     * Generate string that contains all inf about door
     * @return inf about door
     */
    public String toString(){
        String res="";
        res = "Color: "+color+"\n Weight in kg: "+weight_kg+"\n Door type: "+typeDoor+"\n Door status: "+ statusDoor+"\n";
        return res;
    }






    /**
     * Get type of the door
     * @return type of the door
     */
    public TypeDoor getTypeDoor(){
        return typeDoor;
    }

    /**
     * Get type of the door
     * @param typeDoor is type of the door
     */
    public void setTypeDoor(TypeDoor typeDoor){
        this.typeDoor = typeDoor;
    }

    /**
     * Get color of the door
     * @return color of the door
     */
    public String getColor(){
        return color;
    }

    /**
     * Set color of the door
     * @param color is color of the door
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Get weight in kg of the door
     * @return weight in kg
     */
    public float getWeight_kg(){
        return weight_kg;
    }

    /**
     * Set weight in kg of the door
     * @param weight_kg is weight in kg of the door
     */
    public void setWeight_kg(float weight_kg){
        this.weight_kg = weight_kg;
    }

    /**
     * Get status of the door
     * @return status of the door
     */
    public StatusDoor getStatusDoor() {
        return statusDoor;
    }

    /**
     * Set status of the door
     * @param statusDoor is status of the door
     */
    public void setStatusDoor(StatusDoor statusDoor) {
        this.statusDoor = statusDoor;
    }
}
