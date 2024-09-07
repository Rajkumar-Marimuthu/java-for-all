package com.rojatech.ch01.abstractclass;

import lombok.Data;

// It cannot be instantiated directly; instead, it is meant to be subclassed by other classes.
// Abstract classes allow you to define common properties and methods that can be shared among multiple related classes.
// It can have both abstract methods (methods without implementations) and non-abstract methods (methods with bodies).
// Constructors Are Allowed: Abstract classes can have constructors.
// An abstract class can have final methods (methods that cannot be overridden), but an abstract method itself cannot be declared as final.
// You can define static methods in an abstract class.

@Data
public abstract class Planet {

    String size;
    String colour;

    static void printSomething() {
        System.out.println("This is static method from abstract class");
    }
}
