package Test;

public class Function {
    GenericCustomer<Customer> cc = new GenericCustomer();

    public int isExist(String name){
        for (int i=0; i<cc.getCustomerList().size();i++)
            if(cc.getCustomerList().get(i).getName().equalsIgnoreCase(name)) return i;
        return -1;
    }

    public void add(){
        String name;
        String id;
        System.out.print("Input Name: ");
        name = Validation.checkInputString();
        System.out.print("Please input ID: ");
        id = Validation.checkInputString();
        cc.getCustomerList().add(new Customer(id, name));
        }

    public void display(){
        if(cc.getCustomerList().isEmpty())
            System.out.println("List empty!");
        else{
            System.out.println("List of customers:");
            for (int i=0; i<cc.getCustomerList().size();i++)
                System.out.println(i+1+". "+cc.getCustomerList().get(i));
        }

    }

    public void delete(){
        if(cc.getCustomerList().isEmpty())
            System.out.println("List empty!");
        else{
            display();
            System.out.print("Enter position to delete: ");
            int position = Validation.checkInputInt();
            int amount = cc.getCustomerList().size();
            if(position>=amount || position<=0){
                System.err.println("There is no customer to remove. Enter again!");
                delete();
            }
            cc.getCustomerList().remove(position-1);
            System.err.println("Remove successful!");
        }
    }

    public static int menu() {
        System.out.println("**********************Customer************************");
        System.out.println("<1> Add new customer");
        System.out.println("<2> Display all");
        System.out.println("<3> Remove customer by position");
        System.out.println("<0> Exit");
        System.out.println("*************************************************");
        System.out.print("Enter your choice(0-3): ");
        int choice = Validation.checkInputLimit(0,3);
        return choice;
    }


}
