public class Person1 {
    protected String name;
    protected String address;

    // Default constructor
    public Person1() {
        System.out.println("Inside Person:Constructor");
        name = "";
        address = "";
    }

    // Constructor dengan dua parameter
    public Person1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Method accessor
    public String getName() {
        System.out.println("Person Name : " + name);
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String add) {
        this.address = add;
    }
}
