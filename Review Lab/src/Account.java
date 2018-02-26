import java.util.Date;

public class Account {
	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated = new Date();
	
	public Account(){
		id = 0;
		balance = annualInterestRate = 0;
	}
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return (annualInterestRate / 12);
	}
	
	public double getMonthlyInterest() {
		return getBalance() * (getMonthlyInterestRate()/100);	
	}
	
	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}
	
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
}
