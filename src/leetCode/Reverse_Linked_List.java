package leetCode;

public class Reverse_Linked_List {

    public class ListNode {

        int value;
        ListNode next;

        ListNode() {
        }

        ListNode(int data) {
            value = data;
        }

        ListNode(int data, ListNode next) {
            value = data;
            next = next;
        }


    }


    class solution {

        public ListNode reverseLinkedList(ListNode head) {
            ListNode curr = head;
            ListNode prev = null;
            ListNode next = null;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }


            return head;
        }
    }


}
