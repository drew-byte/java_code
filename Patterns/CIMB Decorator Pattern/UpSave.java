public class UpSave implements BankAccountDecorator {

    private BankAccount bankAccount;
    private SavingsAccount savingsAccount;

    public UpSave(SavingsAccount account) {

        this.savingsAccount = account;
        this.bankAccount = account;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public Double getInterestRate() {
        return 0.04;
    }

    @Override
    public Double getBalance() {
        return this.bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return this.bankAccount.showBenefits() + ", With Insurance";
    }

    @Override
    public Double computeBalanceWithInterest() {
        return this.bankAccount.getBalance() + this.bankAccount.getBalance() * this.getInterestRate();
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
