public class Main {
    public static void main(String[] args) {
        ICustomerDal iCustomerDal = new OracleCustomerDal();
        iCustomerDal.Add();

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}