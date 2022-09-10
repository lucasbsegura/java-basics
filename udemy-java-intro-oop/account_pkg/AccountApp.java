package account_pkg;

public class AccountApp {
    public static void main(String[] args) {
        Account account1 = new Account(1063,004);
        Account account2 = new Account(849,004,1000.00f);
    
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
