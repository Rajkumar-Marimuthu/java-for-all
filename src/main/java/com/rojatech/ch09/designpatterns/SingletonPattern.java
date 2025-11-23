package com.rojatech.ch09.designpatterns;

class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


}
public class SingletonPattern {

    public static void main(String[] args) {

    }
}
