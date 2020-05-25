package Test;

public class Main {
    public static void main(String[] args) {
        Function func = new Function();
        int choice;
        do {
            choice = Function.menu();
            switch(choice){
                case 1: func.add();
                    break;
                case 2: func.display();
                    break;
                case 3: func.delete();
                    break;
                case 0: break;
                default:
                    System.err.println("Wrong value");
                    break;
            }
        } while (choice!=0);
    }
}
