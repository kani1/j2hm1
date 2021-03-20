package com.company;

import java.awt.*;

public class Phone {
    private String model;
    private PhoneMemory phoneMemory;
    private Color color;


    public Phone() {
    }

    public Phone(String model, PhoneMemory phoneMemory, Color color) {
        this.model = model;
        this.phoneMemory = phoneMemory;
        this.color = color;
    }

    public String getModel(String model) {
        return model;
    }
    public void setModel(String model){this.model=model;}


    public PhoneMemory getPhoneMemory() {
        return phoneMemory;
    }
    public void setPhoneMemory(PhoneMemory phoneMemory){this.phoneMemory=phoneMemory;}
    public Color getColor() {
        return color;
    }
    public void setColor(Color color){this.color=color;}


    public String getInfo() {
        return "\nModel=" + model + "\nColor=" + color;
    }

}