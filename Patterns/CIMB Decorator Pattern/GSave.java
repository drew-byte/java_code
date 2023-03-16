public class GSave implements BankAccountDecorator {

    public BankAccount bankAccount;
    public SavingsAccount savingsAccount;

    public GSave(SavingsAccount account) {

        this.bankAccount = account;
        this.savingsAccount = account;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.025;
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return this.bankAccount.showBenefits() + ", GSave Transfer";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return this.getBalance() + this.getBalance() * this.getInterestRate();
    }

    @Override
    public String showInfo() {
        return "Account Number: " + this.savingsAccount.getAccountNumber() + "\n" +
                "Account Name: " + this.savingsAccount.getAccountName() + "\n" +
                "Balance: " + this.savingsAccount.getBalance();
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
