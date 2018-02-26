
public class SavingsAccount extends Account {
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	public String toString() {
		return String.format("Type: Saving\nBalance: %.2f\nMonthly interest: %.2f\nCreation date: %s\n",
				getBalance(),
				getMonthlyInterest(),
				getDateCreated().toString());
	}
}
