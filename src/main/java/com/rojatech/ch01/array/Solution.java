package com.rojatech.ch01.array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int[] numList = {2,4,4,5,2};
        int num = run(numList);
        System.out.println(num);
    }

    public static int run(int[] student_list) {
        int single_student_number = 0;
        for (int student: student_list) {
            single_student_number ^= student;
        }

        return single_student_number;
    }
}