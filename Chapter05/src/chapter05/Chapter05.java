/*
 * Write the java programs for solving the given problems below.
 * 
 * 1. A program that will read the student grade in integer, and will calculate and display the letter grade up to the given scala below. (Hint: Use nested IF statements)
 * 
 * 	90 = x		=>  A
 * 	89 = x = 80     =>  B
 * 	79 = x = 70     =>  C
 * 	69 = x = 60     =>  D
 * 	59 = x = 50     =>  E
 * 	49 = x 	        =>  F
 * 
 * 2. A program that will ask user the his/her academic year and forward him/her to the classroom up to the conditions below: (Hint: Use Switch-case statements)
 * 
 * 	(1)	? first year student 		? CT001
 * 	(2)	? second year student   	? CT124
 * 	(3)	? third year student 		? CT125
 * 	(4)	? forth year student 		? CT126
 * 
 * 3. A program that read a an integer (year), then decides whether it is a leap year (29 days in February) or not a leap year (28 days in February), considering the given criteria below: (Hint: Use nested IF-ELSE statements)
 * 
 * 	A leap year is divisible by 4. (2004  was a leap year)
 * 	A leap year is not divisible by 100 (if it is not also divisible by 4). (1800 is not a leap year)
 * 	A leap year also can be divisible by 400 (2000 is a leap year but 1800 is not).
 * 
 * 
 * 4. A program that ask user burger, chips, drink choices and calculate the fee of his/her choice considering the given price list. (Hint. Use switch-case statements)
 * 
 * 	Burger Choices		Burges Type			Price		Chips Choices	Chips Portion	Price
 * 	1			Beef burger			$1.5 		1 		Small 		$0.5
 * 	2			Double BB			$2.5 		2 		Medium		$1.0
 * 	3			Cheese B			$2.0 		3 		Large 		$1.5
 * 	4			Double Cheese B                 $3.0
 * 								
 * 	Drink Choices		Drinks		Price
 * 	1			Water		$0.5
 * 	2			Ayran		$1.0
 * 	3			Cola 		$2,0
 */
package chapter05;

import java.util.*;

/**
 *
 * @author Eser Ozvataf
 */
public class Chapter05 {
    /**
     * A program that will read the student grade in integer, and will calculate and display the letter grade up to the given scala below. (Hint: Use nested IF statements)
     * 
     * 	90 = x		=>  A
     * 	89 = x = 80     =>  B
     * 	79 = x = 70     =>  C
     * 	69 = x = 60     =>  D
     * 	59 = x = 50     =>  E
     * 	49 = x 	        =>  F
     */
    public static void A1() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a grade: ");
        
        int grade = scanner.nextInt();
        char mark;
        
        if(grade >= 90) {
            mark = 'A';
        }
        else if(grade >= 80) {
            mark = 'B';
        }
        else if(grade >= 70) {
            mark = 'C';
        }
        else if(grade >= 60) {
            mark = 'D';
        }
        else if(grade >= 50) {
            mark = 'E';
        }
        else {
            mark = 'F';
        }
        
        System.out.println(mark);
    }

    /**
     * A program that will ask user the his/her academic year and forward him/her to the classroom up to the conditions below: (Hint: Use Switch-case statements)
     * 
     * 	(1)	? first year student 		? CT001
     * 	(2)	? second year student   	? CT124
     * 	(3)	? third year student 		? CT125
     * 	(4)	? forth year student 		? CT126
     */
    public static void A2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your academic year: ");
        
        int year = scanner.nextInt();
        
        switch(year) {
            case 1:
                System.out.println("First year student -> CT001");
                break;
            case 2:
                System.out.println("Second year student -> CT002");
                break;
            case 3:
                System.out.println("Third year student -> CT003");
                break;
            case 4:
                System.out.println("Forth year student -> CT004");
                break;
            default:
                System.out.println("error");
                break;
        }
    }

    /**
     * A program that read a an integer (year), then decides whether it is a leap year (29 days in February) or not a leap year (28 days in February), considering the given criteria below: (Hint: Use nested IF-ELSE statements)
     * 
     * 	A leap year is divisible by 4. (2004  was a leap year)
     * 	A leap year is not divisible by 100 (if it is not also divisible by 4). (1800 is not a leap year)
     * 	A leap year also can be divisible by 400 (2000 is a leap year but 1800 is not).
     */
    public static void A3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        
        int year = scanner.nextInt();
        
        if(((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is NOT a leap year.");
        }
    }

    /**
     * A program that ask user burger, chips, drink choices and calculate the fee of his/her choice considering the given price list. (Hint. Use switch-case statements)
     * 
     * 	Burger Choices		Burges Type			Price		Chips Choices	Chips Portion	Price
     * 	1			Beef burger			$1.5 		1 		Small 		$0.5
     * 	2			Double BB			$2.5 		2 		Medium		$1.0
     * 	3			Cheese B			$2.0 		3 		Large 		$1.5
     * 	4			Double Cheese B                 $3.0
     * 								
     * 	Drink Choices		Drinks		Price
     * 	1			Water		$0.5
     * 	2			Ayran		$1.0
     * 	3			Cola 		$2,0
     */
    public static void A4() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Burger Choice: ");
        int burger = scanner.nextInt();

        System.out.println("Chip Choice: ");
        int chip = scanner.nextInt();

        System.out.println("Drink Choice: ");
        int drink = scanner.nextInt();
        
        float total = 0;
        
        switch(burger) {
            case 1:
                System.out.println("Beef burger: 1.5$");
                total += 1.5;
                break;
            case 2:
                System.out.println("Double BB burger: 2.5$");
                total += 2.5;
                break;
            case 3:
                System.out.println("Cheese burger: 2.0$");
                total += 2.0;
                break;
            case 4:
                System.out.println("Double cheese burger: 3.0$");
                total += 3.0;
                break;
        }
        
        switch(chip) {
            case 1:
                System.out.println("Small: 0.5$");
                total += 0.5;
                break;
            case 2:
                System.out.println("Medium: 1.0$");
                total += 1.0;
                break;
            case 3:
                System.out.println("Large: 1.5$");
                total += 1.5;
                break;
        }
        
        switch(drink) {
            case 1:
                System.out.println("Water: 0.5$");
                total += 0.5;
                break;
            case 2:
                System.out.println("Ayran: 1.0$");
                total += 1.0;
                break;
            case 3:
                System.out.println("Cola: 2.0$");
                total += 2.0;
                break;
        }
        
        System.out.println("-- TOTAL: " + total);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Chapter05.A1();
        // Chapter05.A2();
        // Chapter05.A3();
        Chapter05.A4();
    }
}
