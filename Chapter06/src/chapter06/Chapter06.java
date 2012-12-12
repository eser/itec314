/*
 * Write Java programs to solve the given problems below:
 * 
 * 1. A program that will read an integer number (num) and then it will calculate the num! (factorial) (num!=num * (num-1) * …* 3* 2* 1) (Hint use a FOR loop)
 * 
 * 2. A program including method “average_calculator” , that will continuously ask from user to enter an integer, until a negative number is entered to stop, then it will calculate the average of those numbers and display it. (Hint. Use a while loop)
 * 
 * 3. A program for playing guess my number game. Program will generate an integer number between 1 to 100, and it will continuously ask user to guess the number and will lead him/her with the messages “Guess bigger” and/or “Guess smaller”. It will count the tries of the user and report it at the and as “My number was ???, you found it in XX tries”. (Hint. Use random number generator method page.117, and a while loop, an IF statement)
 * 
 * 4. A program that will read an integer number (num), and then it will check and report either num is a prime number or not. A prime number only can be divisible 1 and itself) (Hint. Use nested FOR statements, and % (modulus) operator)
 * 
 * 5. A program that will ask user an integer number (num), and will display the nxn multiplication matrix as sampled below. (Hint. Use nested FOR loops and formatting output (page.329))
 * 
 * Sample Run:
 *  Enter the number: 4
 * 
 *  	1	2	3	4
 *  1	1	2	3	4
 *  2	2	4	6	8
 *  3	3	6	9	12
 *  4	4	8	12	16
 */
package chapter06;

import java.util.*;

/**
 *
 * @author Eser Ozvataf
 */
public class Chapter06 {
    /**
     * A program that will read an integer number (num) and then it will calculate the num! (factorial) (num!=num * (num-1) * …* 3* 2* 1) (Hint use a FOR loop)
     */
    public static void A1() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();
        int factorial = 1;
        
        for(int i = 2; i <= number;i++) {
            factorial *= i;
        }
        
        System.out.println("factorial: " + factorial);
    }

    /**
     * A program including method “average_calculator” , that will continuously ask from user to enter an integer, until a negative number is entered to stop, then it will calculate the average of those numbers and display it. (Hint. Use a while loop)
     */
    public static void A2() {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int total = 0;

        while(true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if(number < 0) {
                break;
            }
            
            total += number;
            count++;
        }

        System.out.println("average: " + (total / count));
    }

    /**
     * A program for playing guess my number game. Program will generate an integer number between 1 to 100, and it will continuously ask user to guess the number and will lead him/her with the messages “Guess bigger” and/or “Guess smaller”. It will count the tries of the user and report it at the and as “My number was ???, you found it in XX tries”. (Hint. Use random number generator method page.117, and a while loop, an IF statement)
     */
    public static void A3() {
        Scanner scanner = new Scanner(System.in);
        
        Random random = new Random();
        int mynumber = random.nextInt(99) + 1;
        int tries = 0;

        while(true) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if(number < mynumber) {
                System.out.println("guess bigger");
            }
            else if(number > mynumber) {
                System.out.println("guess smaller");
            }
            else {
                break;
            }
            
            tries++;
        }

        System.out.println("my number was " + mynumber + ". you found it in " + tries + " tries.");
    }

    /**
     * A program that will read an integer number (num), and then it will check and report either num is a prime number or not. A prime number only can be divisible 1 and itself) (Hint. Use nested FOR statements, and % (modulus) operator)
     */
    public static void A4() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean primeNumber = true;
        for(int i = 2; i < 10;i++) {
            if(i == number) {
                continue;
            }
            
            if((number % i) == 0) {
                primeNumber = false;
            }
        }

        if(primeNumber) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number + " is NOT a prime number.");
        }
    }

    /**
     * A program that will ask user an integer number (num), and will display the nxn multiplication matrix as sampled below. (Hint. Use nested FOR loops and formatting output (page.329))
     * 
     * Sample Run:
     *  Enter the number: 4
     * 
     *  	1	2	3	4
     *  1	1	2	3	4
     *  2	2	4	6	8
     *  3	3	6	9	12
     *  4	4	8	12	16
     */
    public static void A5() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for(int x = 1; x <= number; x++) {
            System.out.print("\t" + x);
        }
        System.out.println();

        for(int y = 1; y <= number; y++) {
            System.out.print(y + "\t");
            for(int x = 1; x <= number; x++) {
                System.out.print(x * y + "\t");
            }
            System.out.println();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Chapter06.A1();
        // Chapter06.A2();
        // Chapter06.A3();
        // Chapter06.A4();
        Chapter06.A5();
    }
}
