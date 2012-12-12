/*
 * Write Java programs to solve the given problems below:
 * 
 *  Write a program in Java, that will have two classes (Car_sale, Car) which details are given below. 
 *  •	Within the main method, create an object of the class Call_sale, and then call its new_car method that will create an object of Class Car, and return the address of the created object to the back. 
 *  •	Also, each created Car object will have an unique id (use a Class variable).
 * 
 */
package chapter07;

import java.util.*;

/**
 *
 * @author Eser Ozvataf
 */
public class Chapter07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car_sale _carsale = new Car_sale();

        Car _car = _carsale.new_car();
        System.out.println(_car.get_id());
    }
}
