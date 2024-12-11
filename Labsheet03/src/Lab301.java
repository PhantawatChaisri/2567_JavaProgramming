import java.util.Scanner;
public class Lab301 {

	public static void main(String[] args) {
		Scanner Kb = new Scanner(System.in);
		
		String txtConcate = "";
		String word;
		while (true) {
			System.out.print("Enter word :");
			word = Kb.next();
			
			if (word.equalsIgnoreCase("Stop")) {
				System.out.println("Program Terminate");
				break;
				
			}
			
			txtConcate += word + " ";
		}
		System.out.println(txtConcate.toUpperCase());
		
		Kb.close();

	}

}
