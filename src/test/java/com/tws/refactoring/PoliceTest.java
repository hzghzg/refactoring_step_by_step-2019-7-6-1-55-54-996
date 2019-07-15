package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {
    static Police police;
    @BeforeAll
    public  static void initialize(){
        police = new Police();
    }
    @Test
    public void should_return_true_when_call_checkDriver_given_a_34_age_driver() {
        Driver driver = new Driver(34);
        //Police police = new Police();
        Assertions.assertEquals(true,police.checkDriver(driver));
    }

    @Test
    public void should_return_false_when_call_checkDriver_given_a_16_age_driver() {
        Driver driver = new Driver(16);
       // Police police = new Police();
        Assertions.assertEquals(false,police.checkDriver(driver));
    }

    @Test
    public  void should_return_false_when_call_checkDriver_given_a_18_age_driver() {
        Driver driver = new Driver(18);
        //Police police = new Police();
        Assertions.assertEquals(true,police.checkDriver(driver));
    }

}