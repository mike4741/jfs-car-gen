package com.mike.CarAppTest;

import com.mike.carApp.Car;
import com.mike.carApp.Honda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;
@Test
public class CarTest {
    Car civic;
    @BeforeEach
    public   void setup(){

        Car  civic = new Honda("red", 2022, 200, true);
    }

  @Test
  public  void  accelerateSpeed(){
      civic = new Honda("red", 2022, 200, true);

      Assertions.assertEquals(5,civic.accelerateSpeed());
  }
  @Test
    public  void  decelerateSpeed(){
      civic = new Honda("red", 2022, 200, true);

      Assertions.assertEquals(0,civic.decelerateSpeed());
    }
    @Test
    public  void  convertToElectric(){
        civic = new Honda("red", 2022, 200, true);

        Assertions.assertEquals(true,civic.convertToElectric());
    }
}

