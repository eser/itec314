/*
 * Write a Java program including the following methods below:
 * 
 * 1. Write a method named calc_circle_area. It has to ask user to enter the radius, and then it has to display the calculated area to the user. Note that, apply some input error detection technique to your  program to not allow application to be crashed because of wrong radius entry. (Hint: Use exception handling technique)
 * 
 * 2. Write a method named read_employee_age. That will ask from user to enter     the age of the applicant. The legal employment age is (18-65). Use exceptions     to control either input is between legal age or not.
 * 
 * 3. Write two methods "call_read_month" and "read_month". The method read_month" has to be a propagator method and has to ask user to enter the month number (1-12). If an invalid enty done it has to throw and exception including a warning message.   The method call_read_month" has to be a catcher method and it has to call   the   "read_month". It has to catch any exception that could be thrown by   "read_month" method. 
 * 
 * 4. Write a method named "read_even_number". That has to ask user to enter an   even number. Put an assertion rule into your method to be sure that the read  value is really an even number.  Test your program with an odd number.
 * 
 *  Note that. in order to use Assertions within your java project, you have to enable assertions facility in the net beans. Follow the instructions below to enable the assertions:
 *      A- Right click on the project icon in the Project panel at the left.
 *      B- Select Properties at the bottom of the drop-down menu.
 *      C- Click on the Run choice in the left panel.
 *      D- In the VM Options text field at the right, enter "-ea"
 *         (without the quotes). "ea" stands for enable assertions.
 * 
 */
package chapter08;

import java.util.*;
import org.w3c.dom.ranges.RangeException;

/**
 *
 * @author Eser Ozvataf
 */
public class Chapter08 {
    /**
     * Write a method named calc_circle_area. It has to ask user to enter the radius, and then it has to display the calculated area to the user. Note that, apply some input error detection technique to your  program to not allow application to be crashed because of wrong radius entry. (Hint: Use exception handling technique)
     */
    public static void calc_circle_area() {
        try {
            System.out.println("Enter radius: ");

            Scanner _scanner = new Scanner(System.in);
            double _radius = _scanner.nextDouble();

            double _area = Math.PI * Math.pow(_radius, 2);

            System.out.print("Area = ");
            System.out.println(_area);
        }
        catch(Exception _ex) {
            System.out.print(_ex.getClass().getName());
            System.out.print(" - ");
            System.out.println(_ex.getMessage());
        }
    }

    /**
     * Write a method named read_employee_age. That will ask from user to enter     the age of the applicant. The legal employment age is (18-65). Use exceptions     to control either input is between legal age or not.
     * @throws Exception 
     */
    public static void read_employee_age() throws Exception {
        System.out.println("Enter age of the applicant: ");

        Scanner _scanner = new Scanner(System.in);
        int _age = _scanner.nextInt();

        if(_age < 18 || _age > 65) {
            throw new Exception("applicant age is illegal.");
        }
    }

    /**
     * Write two methods "call_read_month" and "read_month". The method read_month" has to be a propagator method and has to ask user to enter the month number (1-12). If an invalid enty done it has to throw and exception including a warning message.   The method call_read_month" has to be a catcher method and it has to call   the   "read_month". It has to catch any exception that could be thrown by   "read_month" method. 
     * @throws Exception 
     */
    public static int read_month() throws Exception {
        System.out.println("Enter month (1-12): ");

        Scanner _scanner = new Scanner(System.in);
        int _month = _scanner.nextInt();

        if(_month < 1 || _month > 12) {
            throw new Exception("month is not in valid range.");
        }

        return _month;
    }

    /**
     * Wrapper method for read_month.
     */
    public static void call_read_month() {
        try {
            Chapter08.read_month();
        }
        catch(Exception _ex) {
            System.out.print(_ex.getClass().getName());
            System.out.print(" - ");
            System.out.println(_ex.getMessage());
        }
    }

    /**
     * Write a method named "read_even_number". That has to ask user to enter an   even number. Put an assertion rule into your method to be sure that the read  value is really an even number.  Test your program with an odd number.
     */
    public static void read_even_number() {
        System.out.println("Enter an even number: ");

        Scanner _scanner = new Scanner(System.in);
        int _number = _scanner.nextInt();
        assert ((_number % 2) == 0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Chapter08.calc_circle_area();

        /*
        try {
            Chapter08.read_employee_age();
            System.out.println("Condition passed.");
        }
        catch(Exception _ex) {
            System.out.print(_ex.getClass().getName());
            System.out.print(" - ");
            System.out.println(_ex.getMessage());
        }
        */

        // Chapter08.call_read_month();

        Chapter08.read_even_number();
    }
}
