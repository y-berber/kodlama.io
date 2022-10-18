public class CustomerManager {
    private Customer _customer;
    public CustomerManager(Customer customer) {
        _customer = customer;
    }
    public void save(){
        System.out.println("Customer was saved : " + _customer);
    }
    public  void delete(){
        System.out.println("The customer was deleted : " + _customer);
    }
}
