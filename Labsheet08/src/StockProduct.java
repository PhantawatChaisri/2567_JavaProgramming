import java.util.*;

public class StockProduct {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Products [] products = new Products [4];
		
		for (i = 0; i < products.length; i++ ) {
			products[i] = new Products();
			
			System.out.println("Input product Id :");
			products[i].setId(scan.nextLine());
		}
		

	}

}
