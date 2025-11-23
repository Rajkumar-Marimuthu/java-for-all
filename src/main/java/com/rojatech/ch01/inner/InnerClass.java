package com.rojatech.ch01.inner;

public class InnerClass {
    public static void main(String[] args) {
        Inner inner = new Inner();
        Inner.Private o = inner.new Private();
        System.out.println("5 is " + o.powerof2(5));
        System.out.println("8 is " + o.powerof2(8));

    }

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & (num - 1)) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
}
