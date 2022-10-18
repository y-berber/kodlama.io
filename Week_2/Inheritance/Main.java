package Week_2.Inheritance;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.BestEmployee();
        employeeManager.add(employee);
        customerManager.add(customer);
        employeeManager.add();
        customerManager.add();
        customerManager.listCustomer();
    }
}