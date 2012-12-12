/*
 * A. Define a class named student having the following data values and methods:
 * 
 * Data values:
 * 1. student_no: string
 * 2. name: string
 * 3. surname: string
 * 4. department: string
 * 5. gpa: double
 * 6. cgpa: double
 * 
 * Methods: 
 * 1. set_std_no(stdno:string) : Sets the argument to the student_no data value.
 * 2. get_std_no(): Returns the current value of student_no data value.
 * 3. set_name(nm:string) : Sets the argument to the name data value.
 * 4. get_name(): Returns the current value of name data value.
 * 5. set_surname(snm:string) : Sets the argument to the surname data value.
 * 6. get_surname(): Returns the current value of surname data value.
 * 7. set_department (dept:string) : Sets the argument to the department data value.
 * 8. get_departmen(): Returns the current value of department data value.
 * 9. set_gpa(gp:double) : Sets the argument to the gpa data value.
 * 10. get_gpa(): Returns the current value of gpa data value.
 * 11. set_cgpa(cgp:double) : Sets the argument to the cgpa data value.
 * 12. get_cgpa(): Returns the current value of cgpa data value.
 * 
 * B. In the main program, 
 * 1. Define 3 instance (objects) of this class.
 * 2. Ask user information of 3 students and then set them to the appropriate instance data values with calling methods of you.
 * 3. Finally display information of these three students in a tabular format, using your get_??? methods.
 * 4. At the end of the table calculate and display the average GPA and CGPA of these three students.
 */
package chapter04;

import java.util.*;

/**
 *
 * @author Eser Ozvataf
 */
public class Chapter04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student[] _students = new student[3];

        Scanner _scanner = new Scanner(System.in);
        for(int i = 0; i < _students.length; i++) {
            _students[i] = new student();

            System.out.println("Details for student " + (i + 1));
            System.out.println("=====================");

            System.out.print("Enter student number: ");
            _students[i].set_std_no(_scanner.next());

            System.out.print("Enter name: ");
            _students[i].set_name(_scanner.next());

            System.out.print("Enter surname: ");
            _students[i].set_surname(_scanner.next());

            System.out.print("Enter Department: ");
            _students[i].set_department(_scanner.next());

            System.out.print("Enter GPA: ");
            _students[i].set_gpa(_scanner.nextDouble());

            System.out.print("Enter CGPA: ");
            _students[i].set_cgpa(_scanner.nextDouble());
        }

        System.out.println();
        System.out.println("==\t============\t=====\t===\t====");
        System.out.println("No\tName Surname\tDept.\tGPA\tCGPA");
        System.out.println("==\t============\t=====\t===\t====");

        double _gpaTotal = 0.0f;
        double _cgpaTotal = 0.0f;
        for(int i = 0; i < _students.length; i++) {
            System.out.print(_students[i].get_std_no());
            System.out.print('\t');

            System.out.print(_students[i].get_name());
            System.out.print(' ');
            System.out.print(_students[i].get_surname());
            System.out.print('\t');

            System.out.print(_students[i].get_department());
            System.out.print('\t');

            System.out.print(_students[i].get_gpa());
            System.out.print('\t');

            System.out.print(_students[i].get_cgpa());
            System.out.println();

            _gpaTotal += _students[i].get_gpa();
            _cgpaTotal += _students[i].get_cgpa();
        }

        System.out.println("==\t============\t=====\t===\t====");
        System.out.println();

        System.out.println("Average GPA: " + (_gpaTotal / _students.length));
        System.out.println("Average CGPA: " + (_cgpaTotal / _students.length));
    }
}
