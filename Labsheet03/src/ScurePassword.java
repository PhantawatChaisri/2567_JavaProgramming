import java.util.*;
public class ScurePassword {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter your password(type 'exit' to quit):");
			String password = scan.nextLine();
			
			if (password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			String errors = "";
			
			if (password.length()<0) {
				
				errors += "-Password must be at least 8 character long.\n ";
				
			}
			
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigitCase = false;
			
			for(int i=0;i<password.length();i++) {
				char ch = password.charAt(i);
				
				if (ch >= 'A'&& ch <='Z') {
					hasUpperCase = true;
				}else if (ch >= 'a'&& ch <='z'){
					hasLowerCase = true;
				}else if (ch >= '0'&& ch <='1') {
					hasDigitCase = true;
				}
			}
			if(!hasUpperCase) {
				errors += "Password must cantian at lease one uppercase letter(A-Z).\n";
			}
			if(!hasLowerCase) {
				errors += "Password must cantian at lease one uppercase letter(a-z).\n";
			}
			if(!hasDigitCase) {
				errors += "Password must cantian at lease one digit(0-9).\n";
			}
			if (errors.isEmpty()) {
				System.out.println("Your password is scure");
				break;
			}
			else {
				System.out.println("Password validation errors");
				System.out.println("errors");
			}
			
		}
		scan.close();
		

	}

}
