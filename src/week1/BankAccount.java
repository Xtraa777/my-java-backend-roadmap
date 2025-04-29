package week1;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(amount + "원을 입금했습니다.");
            System.out.println("현재 잔액: " + balance + "원");
        } else {
            System.out.println("유효하지 않은 입금 금액입니다.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println(amount + "원을 출금했습니다.");
            System.out.println("현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족하거나 유효하지 않은 금액입니다.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", "John Smith");

        bankAccount.deposit(10000);
        bankAccount.withdraw(8000);
        System.out.println("---");

        System.out.println("현재 잔액: " + bankAccount.getBalance() + "원");
    }
}
