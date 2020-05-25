package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        {
            Manager m = new Manager();
            m.addLast(10);
            m.addLast(30);
            m.addFirst(60);
            m.addFirst(40);
            m.addFirst(50);
            m.display();
            System.out.println("================");
            m.insert(90,4);
            m.display();
            System.out.println("================");
            m.addHead(30);
            m.addTail(40);
            m.display();
        }
    }
}
