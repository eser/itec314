/*
 * @ignore
 */
package chapter04;

/**
 *
 * @author Eser Ozvataf
 */
public class student {
    private String student_no;
    private String name;
    private String surname;
    private String department;
    private double gpa;
    private double cgpa;

    /**
     * @return the student_no
     */
    public String get_std_no() {
        return student_no;
    }

    /**
     * @param student_no the student_no to set
     */
    public void set_std_no(String student_no) {
        this.student_no = student_no;
    }

    /**
     * @return the name
     */
    public String get_name() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void set_name(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String get_surname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void set_surname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the department
     */
    public String get_department() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void set_department(String department) {
        this.department = department;
    }

    /**
     * @return the gpa
     */
    public double get_gpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void set_gpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the cgpa
     */
    public double get_cgpa() {
        return cgpa;
    }

    /**
     * @param cgpa the cgpa to set
     */
    public void set_cgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
