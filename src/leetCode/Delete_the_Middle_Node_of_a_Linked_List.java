package leetCode;

public class Delete_the_Middle_Node_of_a_Linked_List {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }
//added
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode deleteMiddle(ListNode head) {
        if (head == null) return null;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode slow = prev;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return prev.next;

    }
}

