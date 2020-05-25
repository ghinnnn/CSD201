package MyLinkedList;

public class Manager {
    Node head, tail;

    public Manager() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    public void addLast(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            tail.next = p;
            tail = p;
        }
    }

    public void display() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + "  ");
            p = p.next;
        }
        System.out.println("");
    }

}
