package com.zipcodewilmington.assessment2.part3;

public abstract class Bird implements Animal {
    String expected;

    public String move() {

        return "fly";
    }


    public void setMigrationMonth(String expected) {
       this.expected=expected;
    }

    public String getMigrationMonth() {

        return this.expected;
    }
}
