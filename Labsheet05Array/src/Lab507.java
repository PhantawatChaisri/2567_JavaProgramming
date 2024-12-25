import javax.swing.*;
public class Lab507 {

	public static void main(String[] args) {
		
		int [] inputNumber = new int[5];
		for (int i=0;i<inputNumber.length;i++) {
			inputNumber [i] = Integer.parseInt(JOptionPane.showInputDialog("Input number " + (i+1)));
		}
		
		showEven(inputNumber);
		showOdd(inputNumber);

	}
	public static void shoeEven(int[] nums) {
		
	} 

}
