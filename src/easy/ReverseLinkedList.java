/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-08-2022
 */

//Problem 206
package easy;

import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode temp = new ListNode(head.val);
        head = head.next;
        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = temp;
            temp = node;
            head = head.next;
        }
        return temp;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(reverseList(new ListNode(list.getFirst())).val);
    }
}
