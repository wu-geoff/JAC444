
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account test = new Account(1122, 20000);
		test.setAnnualInterestRate(4.5);
		test.withdraw(2500);
		test.deposit(3000);
		System.out.printf("Balance: %.2f\nMonthly interest: %.2f\nCreation date: %s\n",
				test.getBalance(),
				test.getMonthlyInterest(), 
				test.getDateCreated().toString());
	}
}
