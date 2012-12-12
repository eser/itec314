/*
 * Write a Java program including the following methods to solve the given problems below:
 * 
 * 1. Write a method named ChangeCaseToUpper, that will get a string argument, and will convert all small case letters to the Upper Case. It will return the resulting string back to the caller.
 * 
 * 2. Write a method named ChangeCaseToTitle, that will get a string argument, and will convert all first letters of words to the upper case letters, and the remaining letters to the small case. It will return the resulting string back to the caller.
 * 
 * 3. Write a method named EncryptText, that will get a string argument, and will convert all letters upto the following rules. It will return the resulting string back to the caller.
 *	Rules:	‘a’ and ‘A’ will be ‘@’, ‘c’ and ‘C’ will be ‘<’, ‘i’ and ‘I’ will be ‘|’, 
 *		‘s’ and ‘S’ will be ‘$’, ‘l’ and ‘L’ will be ‘!’, and space character will be ‘^’.
 */
package chapter09;

import java.util.*;

/**
 *
 * @author Eser Ozvataf
 */
public class Chapter09 {
    /**
     * Write a method named ChangeCaseToUpper, that will get a string argument, and will convert all small case letters to the Upper Case. It will return the resulting string back to the caller.
     * @param input
     * @return 
     */
    public static String ChangeCaseToUpper(String input) {
        String _output = "";
        int _diff = 'a' - 'A';

        for(int i = input.length() - 1; i >= 0; i--) {
            char _ch = input.charAt(i);
            if(_ch >= 'a' && _ch <= 'z') {
                _output = (char)(_ch - _diff) + _output;
                continue;
            }
            
            _output = (char)_ch + _output;
        }
        
        return _output;
    }

    /**
     * Write a method named ChangeCaseToTitle, that will get a string argument, and will convert all first letters of words to the upper case letters, and the remaining letters to the small case. It will return the resulting string back to the caller.
     * @param input
     * @return 
     */
    public static String ChangeCaseToTitle(String input) {
        String _output = "";
        int _diff = 'a' - 'A';
        int _length = input.length();
        char _prevChar = ' ';

        for(int i = 0; i < _length; i++) {
            char _ch = input.charAt(i);

            if(_prevChar == ' ' && (_ch >= 'a' && _ch <= 'z')) {
                _output += (char)(_ch - _diff);
            }
            else {
                _output += (char)_ch;
            }

            _prevChar = _ch;
        }
        
        return _output;
    }

    /**
     * Write a method named EncryptText, that will get a string argument, and will convert all letters upto the following rules. It will return the resulting string back to the caller.
     *	Rules:	‘a’ and ‘A’ will be ‘@’, ‘c’ and ‘C’ will be ‘<’, ‘i’ and ‘I’ will be ‘|’, 
     *		‘s’ and ‘S’ will be ‘$’, ‘l’ and ‘L’ will be ‘!’, and space character will be ‘^’.
     * 
     * @param input
     * @return 
     */
    public static String EncryptText(String input) {
        String _output = input
                .replace('a', '@')
                .replace('A', '@')
                .replace('c', '<')
                .replace('C', '<')
                .replace('i', '|')
                .replace('I', '|')
                .replace('s', '$')
                .replace('S', '$')
                .replace('l', '!')
                .replace('L', '!')
                .replace(' ', '^');
        
        return _output;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Chapter09.ChangeCaseToUpper("eser ozvataf 100178 test java"));
        
        System.out.println(Chapter09.ChangeCaseToTitle("eser ozvataf 100178 test java"));
        
        System.out.println(Chapter09.EncryptText("eser ozvataf 100178 test java"));
    }
}
