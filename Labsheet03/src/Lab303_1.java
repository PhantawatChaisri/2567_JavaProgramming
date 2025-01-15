import javax.swing.JOptionPane;

public class Lab303_1 {
    public static void main(String[] args) {
        
        int spacebarCount = 0;
        int wordCount = 0;
        String inputSentence;
       
       
        inputSentence = JOptionPane.showInputDialog(null,"Input a sentence:");
        while(true)
        {
            if (inputSentence.endsWith("."))
            {
            break;
            }
            else {
                inputSentence = JOptionPane.showInputDialog(null,"Input a sentence, again:");
               
            }
       
        }
        
        System.out.println();
        
        for (int i =0;i<inputSentence.length()-1;i++)
        {
                char ch = inputSentence.charAt(i);
                if (ch == ' ')
                {
                    spacebarCount++;
                }
        }
       
        String text[] = inputSentence.split(" ");
        for (int i=0;i<text.length;i++){
            wordCount++;
        }
        JOptionPane.showMessageDialog(null, "This sentence has "+spacebarCount+" spacebar."+"\nThis sentence has "+wordCount+" word.");
       
       
    }
}