import java.util.Arrays;

public class Problem3217 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(10);
        ListNode listNode3 = new ListNode(9);
//        ListNode listNode4 = new ListNode(4);
//        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;

        ListNode ans = modifiedList(new int[]{9, 2, 5}, listNode1);

        ListNode.printValuesOfList(ans);
    }

    public static ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp = new ListNode();
        ListNode ans = temp;

        while (head != null) {
            if (!isArrayContainsElement(nums, head.val)) {
                temp.val = head.val;
                ListNode temp1 = new ListNode();
                temp.next = temp1;
                temp = temp.next;
            }

            head = head.next;
        }

        return ans;
    }

    private static boolean isArrayContainsElement(int[] arr, int element) {
        String arrString = Arrays.toString(arr);
        return arrString.indexOf(String.valueOf(element)) != -1;
    }
}
