public class DiscountRate {
	private static double serviceDiscountPremium = 0.2, serviceDiscountGold = 0.15, serviceDiscountSilver = 0.1,
			productDiscountPremium = 0.1, productDiscountGold = 0.1, productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate(String type) {
		double val = 0;
		if(type.equals("Silver")) {
			val = serviceDiscountSilver;
		}
		else if (type.equals("Gold")) {
			val = serviceDiscountGold;
		}
		else if (type.equals("Premium")) {
			val = serviceDiscountPremium;
		}
		return val;
	}
	
	public static double getProductDiscountRate(String type) {
		double val = 0;
		if(type.equals("Silver")) {
			val = productDiscountSilver;
		}
		else if (type.equals("Gold")) {
			val = productDiscountGold;
		}
		else if (type.equals("Premium")) {
			val = productDiscountPremium;
		}
		return val;
	}
}
