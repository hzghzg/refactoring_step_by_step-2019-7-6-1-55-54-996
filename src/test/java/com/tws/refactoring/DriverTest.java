package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    public static Driver driver;
    @BeforeAll
    public  static void initialize(){
        driver=new Driver();
    }
    @Test
    public void should_return_true_when_call_checkDriver_given_a_34_age_driver() {
        driver.setAge(34);
        Assertions.assertEquals(true,Driver.isLegal(driver));
    }

    @Test
    public void should_return_false_when_call_checkDriver_given_a_16_age_driver() {
        driver.setAge(16);
        Assertions.assertEquals(false,Driver.isLegal(driver));
    }

    @Test
    public  void should_return_false_when_call_checkDriver_given_a_18_age_driver() {
        driver.setAge(18);
        Assertions.assertEquals(true,Driver.isLegal(driver));
    }

}