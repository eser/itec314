/*
 * @ignore
 */
package chapter07;

/**
 *
 * @author Eser Ozvataf
 */
public class Car {
    private static int uniqueCarId = 0;
    private final int id;

    /**
     * @ignore
     */
    public Car() {
        id = Car.uniqueCarId++;
    }

    /**
     * @return the id
     */
    public int get_id() {
        return id;
    }
}
