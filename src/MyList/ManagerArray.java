package MyList;

public class ManagerArray {
    int[] arr;
    int n;

    public ManagerArray() {

    }

    public ManagerArray(int size) {
        arr = new int[size];
        n = size;
    }

    public void display() {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public void input() {
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Enter elements " + i + ": ");
            arr[i] = Validation.checkInputInt();
        }
    }
}
