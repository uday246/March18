package May19;

import java.util.Scanner;

public class ATMTransaction {

   /**

    * @param args the command line arguments

    */

   private double balance;

   //add accountNumber variable
   private int accountNumber;

   ATMTransaction(int account) {
	   accountNumber=account;
       balance = 5000;

   }
public int getAccountNumber(){
	return accountNumber;
}
     //need getter and setter

   void withdraw(double withdraw) {

       if (withdraw > 0) {

           if (balance >= withdraw) {

               balance = balance - withdraw;

               System.out.println("Collect your Money");

           } else {

               System.out.println("Error!! Negative value Entered");

           }

       } else {  

       }

   }

   //need getter and setter

   void deposit(double deposit) {

       if (deposit > 0) {

           balance = balance + deposit;

           System.out.println("Your Money is in Your Card");

           System.out.println("");

       } else {

           System.out.println("Error!! Negative Value Entered");

       }

   }   

   //need getter and setter

   void checkBalance() {

       System.out.println("Balance: " + balance);

       System.out.println();

   }

   

   @Override
public String toString() {
	return "ATMTransaction [balance=" + balance + ", accountNumber=" + accountNumber + "]";
}
/**

    * @param args the command line arguments

    */

   public static void main(String[] args) {

       double withdraw, deposit;

       Scanner input = new Scanner(System.in);

       ATMTransaction myATM = new ATMTransaction(1221);       

       while (true) {

           System.out.println(myATM.toString());

           System.out.println("Automated Teller Machine");

           System.out.println("Choose 1 to Withdraw");

           System.out.println("Choose 2 to Deposit");

           System.out.println("Choose 3 to Check Balance");

           System.out.println("Choose 4 to Exit");

           System.out.println("Choose the Operation You Want to Perform: ");             

           int n = input.nextInt();

           switch (n) {

               case 1:

                   System.out.println("Enter Money to Withdraw: ");

                   withdraw = input.nextDouble();

                   myATM.withdraw(withdraw);

                   break;

               case 2:

                   System.out.println("Enter Money To Deposit: ");

                   deposit = input.nextDouble();

                   myATM.deposit(deposit);

                   break;

               case 3:

                   myATM.checkBalance();

                   break;

               case 4:

                   System.exit(0);

           }

       }

   }

public double getBalance() {
	return balance;
}

public void setBalance(double aBalance) {
	balance = aBalance;
}

}