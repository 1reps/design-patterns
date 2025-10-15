package structural.proxy.resolve.bank;

public class Client {

    public static void main(String[] args) {
        BankAccountProxy adminAccount = new BankAccountProxy("Admin", 1000);
        adminAccount.deposit(500);
        adminAccount.withdraw(300);

        BankAccountProxy userAccount = new BankAccountProxy("User", 1000);
        userAccount.deposit(500);
        userAccount.withdraw(300);
    }
}
