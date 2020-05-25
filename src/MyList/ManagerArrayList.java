package MyList;

import java.util.ArrayList;

public class ManagerArrayList {
    ArrayList<Integer> integerArrayList = new ArrayList<>();
    int n;

    public ManagerArrayList(int n) {
        this.n = n;
    }

    public void displayArrayList() {
        for (Integer value : integerArrayList) {
            System.out.println(" " + value);
        }
    }

    public void enteArrayList() {
        int value;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements");
            value = Validation.checkInputInt();
            integerArrayList.add(value);
        }

    }
}
