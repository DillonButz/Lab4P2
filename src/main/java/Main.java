/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djon Bon Junzi
 */
public class Main {

    public static void main(String[] args) {

        Car carobj = new Car(0, "toyota", 0);
        int speed = carobj.getSpeed();
        int iAcc = 0;
        int iBra = 0;

        while (iAcc < 5) {
            speed = speed + carobj.accelertate();
            System.out.println(speed);
            iAcc++;
        }
        while (iBra < 5) {
            speed = speed + carobj.brake();
            System.out.println(speed);
            iBra++;
        }
    }
}
