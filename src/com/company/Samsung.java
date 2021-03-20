package com.company;

public class Samsung extends Phone {
    private int year;
    public Samsung(){}

    public Samsung(int year, PhoneMemory phoneMemory, Color color) {
        this.year = year;
        super.setPhoneMemory(phoneMemory);
        super.setColor(color);

    }



    public int getYear(int year) {
        return year;
    }

    public void setYear(int year) { this.year = year; }

    public void call(String name, int number) {
        for (int i = 0; i < number; i++) {
        }System.out.println("call:"+name+number);

    }
    public void call(int number, String name) {
        for (int i = 0; i < number; i++) {
        }
        System.out.println("call:"+ name+ number);
    }

    final void call(int number){
        for (int i = 0; i < number; i++) {
        }
        System.out.println("call:"+number);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nYear"+year;
    }
}
