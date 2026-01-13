

















import java.util.*;
class Accounts{
        double balance;
        private Accounts(double initial_balance){
            double balance = initial_balance;
        
        }
        public void deposite(double Amount){
            if (Amount > 0){
            balance += Amount;
            System.out.println("Your Deposited Balance Is :" + balance);
        }
    
        else{
            System.out.println("Amount must be positive");
        }
        }
        public void withdraw(double Amount){
        if (balance >= Amount && Amount > 0){
        balance -= Amount;
        System.out.println("Your Withdraw Amount is :" + balance);
    }
        else{
        System.out.println("Insufficient Balance");
    }
}
        public void checkbalance(){
            System.out.println("Your Current Balance is :" + balance);
              }
    
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Amount For Deposit :");
            double Amount = sc.nextDouble();
            Accounts obj = new Accounts(0);
            obj.deposite(Amount);
            obj.checkbalance();

           System.out.println("Enter Amount for Withdrawal :");
           double amount = sc.nextDouble();
           obj.withdraw(amount);
           obj.checkbalance();
        }
    
    }    