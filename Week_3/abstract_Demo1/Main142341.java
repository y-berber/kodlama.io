public class Main142341 {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();
        customerManager.getCustomers();
    }
}