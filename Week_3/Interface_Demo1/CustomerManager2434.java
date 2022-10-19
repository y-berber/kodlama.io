public class CustomerManager2434 {
    private ICustomerDal iCustomerDal;

    public CustomerManager2434 (ICustomerDal iCustomerDal){
        this.iCustomerDal = iCustomerDal;
    }

    public void add(){
        // work codes
        iCustomerDal.Add();
    }
}
