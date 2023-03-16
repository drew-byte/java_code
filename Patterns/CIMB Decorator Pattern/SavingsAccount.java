public class SavingsAccount implements BankAccount {

    private int accountNumber;
    private String accountName;
    private Double balance;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public Double getInterestRate() {
        return 0.01;
    }

    @Override
    public Double getBalance() {

        return this.balance;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return this.getBalance() + this.getBalance() * this.getInterestRate();
    }

    @Override
    public String showInfo() {
        return "Account Number: " + this.getAccountNumber() + "\n" +
                "Account Name: " + this.getAccountName() + "\n" +
                "Balance: " + this.getBalance();
    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}
