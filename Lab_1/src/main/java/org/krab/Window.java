package org.krab;

import org.krab.enums.MaterialWindow;
import org.krab.enums.SizeWindow;

/**
 * Represents door that is included in home
 */
public class Window {
    String color;
    SizeWindow sizeWindow;
    MaterialWindow materialWindow;


    /**
     * Generate string that contains all inf about window
     * @return inf about window
     */
    public String toString(){
        String res="";
        res = "Color: "+color+"\n Size Window: "+sizeWindow+"\n Material Window: "+materialWindow +"\n";
        return res;
    }


    /**
     * Creates a new Window with default values
     */
    public Window(){
        color = "White";
        sizeWindow = SizeWindow.normal;
        materialWindow = MaterialWindow.plastic;
    }

    /**
     * Creates a new Window with given values
     * @param color is color of the window
     */
    public Window(String color){
        this.color = color;
        sizeWindow = SizeWindow.normal;
        materialWindow = MaterialWindow.plastic;
    }

    /**
     * Creates a new Window with given values
     * @param color is color of the window
     * @param sizeWindow is size of the window
     * @param materialWindow is material of the window
     */
    public Window(String color, SizeWindow sizeWindow, MaterialWindow materialWindow){
        this.color=color;
        this.sizeWindow=sizeWindow;
        this.materialWindow=materialWindow;
    }


    /**
     * Get material of the window
     * @return material of the window
     */
    public MaterialWindow getMaterialWindow() {
        return materialWindow;
    }

    /**
     * Set size of the window
     * @return size of the window
     */
    public SizeWindow getSizeWindow() {
        return sizeWindow;
    }

    /**
     * Get color of the window
     * @return color of the window
     */
    public String getColor() {
        return color;
    }

    /**
     * Set color of the window
     * @param color color the window
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Set material of the window
     * @param materialWindow is material of the window
     */
    public void setMaterialWindow(MaterialWindow materialWindow) {
        this.materialWindow = materialWindow;
    }

    /**
     * Set size of the window
     * @param sizeWindow is size of the window
     */
    public void setSizeWindow(SizeWindow sizeWindow) {
        this.sizeWindow = sizeWindow;
    }
}
