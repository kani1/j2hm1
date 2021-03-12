package com.company;

public class Samsung extends phone1{
    private int year;
    public Samsung(){}

    public Samsung(int year, PhoneMemory phoneMemory, color color) {
        this.year = year;
        super.setColor(color);

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void call(String name, int number) {
        for (int i = 0; i < number; i++) {

        }

            System.out.println("call:"+name+number);


    }
    public void call(int number, String name) {
        for (int i = 0; i < number; i++) {


        }
        System.out.println("call:"+ name+ number);
    }
    public void call(int number){
        for (int i = 0; i < number; i++) {

        }
        System.out.println("call:"+number);
    }

public String getInfo(){
        return super.getInfo()+"\nYear="+year;
}
    }
