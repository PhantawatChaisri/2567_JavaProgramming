import javax.swing.*;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		//System.out.println(balance);
		int moneyWithdrawal = Integer.parseInt(JOptionPane.showInputDialog("Your balanec : "+balance+"\nInput money to withdrawal"));
		if(moneyWithdrawal>balance) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdrawal more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}else if (moneyWithdrawal>50000) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdrawal more than 50,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}else if (moneyWithdrawal%100!=0) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdrawal "+(moneyWithdrawal%100)+"baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdrawal "+moneyWithdrawal+"baht.","\n1,000 = "+(moneyWithdrawal/1000)+"\n500 = "+((moneyWithdrawal/1000)/500)+"\n100 = "+(moneyWithdrawal/1000)/100);
		}
			

	}

}
