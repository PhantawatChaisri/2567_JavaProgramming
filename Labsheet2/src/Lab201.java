
import java.text.DecimalFormat;

import javax.swing.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = BUFFET * numberofCustomer;
		
		//System.out.printf("Total price is%,.21",totalPrice);
		
		do {
			isMember = JOptionPane.showConfirmDialog(null,"Total price is" + frm.format(totalPrice) + "baht." + "Do you have a member card" );
		}while(isMember==JOptionPane.CANCEL_OPTION); //(isMember==2)
		
		if(isMember==JOptionPane.YES_OPTION) {
			double discountAfterDiccount = totalPrice * 0.90; //discount = totalPrice=(totalPrice)
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(discountAfterDiccount) + " baht.");
		}else if (isMember==JOptionPane.NO_OPTION) { //if(isMember==1)
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + " baht.");
		}
		

	}

}
