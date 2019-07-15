package com.tws.refactoring;

public class Driver {
    private int age;

    public Driver() {
    }

    public Driver(int age) {
        this.age = age;
    }

    public static boolean isLegal(Driver driver) {
        return driver.age>= 18;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
