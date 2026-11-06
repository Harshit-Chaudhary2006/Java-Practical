class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;
    
    BankAccount(String accountHolder, String accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        if (balance>=0){
            this.balance=balance;
        } else{
            this.balance=0;
        }
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Deposit successful: Rs. " + amount);
        } else{
            System.out.println("Invalid deposit amount!");
        }
    }
    public void withdraw(double amount){
        if (amount<=0){
            System.out.println("Invalid withdrawal amount!");
        } else if (amount>balance){
            System.out.println("Insufficient balance!");
        } else{
            balance-=amount;
            System.out.println("Withdrawal successful: Rs. " + amount);
        }
    }
    public void displayAccountDetails(){
        System.out.println("Account Details");
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: Rs. " + getBalance());
    }
}
public class Bank{
    public static void main(String[] args){
        BankAccount account = new BankAccount(
            "Rahul Sharma", "1234567890", 5000
        );
        account.displayAccountDetails();

        System.out.println("\nDeposit ");
        account.deposit(2000);
        account.deposit(-500);
        System.out.println("\nWithdrawal ");
        account.withdraw(1000);
        account.withdraw(0);
        account.withdraw(-200);
        account.withdraw(10000);
        
        account.displayAccountDetails();
    }
}

