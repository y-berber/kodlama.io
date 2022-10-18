public class Customer {
    public int id;

    public String city;

    public Customer() {//constructor
        System.out.println("The customer object was started");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
