package com.rojatech.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q001aTwoSumTest {

    @Test
    void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, Q001aTwoSum.twoSum(nums, target));
    }




}