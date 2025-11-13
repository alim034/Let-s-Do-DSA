package LinkedList;

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1() {}
    ListNode1(int val) {
        this.val = val;
    }
    ListNode1(int val, ListNode1 next) {
        this.val = val;
        this.next = next;
    }
}

class Solution1 {
    public ListNode1 middleNode(ListNode1 head) {
        ListNode1 slow = head;
        ListNode1 fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

public class Leetcode876 {
    public static void main(String[] args) {
        // Creating the LinkedList
        int[] nums = {1, 2, 3, 4, 5};

        ListNode1 head = new ListNode1(nums[0]);
        ListNode1 current = head;

        for(int i = 1; i < nums.length; i++) {
            current.next = new ListNode1(nums[i]);
            current = current.next;
        }

        // Calling the MiddleNode function
        Solution1 sol = new Solution1();
        ListNode1 middle = sol.middleNode(head);

        // Printing the middle part of LinkedList
        System.out.print("Middle LinkedList: ");
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }
    }
}
