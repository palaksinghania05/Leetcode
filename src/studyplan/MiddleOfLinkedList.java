/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-08-2022
 */

package studyplan;

import java.util.ArrayList;

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

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        int[] linkedlist = {1, 2, 3, 4, 5};
        System.out.println(middleNode(new ListNode(linkedlist[0])));
    }

    public static ListNode middleNode(ListNode head) {
        // Make a ListNode equal to the LinkedList parameter
        ListNode middleNode = head;

        // Make an arraylist to store all the values in LinkedList parameter
        ArrayList arrayList = new ArrayList<>();

        // Add all the values in LinkedList to ArrayList
        while (middleNode != null) {
            arrayList.add(middleNode.val);
            middleNode = middleNode.next;
        }

        // Since the middle is always the size / 2, we make for loop while head will eventually point to the middle node
        for (int i = 0; i < (arrayList.size() / 2); ++i) {
            head = head.next;
        }

        return head;
    }
}
