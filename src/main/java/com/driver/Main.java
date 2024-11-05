package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of RWOnly class
        RWOnly obj = new RWOnly();
        
        // Task 4: Try setting a value to name by directly accessing it using obj and printing it
        // obj.name = "John"; // This will cause an error
        // System.out.println(obj.name); // This will also cause an error

        /*
        Errors:
        - "name has private access in RWOnly"
        - This error occurs because `name` is private and cannot be accessed directly outside its class.
        */

        // Task 6: Setting and accessing the value using setter and getter
        obj.setName("John"); // Set the name using the setter
        System.out.println("Name: " + obj.getName()); // Access the name using the getter
    }
}
