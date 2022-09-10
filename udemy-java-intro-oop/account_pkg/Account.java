package account_pkg;

public class Account {
    
    private int number, agency;
    private float limit;
    
    public Account(int number, int agency){
        this.number = number;
        this.agency = agency;
    }
    
    public Account(int number, int agency, float limit){
        this.number = number;
        this.agency = agency;
        this.limit = limit;
    }

    public String toString() {
        String value = "Agency: " + this.agency + " - Account Number: " + this.number;
        if (this.limit > 0) {
            value += " - Limit: " + this.limit;
        }
        return value;
    }
    
}
