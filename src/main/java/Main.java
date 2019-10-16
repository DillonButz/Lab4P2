
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
        int speed = 0;
        Car carObj = new Car(0, "Toyota", speed);
        int iAcc = 0;
        int iBra = 0;
        while (iAcc < 5) {
            speed = speed + carObj.accelertate();
            System.out.println(speed);
            iAcc++;
        }
        while (iBra < 5) {
            speed = speed + carObj.brake();
            System.out.println(speed);
            iBra++;
        }

    }

}
