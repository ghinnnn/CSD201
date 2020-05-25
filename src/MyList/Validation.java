package MyList;

import java.util.Scanner;

public class Validation {
    public static final Scanner in = new Scanner(System.in);
    public static int checkInputInt() {

        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input Integer");
                System.out.print("Enter again: ");
            }
        }
    }
}
