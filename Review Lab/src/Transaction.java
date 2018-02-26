import java.util.Date;

public class Transaction {
	private Date date = new Date();
	private char type;
	
	private double amount, balance;
	private String description;
	
	public Transaction(char type, double amount, double balance, String description) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getDescription() {
		return description;
	}
	
	public String toString() {
		return String.format("Date: %s\nType: %c\nAmount: %.2f\nNew Balance: %.2f\nDescription: %s", 
				getDate().toString(),
				getType(),
				getAmount(),
				getBalance(),
				getDescription());
	}
}
