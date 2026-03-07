package Module3;

public class Bankacc {
    private int accountNumber;
    private double balance;

    Bankacc(int accNo, double bal)
    {
        accountNumber = accNo;
        balance = bal;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn: " + amount);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public void display()
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args)
    {
        Bankacc acc = new Bankacc(12345, 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.display();
    }
}
