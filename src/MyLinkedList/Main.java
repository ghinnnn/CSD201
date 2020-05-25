package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        {
            Manager m = new Manager();
            m.addLast(10);//10
            m.addLast(30);//10 30
            m.addFirst(60);//60 10 30
            m.addFirst(40);//40 60 10 30
            m.addFirst(50);//50 40 60 10 30
            m.sort();
            m.display();//50 40 60 30
            m.reverse();
            m.display();
        }
    }
}
