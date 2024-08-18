public class Problem2181 {
    public static void main(String[] args) {
        ListNode testNode1 = new ListNode(0);
        ListNode testNode2 = new ListNode(3);
        ListNode testNode3 = new ListNode(1);
        ListNode testNode4 = new ListNode(0);
        ListNode testNode5 = new ListNode(4);
        ListNode testNode6 = new ListNode(5);
        ListNode testNode7 = new ListNode(2);
        ListNode testNode8 = new ListNode(0);
        testNode1.next = testNode2;
        testNode2.next = testNode3;
        testNode3.next = testNode4;
        testNode4.next = testNode5;
        testNode5.next = testNode6;
        testNode6.next = testNode7;
        testNode7.next = testNode8;

        ListNode mergeNode = mergeNodes(testNode1);
        while (mergeNode != null) {
            System.out.print(mergeNode.val + "->");
            mergeNode = mergeNode.next;
        }

    }

    // Time On Space On
    public static ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode();
        int count = 0;
        // as start of node is 0
        do {

        } while (head != null);
        return ans;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
