public class CustomerManager135 {
    private Customer135 _customer;
    public CustomerManager135(Customer135 customer) {
        _customer = customer;
    }
    public void save(){
        System.out.println("Customer was saved : " + _customer);
    }
    public  void delete(){
        System.out.println("The customer was deleted : " + _customer);
    }
}
