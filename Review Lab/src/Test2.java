
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account test = new Account(12, 1000);
		test.setAnnualInterestRate(5);
		System.out.printf("Balance: %.2f\nMonthly interest: %.2f\nCreation date: %s\n",
				test.getBalance(),
				test.getMonthlyInterest(), 
				test.getDateCreated().toString());
		
		SavingsAccount sav = new SavingsAccount(13, 50000);
		sav.setAnnualInterestRate(6);
		System.out.print(sav.toString());
		
		CheckingAccount chk = new CheckingAccount(14, 6000);
		chk.setOverdraftLimit(400);
		System.out.println(chk.toString());
	}

}
