
public class CheckingAccount extends Account {
	private double overdraftLimit;
	
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public String toString() {
		return String.format("Type: Checking\nBalance: %.2f\nMonthly interest: %.2f\nCreation date: %s\nOverdraft limit: %.2f\n",
				getBalance(),
				getMonthlyInterest(),
				getDateCreated().toString(),
				getOverdraftLimit());
	}
}
