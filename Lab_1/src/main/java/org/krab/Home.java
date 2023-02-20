package org.krab;

import java.util.List;
import  java.util.Collections;
import java.util.Stack;

/**
 * Represents home with doors and windows
 */
public class Home {
    String name;
    String color;
    String style;
    List<Door> doorList;
    List<Window> windowList;



    /**
     * Closes all doors
     */
    public void closeDoors(){
        for (Door door: doorList) {
            door.closeDoor();
        }
    }

    /**
     * Add door to list of doors
     * @param door is door that u want to add
     */
    public void addDoor(Door door){
        doorList.add(door);
    }

    /**
     * Add window to list of windows
     * @param window is window that u want to add
     */
    public void addWindow(Window window){
        windowList.add(window);
    }

    /**
     * Generate string that contains all inf about home
     * @return inf about home
     */
    public String toString(){
        String res="";

        res+="HOME:"+name+"\n";
        res+="Color: "+color+"\nStyle: "+style+"\n";

        res+="\n------- \nDoors\n";
        for (Door door: doorList) {
            res += door.toString();
        }
        res+="\n ------- \nWindows\n";
        for (Window window: windowList) {
            res += window.toString();
        }

        return res;
    }



    /**
     * Creates a new Home with default values
     */
    Home(){
        name = "myHome";
        doorList = new Stack<Door>();
        windowList = new Stack<Window>();

        color = "white";
        style = "modern";
    }

    /**
     * Creates a new Home with the given values
     * @param name is name of the home (or home owner)
     * @param color is color of the home
     * @param style is style of the home (modern\vintage ect)
     * @param door is first door u want to add
     * @param window is first window u want to add
     * @Accessors
     */
    Home(String name, String color, String style, Door door, Window window){
        doorList = new Stack<Door>();
        windowList = new Stack<Window>();
        doorList.add(door);
        windowList.add(window);

        this.name = name;
        this.color=color;
        this.style=style;

    }


    /**
     * Gets the name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param name is name of the home (or home owner)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get color of the home
     * @return color
     */
    public String getColor(){
        return color;
    }

    /**
     * Set color of the home
     * @param color is color of the home
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Get style of the home
     * @return style
     */
    public String getStyle() {
        return style;
    }

    /**
     * Set the style
     * @param style is style of the home (modern\vintage ect)
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * Get doorList
     * @return doorList
     */
    public List<Door> getDoorList() {
        return doorList;
    }

    /**
     * Get windowList
     * @return windowList
     */
    public List<Window> getWindowList() {
        return windowList;
    }


}
