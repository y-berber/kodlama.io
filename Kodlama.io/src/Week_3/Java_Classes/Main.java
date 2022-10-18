public class Main {
    public static void main(String[] args) {

        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.id = 1;
        customer.city = "Ankara";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.id = 100;
        company.companyName = "Arçelik";
        company.taxNumber = "1000000";

        Person person = new Person();
        person.firstName = "Engin";
        person.lastName = "Demirog";
        person.nationalIdentity = "1234567";

        CustomerManager customerManager2 = new CustomerManager(new Person());

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
    }
}