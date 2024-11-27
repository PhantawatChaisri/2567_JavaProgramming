import javax.swing.*;

public class Javaexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Inpuut product Name: ");
		String strproductUnit = JOptionPane.showInputDialog("Input Product Unit: ");
		int productUnit = Integer.parseInt(strproductUnit);
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per Unit: "));
		double totalPriceofProduct = productUnit *productPrice;
		double totalwithVat = totalPriceofProduct * 1.07;
		JOptionPane.showMessageDialog(null, "Total Price is "+totalPriceofProduct+"baht."+"\nAdd VAT is "+ totalwithVat +"baht");

	}

}
