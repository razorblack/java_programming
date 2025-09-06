package interfaces;

public class DoublyNode {
    int val;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode() {

    }

    public DoublyNode(int val, DoublyNode next, DoublyNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
