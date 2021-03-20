package com.company;

import java.time.Year;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {


        Samsung objectA= new Samsung();
        objectA.setModel("A10");
        objectA.setColor(Color.BLACK);
        objectA.setYear(2015);
        PhoneMemory phoneMemory= new PhoneMemory("Memory: 32GB");
        System.out.println(objectA.getInfo());
        System.out.println(phoneMemory.getPhoneMemory());
        objectA.call("Ambulance-",103);
        objectA.call(101,"Fire");
        objectA.call(222);


        PhoneMemory phoneMemory2= new PhoneMemory("Memory: 64GB");
        GalaxyS10 objectC= new GalaxyS10(2019,phoneMemory2,Color.GREY,"function");
        objectC.setModel("GalaxyS10");
        System.out.println(objectC.getInfo());
        System.out.println(phoneMemory2.getPhoneMemory());
        objectC.call(100,"balance-");
        objectC.call("tarif-",155);
        objectC.call(444);


        PhoneMemory phoneMemory1= new PhoneMemory("Memory: 128GB");
        GalaxyS10 objectB= new GalaxyS10(2020, phoneMemory1, Color.WHITE,"функция++");
        objectB.getModel("GalaxyS10++");
        System.out.println(objectB.getInfo());
        System.out.println(phoneMemory1.getPhoneMemory());
        objectB.call(0701777,"Mom-");
        objectB.call("Dad-",111);
        objectB.call(333);














    }
}
