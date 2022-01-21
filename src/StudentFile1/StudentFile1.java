

package StudentFile1;
import java.util.*;
    
        
public class StudentFile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = input.nextLine();
        char[] letters = new char[word.length()];
        
        for(int i = 0; i < letters.length;i++) {
          letters[i] = word.charAt(i);
          System.out.println(letters[i]);                
                
                

        
        
        

        }
    }
    
}
