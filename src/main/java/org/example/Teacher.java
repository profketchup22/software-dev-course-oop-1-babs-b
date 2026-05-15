package org.example;

public class Teacher {

    private String name;
    private String className;


    public Teacher(String name, String className) {
        this.name = name;
        this.className =className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String toString() {
        return name + "(" + className + ")";
    }

    // You'll need to implement this class:

    // Add private fields for name and className

    // Add a constructor that takes a name and className and initializes the corresponding fields

    // Add getter methods for name and className

    // Add setter methods for name and className

    // Add a toString method that returns the teacher's name and className in the following format:
    // name (className)
}
