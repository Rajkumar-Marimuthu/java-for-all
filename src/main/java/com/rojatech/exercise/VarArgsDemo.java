package com.rojatech.exercise;

import java.util.Scanner;

class Add {
    void add(int... numbers) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i > 0) sb.append("+");
            sb.append(numbers[i]);
            sum += numbers[i];
        }
        System.out.println(sb.toString() + "=" + sum);
    }
}

public class VarArgsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Add addObj = new Add();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        addObj.add(a, b);
        addObj.add(a, b, c);
        addObj.add(a, b, c, d, e);
        addObj.add(a, b, c, d, e, f);
        scanner.close();
    }

}
