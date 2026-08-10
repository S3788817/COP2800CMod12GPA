// DataWrapper.java
// Trenton Taylor
// 8/9/26
// Generic wrapper class for data objects

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {

    private T value;

    // Constructor
    public DataWrapper(T value) {

        this.value = value;
    }

    // Getter method
    public T getValue() {

        return value;
    }

    // Display all wrapped objects in a list
    public static <T> void displayList(
            List<DataWrapper<T>> list) {

        for (DataWrapper<T> element : list) {

            // getValue drills down to the object's toString
            System.out.println(element.getValue());
        }
    }
}