package MyList;

public class MainArrayList {
    public static void main(String[] args) {
        System.out.println("Enter size of array list: ");
        int size= Validation.checkInputInt();
        ManagerArrayList marrl = new ManagerArrayList(size);
        marrl.enteArrayList();
        marrl.displayArrayList();
    }
}
