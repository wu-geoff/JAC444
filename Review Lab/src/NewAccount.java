import java.util.ArrayList;

public class NewAccount extends Account {
	private String name;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	public NewAccount(String name, int id, double balance) {
		super(id, balance);
		this.name = name;
	}
	
	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
		transactions.add(new Transaction(
				'W', 
				amount, 
				getBalance(), 
				"Withdraw $" + Double.toString(amount)));
	}
	
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
		transactions.add(new Transaction(
				'D',
				amount,
				getBalance(),
				"Deposit $" + Double.toString(amount)));
	}

	public String getName() {
		return name;
	}

	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
}
