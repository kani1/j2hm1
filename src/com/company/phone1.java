package com.company;
public class phone1 {
    private String model;
    private String phoneMemory;
    private color color;


    public String getModel() { return model; }

    public void setModel(String model) { this.model = model;}

    public String getPhoneMemory() { return phoneMemory;}

    public void setPhoneMemory(String phoneMemory) { this.phoneMemory = phoneMemory; }

    public com.company.color getColor() { return color; }

    public void setColor(com.company.color color) { this.color = color; }



    public String getInfo(){
            return "\nModel="+model+"\nColor="+color+"\nMemory="+phoneMemory;
        }
    }

