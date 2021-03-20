package com.company;

import java.awt.*;

final class GalaxyS10  extends Samsung{
        public String function;

    public GalaxyS10(int year, PhoneMemory phoneMemory, Color color, String function) {
            super(year, phoneMemory, color);
            this.function = function;
        }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getFunction(String function) {
            return this.function;
    }

    @Override
    public void call(String name, int number) {
        super.call(name, number);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"\nFunction:"+ function;
    }
}


