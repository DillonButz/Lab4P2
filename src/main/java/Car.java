

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djon Bon Junzi
 */
public class Car 
{
    private int yearModel;
    private String make;
    private int speed; 


public Car(int year, String make,int speed)
{
   this.yearModel = 0;
   this.make = "";
   this.speed = 0;
}

public int accelertate()
{
   int returnValue = speed +5;
   return returnValue;
}
public int brake()
{
   int returnValue = speed -5;
   return returnValue;
}

    public int getYearModel() {
        return yearModel;
    }

    public String getMake() {
        return make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }




}

