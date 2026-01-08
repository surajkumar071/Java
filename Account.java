


staffs 6dfgd to th





// class Account deposit and withraw.
import java.util.Scanner;
public class Account {
    public void deposit(double amount) {
    double deposite = (amount);
    System.out.println("Deposit amount is: " + deposite);
}


    public void withdraw(double amount) {
    double withdraw = (amount);
    System.out.println("Withdraw amount is: " + withdraw);
    
}
    public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Amount for deposit");
    double amount = s.nextDouble();
    Account a = new Account();
    a.deposit(amount);
    
    System.out.println("Enter amount for withdraw");
    double amount1 = s.nextDouble();
    a.withdraw(amount1);

}
}