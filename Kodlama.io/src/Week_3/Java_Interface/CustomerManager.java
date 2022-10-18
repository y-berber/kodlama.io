public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }
    public void save(){
        System.out.println("The customer was saved");
    }
    public void delete(){
        System.out.println("The customer was deleted");
    }
    public void giveCredit(){
        _creditManager.calculate();
        System.out.println("The credit was given");
    }
}
