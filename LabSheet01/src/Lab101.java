import java.util.*;

public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Input product name  : ");
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input price unit : ");
		float productPrice = input.nextFloat();
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("----------------------------------------------------");
		System.out.println("Total Price is "+totalPriceofProduct+"baht.");
		System.out.println("----------------------------------------------------");
		System.out.print("How many discount (%) : ");
		int discountPer = input.nextInt();
		System.out.println("----------------------------------------------------");
		float discountA = totalPriceofProduct * (discountPer/100);
		System.out.println("Discount from  "+ discountPer + "%"  + discountA +"baht.");
		float discountB = totalPriceofProduct *(discountPer-100)/100;
		System.out.println("Amount to be paid  " + discountB + " baht.");

	}

}
