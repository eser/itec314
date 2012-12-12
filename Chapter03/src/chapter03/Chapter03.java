/*
 * A. Write Java programs for the given details below.
 * 
 *  1.	A program that will read radius as integer from the user, and then calculate and print the area and circumference of a circle. Display the output in both ways; message dialog and standard output. Get input with input dialog.
 * 	PI=3.14159
 * 
 *  2.	A program that will read three integers in standard input way. Then it will display the read numbers, sum and average of them in standard output.
 * 
 *  3.	A program that that will read two double vales (x and y), then calculates the equation given below. Use the standard input and output. (Hint: page 113)
 * 
 * 	sqrt(x ^ 2 - y ^ 2) / sqrt(x ^ 2 + y ^ 2)
 * 	Note that, get the absolute values before calculating the squire roots!
 * 
 *  4.	A program that will read two integers x and y, the program then will generate and display a random number between x and y. (Hint: page 118)
 * 
 *  5.	A program that will read the user’s birth date as day month and year order, then it will calculate and print the day of week (1-7) of that date. (Hint: page 123)
 * 
 */
package chapter03;

import java.text.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Eser Ozvataf
 */
public class Chapter03 {
    /**
     * A program that will read radius as integer from the user, and then calculate and print the area and circumference of a circle. Display the output in both ways; message dialog and standard output. Get input with input dialog.
     * PI=3.14159
     */
    public static void A1() {
        final double _pi = 3.14159; // Math.PI;
        
        System.out.print("Enter radius: ");

        Scanner _scanner = new Scanner(System.in);
        double _radius = _scanner.nextDouble();
        
        double _area = _pi * Math.pow(_radius, 2);
        double _circumference = _pi * _radius * 2;

        System.out.print("Area = ");
        System.out.println(_area);

        System.out.print("Circumference = ");
        System.out.println(_circumference);
        
        JOptionPane.showMessageDialog(null, "Area = " + _area + "\nCircumference = " + _circumference, "a message dialog", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * A program that will read three integers in standard input way. Then it will display the read numbers, sum and average of them in standard output.
     */
    public static void A2() {
        int[] _numbers = new int[3];
        
        Scanner _scanner = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        for(int i = 0; i < _numbers.length; i++) {
            _numbers[i] = _scanner.nextInt();
        }

        System.out.println("The numbers are so:");
        int _totals = 0;
        for(int i = 0; i < _numbers.length; i++) {
            _totals += _numbers[i];
            System.out.println(_numbers[i]);
        }
        float _average = _totals / _numbers.length;

        System.out.print("Total = ");
        System.out.println(_totals);

        System.out.print("Average = ");
        System.out.println(_average);
    }

    /**
     * A program that that will read two double vales (x and y), then calculates the equation given below. Use the standard input and output. (Hint: page 113)
     * 
     * 	sqrt(x ^ 2 - y ^ 2) / sqrt(x ^ 2 + y ^ 2)
     * 	Note that, get the absolute values before calculating the squire roots!
     */
    public static void A3() {
        System.out.println("Enter X and Y:");

        Scanner _scanner = new Scanner(System.in);
        double _x = _scanner.nextDouble();
        double _y = _scanner.nextDouble();

        double _result =
            (Math.sqrt(Math.abs(Math.pow(_x, 2) - Math.pow(_y, 2)))) /
            (Math.sqrt(Math.abs(Math.pow(_x, 2) + Math.pow(_y, 2))));
        
        System.out.print("The result is ");
        System.out.println(_result);
    }

    /**
     * A program that will read two integers x and y, the program then will generate and display a random number between x and y. (Hint: page 118)
     */
    public static void A4() {
        System.out.println("Enter X and Y:");

        Scanner _scanner = new Scanner(System.in);
        int _x = _scanner.nextInt();
        int _y = _scanner.nextInt();

        Random _random = new Random();
        
        int _randomNumber = _x + _random.nextInt(_y - _x + 1);
        
        System.out.print("The generated random number is ");
        System.out.println(_randomNumber);
    }

    /**
     * A program that will read the user’s birth date as day month and year order, then it will calculate and print the day of week (1-7) of that date. (Hint: page 123)
     */
    public static void A5() {
        System.out.print("Enter your birth day in DD/MM/YYYY: ");

        Scanner _scanner = new Scanner(System.in);
        String _input = _scanner.next();

        int _day = Integer.parseInt(_input.substring(0, 2));
        int _month = Integer.parseInt(_input.substring(3, 5));
        int _year = Integer.parseInt(_input.substring(6, 10));

        Calendar _calendar = Calendar.getInstance();
        _calendar.set(_year, _month, _day);

        System.out.println("Birthdate: " + _calendar.getTime());
        System.out.println("Weekday: " + _calendar.get(Calendar.DAY_OF_WEEK));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Chapter03.A1();
        // Chapter03.A2();
        // Chapter03.A3();
        // Chapter03.A4();
        Chapter03.A5();
    }
}
