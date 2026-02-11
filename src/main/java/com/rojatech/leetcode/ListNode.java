package com.rojatech.leetcode;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {}
    ListNode(int x) {
        val = x;
    }
    ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ListNode)) return false;
        ListNode a = this;
        ListNode b = (ListNode) o;
        while (a != null && b != null) {
            if (a.val != b.val) return false;
            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }

    @Override
    public int hashCode() {
        int result = 1;
        ListNode cur = this;
        while (cur != null) {
            result = 31 * result + cur.val;
            cur = cur.next;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode cur = this;
        while (cur != null) {
            sb.append(cur.val);
            cur = cur.next;
            if (cur != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }


}
