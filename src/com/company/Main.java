package com.company;

public class Main {

    public static void main(String[] args) {
        Samsung objectA= new Samsung();
        objectA.setModel("A10");
        objectA.setYear(2019);
        objectA.setColor(color.BLACK);
        objectA.setPhoneMemory("32GB");
        System.out.println(objectA.getInfo());
        objectA.call("Ambulance-",103);


        Samsung objectB= new Samsung();
        objectB.setModel("S20");
        objectB.setYear(2020);
        objectB.setColor(color.WHITE);
        objectB.setPhoneMemory("128 GB");
        System.out.println(objectB.getInfo());
        objectB.call(102, "Police");

        Samsung objectC= new Samsung();
        objectC.setModel("A01");
        objectC.setYear(2020);
        objectC.setColor(color.GREY);
        objectC.setPhoneMemory("16GB");
        System.out.println(objectC.getInfo());
        objectC.call(101);









    }
}
