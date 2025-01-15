import java.util.*;

public class Lab304 {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String fullName;
        String firstName;
        String lastName;
        
        System.out.print("Full Name: ");
        fullName = scan.nextLine();
        
        if (fullName.contains(" ")) {
            firstName = fullName.substring(0, fullName.indexOf(" ")).toUpperCase();
            lastName = fullName.substring(fullName.indexOf(" ")+1,fullName.length()).toLowerCase();
            System.out.println("First Name: "+firstName);
            System.out.println("Last Name: "+lastName);
        }
        else {
            System.out.println("Incorrect Name");
        }
        scan.close();
    }
}