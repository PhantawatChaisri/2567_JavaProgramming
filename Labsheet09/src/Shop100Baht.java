import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		
		Product sold = new Product();    
        int option = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?", "Run Program", JOptionPane.YES_NO_OPTION);
        
     if (option == JOptionPane.YES_OPTION) {
         sold = new PattanakarnBranch();
     }

     String input = JOptionPane.showInputDialog(null,"Input the number of product:");
     sold.setUnit(Integer.parseInt(input));
     JOptionPane.showMessageDialog(null, sold.toString());

	}
}
