package Test;

import java.util.ArrayList;

public class GenericCustomer<T> {
    private T obj;
    private ArrayList<T> customerList = new ArrayList<>();

    public GenericCustomer() {

    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public ArrayList<T> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<T> customerList) {
        this.customerList = customerList;
    }

    public GenericCustomer(T obj) {
        this.obj = obj;
    }
}
