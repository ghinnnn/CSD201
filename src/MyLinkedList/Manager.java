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

        //display
    public void display() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + "  ");
            p = p.next;
        }
        System.out.println("");
    }

    public int size() {
        Node p = head;
        int c = 0;
        while (p != null) {
            c++;
            p = p.next;
        }
        return c;
    }

    public Node get(int k) {
        Node p = head;
        int c = 0;
        while (p != null && c < k) {
            c++;
            p = p.next;
        }
        return p;
    }

    //sort the list ascending
    public void sort() {
        int n = size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Node pi = get(i), pj = get(j);
                if (pi.data > pj.data) {
                    int t = pi.data;
                    pi.data = pj.data;
                    pj.data = t;
                }
            }
        }
    }

    // search a list
    public Node search(int x) {
        Node p = head;
        while (p != null && p.data != x) p = p.next;
        return p;
    }

    //reverse a list
    public void reverse() {
        int n = size();
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            Node pi = get(i), pj = get(j);
            int t = pi.data;
            pi.data = pj.data;
            pj.data = t;
        }
    }

    // insert after position
    public void insert(int value, int position) {
        Node q = new Node(value);
        int point = 1;

        Node p = head;
        while (p!=null&&point<position) {
            p=p.next;
            point++;
        }
        // khi thoat khoi vong while, luc nay ta co
        // con tro dung o vi tri position, node dang o p
        // tiep tuc luu noi tiep theo
        Node tmp = p.next;
        p.next = q;
        q.next = tmp;
    }

    public int deleteFirst() {
        Node p = head;
        head = head.next;
        return p.data;
    }

    void addHead(int x) {
        Node q = new Node(x,null);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        q.next = head;
        head = q;
    }

    void addTail(int x) {
        Node q = new Node(x, null);
        if (isEmpty()) {
            head = tail = q;
            return;
        }
        tail.next = q;
        tail = q;
    }

    void traver() {
        Node p;
        p = head;
        while (p != null) {
            System.out.print("\t" + p.data);
            p = p.next;
        }
        System.out.println();

    }
}
