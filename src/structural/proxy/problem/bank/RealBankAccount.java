package structural.proxy.problem.bank;

public class RealBankAccount implements BankAccount {
    
    private double balance;
    private String userRole;
    
    public RealBankAccount(double balance, String userRole) {
        this.balance = balance;
        this.userRole = userRole;
    }
    
    @Override
    public void withdraw(double amount) {
        // 접근 제어 로직이 비즈니스 로직과 섞여있음
        if (!"Admin".equalsIgnoreCase(userRole)) {
            System.out.println("Access denied. Only Admin can withdraw.");
            return;
        }
        
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Current balance: " + balance);
    }
}