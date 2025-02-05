import java.util.*;

public class CheckStockProduct {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many product list in stock: ");
	    int productQuantity= scan.nextInt();
	    
	    scan.nextLine();
	    
	    System.out.println();
	    Product[] productList = new Product[productQuantity];
	     
	    for (int i =0;i<productList.length;i++)
        {
            productList[i] = new Product();
            
            System.out.print("Input product Id : ");
            String id = scan.nextLine();
            
            productList[i].setId(id);
            System.out.print("Input product Unit : ");
            int unit = scan.nextInt();
            scan.nextLine();
            productList[i].setUnit(unit);          
            System.out.println();
        }
	    
	    Line();
        System.out.println("List of product in 'LOW' status. ");  
        Line();    
        for (Product checkUnitOfProduct : productList)
        {
            if (checkUnitOfProduct.getUnit() < 5) {
                System.out.println(">> "+ checkUnitOfProduct.getId() + " has " + checkUnitOfProduct.getUnit() + " units");
            }

        }
        
        Line();
        System.out.println("List of product in 'HIGH' status. ");
        Line();      
        for (Product checkUnitOfProduct : productList)
        {
            if (checkUnitOfProduct.getUnit() > 50) {
                System.out.println(">> "+ checkUnitOfProduct.getId() + " has " + checkUnitOfProduct.getUnit() + " units");
            }

        }
        
        scan.close();
        
        public static void Line() {
	        System.out.println("-------------------------------------");
	    
	}

}
