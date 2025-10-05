public class Problem206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        ListNode.printValuesOfList(head);

        ListNode reversedHead = reverseList(head);

        System.out.println("Reversed List:");
        ListNode.printValuesOfList(reversedHead);
    }

    /**
     * Time On
     * Space Input On
     * Space Auxiliary O1
     * @param head first node pointer
     * @return reversed list
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
    }
}
