public class Main135 {
    public static void main(String[] args) {

        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer135 customer = new Customer135();
        customer.id = 1;
        customer.city = "Ankara";

        CustomerManager135 customerManager = new CustomerManager135(customer);
        customerManager.save();
        customerManager.delete();

        Company company = new Company();
        company.id = 100;
        company.companyName = "Arçelik";
        company.taxNumber = "1000000";

        Person135 person = new Person135();
        person.firstName = "Engin";
        person.lastName = "Demirog";
        person.nationalIdentity = "1234567";

        CustomerManager135 customerManager2 = new CustomerManager135(new Person135());

        Customer135 c1 = new Customer135();
        Customer135 c2 = new Person135();
        Customer135 c3 = new Company();
    }
}