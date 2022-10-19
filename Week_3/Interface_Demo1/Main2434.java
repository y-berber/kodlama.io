public class Main2434 {
    public static void main(String[] args) {
        ICustomerDal iCustomerDal = new OracleCustomerDal();
        iCustomerDal.Add();

        CustomerManager2434 customerManager = new CustomerManager2434(new OracleCustomerDal());
        customerManager.add();
    }
}