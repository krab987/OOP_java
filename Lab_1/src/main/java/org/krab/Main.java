package org.krab;

import org.krab.enums.MaterialWindow;
import org.krab.enums.SizeWindow;
import org.krab.enums.TypeDoor;

/**
 * @author Vitalii_Krab
 */
public class Main {
    public static void main(String[] args) {
        Home myHome1 = new Home("VitaliiHome","Blue", "Post-Realism", new Door(), new Window());


        myHome1.addDoor(new Door(TypeDoor.inhome, "white", 20));
        myHome1.addDoor(new Door(TypeDoor.entrance, "green", 45));
        myHome1.addDoor(new Door(TypeDoor.entrance));

        myHome1.addWindow(new Window("brown"));
        myHome1.addWindow(new Window("skyblue",SizeWindow.small, MaterialWindow.plastic));
        myHome1.addWindow(new Window("white",SizeWindow.big, MaterialWindow.plastic));
        myHome1.addWindow(new Window("brown",SizeWindow.normal, MaterialWindow.wood));

        System.out.println(myHome1.toString());

        myHome1.getDoorList().get(0).closeDoor();
        myHome1.getDoorList().get(1).closeDoor();
        System.out.println(myHome1.toString());

        myHome1.closeDoors();
        System.out.println(myHome1.toString());
        System.out.println(myHome1.toString());
    }
}