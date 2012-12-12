/*
 * A. Write the programs in Java, the details given below.
 * 
 *  1.	Display a Java window with title “Hello World”, size (400,300).
 * 
 *  2.	Display a message dialog window with a caption “I love Java”.
 * 
 *  3.	Display a message dialog window with a caption five lines long as 
 *      “Shopping list:”
 *      “Apple”
 *      “Banana”
 *      “Bread”
 *      “Milk”
 * 
 *  4.  Display a message dialog window with a caption including date of today in dd/mm/yyy format.
 * 
 *  5.  Ask name from user with input dialog and say “Hello  <name>” with message dialog.
 *      Sample run.
 *
 *      Enter Your name: Cem
 * 
 *      Hello Cem
 * 
 * B. Self Work
 * 
 *  1.  From your work book (page 67), read and study the sample development part “Printing the initials”.
 *      Specially focus on the methods:
 *          text.substring();
 *          text.indexOf();
 * 
 */
package chapter02;

import java.text.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Eser Ozvataf
 */
public class Chapter02 {
    /**
     * Display a Java window with title “Hello World”, size (400,300).
     */
    public static void A1() {
        JFrame _jframe = new JFrame();
        _jframe.setSize(400, 300);
        _jframe.setTitle("Hello World");
        _jframe.setVisible(true);
    }
    
    /**
     * Display a message dialog window with a caption “I love Java”.
     */
    public static void A2() {
        JOptionPane.showMessageDialog(null, "I love Java", "a message dialog", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Display a message dialog window with a caption five lines long as 
     *      “Shopping list:”
     *      “Apple”
     *      “Banana”
     *      “Bread”
     *      “Milk”
     */
    public static void A3() {
        JOptionPane.showMessageDialog(null, "Shopping List:\nApple\nBanana\nBread\nMilk", "a message dialog", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Display a message dialog window with a caption including date of today in dd/mm/yyy format.
     */
    public static void A4() {
        Date _now = new Date();
        SimpleDateFormat _dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        JOptionPane.showMessageDialog(null, _dateFormat.format(_now), "a message dialog", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Ask name from user with input dialog and say “Hello  <name>” with message dialog.
     *      Sample run.
     *
     *      Enter Your name: Cem
     * 
     *      Hello Cem
     */
    public static void A5() {
        String _name = JOptionPane.showInputDialog(null, "Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " + _name, "a message dialog", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Chapter02.A1();
        // Chapter02.A2();
        // Chapter02.A3();
        // Chapter02.A4();
        Chapter02.A5();
    }
}
