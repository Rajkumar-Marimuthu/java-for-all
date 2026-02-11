package com.rojatech.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q002aAddTwoNumTest {

    @Test
    void testAddTwoNumbers() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        ListNode result = Q002aAddTwoNum.addTwoNumbers(l1, l2);
        // assert that the linked-list values match
        assertEquals(expected, result, () -> "expected=" + expected + " but was=" + result);
    }

}