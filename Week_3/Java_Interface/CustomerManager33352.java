public class CustomerManager33352 {
    private Customer33352 _customer;
    private ICreditManager _creditManager;
    public CustomerManager33352(Customer33352 customer, ICreditManager creditManager){
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
