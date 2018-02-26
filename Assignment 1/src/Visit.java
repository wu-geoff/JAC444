import java.util.Date;

public class Visit extends Customer {
	private Date date = null;
	private double serviceExpense, productExpense;
	
	public Visit(String name, Date date) {
		super(name);
		this.date = date;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	public double getServiceExpense() {
		return serviceExpense * (1-DiscountRate.getServiceDiscountRate(super.getMemberType()));
	}
	
	public void setServiceExpense(double ex) {
		this.serviceExpense = ex;
	}
	
	public double getProductExpense() {
		return productExpense * (1-DiscountRate.getProductDiscountRate(super.getMemberType()));
	}
	
	public void setProductExpense(double ex) {
		this.productExpense = ex;
	}
	
	public double getTotalExpense() {
		return getProductExpense() + getServiceExpense();
	}
	
	@Override
	public String toString() {
		return String.format("%s\nDate: %s\nService: %.2f Product: %.2f Total: %.2f",
				super.toString(),
				date.toString(),
				getServiceExpense(),
				getProductExpense(),
				getTotalExpense());
		
	}
}
