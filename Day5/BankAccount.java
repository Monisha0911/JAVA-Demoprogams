package day5;

public class BankAccount {
	private double balance;
	public BankAccount(double balance)
	{
		this.balance=balance;
	}

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException 
    {
        if (amount < 0)
        {
            throw new InvalidAmountException("Invalid ammount:");
        }

        if (amount > balance)
        {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining balance: " + balance);
    }
}