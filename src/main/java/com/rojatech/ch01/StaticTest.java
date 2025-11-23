package com.rojatech.ch01;

import java.util.Scanner;

public class StaticTest {

    private static final int B;
    private static final int H;
    private static final boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = B > 0 && H > 0;
        sc.close();

    }
    public static void main(String[] args) throws Exception {
        if(flag){
            int area=B*H;
            System.out.print(area);
        } else {
            throw new Exception("Breadth and height must be positive");
        }
    }
}
