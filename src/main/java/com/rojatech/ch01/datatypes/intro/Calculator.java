package com.rojatech.ch01.datatypes.intro;

import java.util.stream.DoubleStream;

public class Calculator {
    // the ellipsis (...) in a method parameter is used to denote a variable number of arguments,
    // also known as varargs (variable-length argument lists)
    // The method then treats them as an array, and you can iterate through them
    static double add (double... operands) {
        return DoubleStream.of(operands).sum();
    }

    // the identity parameter serves as the initial or default value for the reduction operation
    static double multiply(double... operands) {
        return DoubleStream.of(operands).reduce(1,(a,b)->a*b);
    }
}
