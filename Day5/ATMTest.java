package day5;

public class ATMTest {
    public static void main(String[] args) throws Exception {

        BankAccount acc = new BankAccount(50000);
        try 
        {
            acc.withdraw(30000); 
        } 
        catch (InvalidAmountException e) 
        {
            System.out.println(e.getMessage());
        } 
        catch (InsufficientBalanceException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
