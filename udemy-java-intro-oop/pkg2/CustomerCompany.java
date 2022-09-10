package pkg2;

public class CustomerCompany extends Customer {
    private String registration;

    public CustomerCompany(String name, 
                          String address,
                          String registration) {

        super(name, address);
        this.registration = registration;                         
    }

    public String getRegistration() {
        return this.registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String toString(){
        return super.toString() + " - Registration:" + this.registration;
    }
}
