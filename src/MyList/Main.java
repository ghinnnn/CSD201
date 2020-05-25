package MyList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        int size = Validation.checkInputInt();
        ManagerArray managerArray = new ManagerArray(size);
        managerArray.input();
        managerArray.display();
    }
}
