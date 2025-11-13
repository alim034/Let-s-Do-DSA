package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}

public class Leetcode206 {
    public static void main(String[] args) {

        // Creating a Linked List:
        int[] nums = {1,2,3,4,5};

        ListNode head = new ListNode(nums[0]);
        ListNode current = head;

        for(int i=1; i<nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }


        // Calling reverse function
        Solution sol = new Solution();
        ListNode reversed = sol.reverseList(head);

        // Printing reversed LinkedList
        System.out.print("Reversed List: ");
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }
}
