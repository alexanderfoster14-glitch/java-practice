public class practice {
	public static void main(String[] args) {
		System.out.println(salesPrice(100, 10));
		double finalPrice = 0;
		System.out.println(finalPrice);
	}
	
	public static double salesPrice(double price, double percentDiscount) {
		double discount;
		double finalPrice;
		discount = price * (percentDiscount /100);
		finalPrice =  price - discount;
		return finalPrice;
	}
}