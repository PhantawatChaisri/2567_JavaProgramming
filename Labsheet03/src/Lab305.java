import java.util.*;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        
        String inputSentence;
        String showSentence;
        char word;
        int positionCount = 0;
       
        System.out.print("Input some sentence : ");
        inputSentence = scan.nextLine();
        
        while(true)
        {
            if (inputSentence.endsWith("."))
            {
            break;
            }
            else {
            System.out.print("The sentence must end with full stop point : ");
            inputSentence = scan.nextLine();
               
            }
       
        }
        System.out.println();
        
        for (int i = 0; i< inputSentence.length() ; i++)
        {
            
            word = inputSentence.charAt(i);
           
            if (word == ' '|| i == inputSentence.length()-1) {
                showSentence = inputSentence.substring(positionCount, (i==inputSentence.length()-1) ? i+1 : i);
               
                System.out.println(showSentence);
               
                positionCount = i+1;
            }
        }
        scan.close();
    }
}