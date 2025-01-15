
public class Product {
	
	private String name;
	private double price;
	private double vatRate;

	public void setProductDetails(String productName,double productPrice,double vat) {
		name = productName;
		price = productPrice;
		vatRate = vat;
	}

	public double calculateTotalPrice() {
		double pricePlusVat = price * (vatRate/100);

		return pricePlusVat + price;
	}

	public void displayProductDetails() {
		System.out.println("Product Name: " + name);
		System.out.println("Price (Before VAT): " + price);
		System.out.println("Price (After VAT): " + calculateTotalPrice());
	}


}