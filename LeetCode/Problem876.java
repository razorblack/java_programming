public class Problem876 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode result = middleNode(listNode1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    // Time On Space O1
    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int numberOfNodes = 0;
        while (temp != null) {
            temp = temp.next;
            numberOfNodes++;
        }
        int middleIndex = numberOfNodes / 2;
        for (int i = 0; i < middleIndex; i++) {
            head = head.next;
        }
        return head;
    }
}
