import javax.swing.JOptionPane;

public class Lab203 {

	public static void main(String[] args) {

		double Weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double Height = Double.parseDouble(JOptionPane.showInputDialog("Input height:"));
		double meter_H = Height/100;
		double BMI = Weight/(meter_H*meter_H);
		
		System.out.print(BMI);
		String meaning = " ";

		if(BMI>=30)
		{
			meaning = "Obesity";
		}
		else if (BMI>=25)
		{
			meaning = "Overweight";
		}
		else if (BMI>=18.5)
		{
			meaning = "Normal-weight";
		}
		else 
		{
			meaning = "Underweight";
		}
		JOptionPane.showMessageDialog(null, "BMI = "+BMI+"\nYou're "+meaning,"BMI",JOptionPane.WARNING_MESSAGE);

	}

}