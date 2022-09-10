package customer_pkg;

public class CustomerPerson extends Customer {
    
    private String document;

    public CustomerPerson(String name, 
                          String address,
                          String document) {

        super(name, address);
        this.document = document;                         
    }

    public String getDocument() {
        return this.document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String toString(){
        return super.toString() + " - Document:" + this.document;
    }
}
