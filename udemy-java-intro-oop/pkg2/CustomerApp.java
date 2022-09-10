package pkg2;

public class CustomerApp {
    
    public static void main (String[] args) {
        CustomerPerson customer1 = new CustomerPerson("Lucas", "15 Street", "123");
        CustomerCompany customer2 = new CustomerCompany("Company", "1st Avenue", "1416-12/15");

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }
}
