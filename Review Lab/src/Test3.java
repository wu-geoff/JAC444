
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewAccount newAcc = new NewAccount("George", 1122	, 1000);
		newAcc.setAnnualInterestRate(1.5);
		for(double i = 30; i <= 50; i += 10) {
			newAcc.deposit(i);
		}
		newAcc.withdraw(5);
		newAcc.withdraw(4);
		newAcc.withdraw(2);
		System.out.printf("Account summary:\nHolder name: %s\nInterest rate: %.2f%%\nBalance: $%.2f\n", 
				newAcc.getName(),
				newAcc.getAnnualInterestRate(),
				newAcc.getBalance());
		
		System.out.println("\nAll transaction: ");
		for(Transaction t : newAcc.getTransactions()) {
			System.out.println(t.toString());
		}
	}

}
