package Week_2.Inheritance;

public class CustomerManager extends PersonManager{
	
	public void listCustomer() {
		System.out.println("Müsteriler Listelenip Sunuldu Varsay");
	}
	
	public void add(Customer customer) {
		System.out.println("Müsteri Eklendi");
	}
}
