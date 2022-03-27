
public class BankApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("111", "Batman"); //new bank acc
		BankAccount acc2 = new BankAccount("222", "Robin"); //new bank acc
		
		displayAccount(acc1);//display acc
		displayAccount(acc2);//display acc
		
		acc1.deposit(100); //deposit 100
		acc2.deposit(50); //deposit 50
		
		acc1.withdraw(75); //withdraw 75
		acc2.withdraw(75); //withdraw 75
		
		displayAccount(acc1); //display acc
		displayAccount(acc2);//display acc

	}

	 static void displayAccount(BankAccount accIn) {
		System.out.println("number" + accIn.getAccountNumber()); //get acc number
		System.out.println("name" + accIn.getAccountName()); //get acc name
		System.out.println("balance" + accIn.getBalance()); //get acc balance
		
		 
	}
	 
}
