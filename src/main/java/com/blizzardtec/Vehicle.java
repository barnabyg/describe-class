/**
 * 
 */
package com.blizzardtec;

/**
 * @author Barnaby Golden
 *
 */
public final class Vehicle {

    private float length;
    private float width;
    private int engineCapacity;
    private String brand;
    private String model;
    private float price;
    private boolean luxuryCar;

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }
    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }
    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }
    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }
    /**
     * @return the engineCapacity
     */
    public int getEngineCapacity() {
        return engineCapacity;
    }
    /**
     * @param engineCapacity the engineCapacity to set
     */
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }
    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }
    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    /**
     * @return the luxuryCar
     */
    public boolean isLuxuryCar() {
        return luxuryCar;
    }
    /**
     * @param luxuryCar the luxuryCar to set
     */
    public void setLuxuryCar(boolean luxuryCar) {
        this.luxuryCar = luxuryCar;
    }
}
