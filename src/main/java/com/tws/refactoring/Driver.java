package com.tws.refactoring;

public class Driver {
    public static final int LEGAL_Age = 18;
    private int age;

    public Driver() {
    }

    public Driver(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static boolean isLegal(Driver driver) {
        return driver.age>=LEGAL_Age;
    }
}
