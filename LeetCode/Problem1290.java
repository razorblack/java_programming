public class Problem1290 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(1);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(getDecimalValue1(listNode1));
    }

    // Time On Space O1
    public static int getDecimalValue(ListNode head) {
        int ans = 0;

        String binary = "";

        while (head != null) {
            binary += String.valueOf(head.val);
            head = head.next;
        }

        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(binary.length() - i -1);
            ans += Math.pow(2, i) * Integer.parseInt(String.valueOf(ch));
        }

        return ans;
    }

    // Time On Space O1 : Faster than above solution
    public static int getDecimalValue1(ListNode head) {

        StringBuilder binary = new StringBuilder();

        while (head != null) {
            binary.append(head.val);
            head = head.next;
        }

        return Integer.parseInt(binary.toString(), 2);
    }
}
