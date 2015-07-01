package stringsearch;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author SerenaCha
 */
public class StringSearch
{
    /**
    * @param args the command line argument
    */
    public static void main(String[] args) 
    {        
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            int count = 0;
            boolean flag = false;
            
            try
            {
                System.out.println("Enter your file path : ");// /Users/SerenaCha/desktop/words.txt
                String fname = input.nextLine();
                System.out.println("\nEnter string to search : ");
                String word = input.nextLine();
                System.out.println("\nThe words appeared in these lines : ");
                
                BufferedReader br = new BufferedReader(new FileReader(fname));
                
                String line;
                while((line = br.readLine()) != null)
                {
                    //String[] words = line.split(" ");
                    flag = false;
                    for(String t: line.split(" "))
                    {
                        if(t.equals(word))
                        {
                            flag = true;
                            System.out.println(line);				
                            count++;
                        }
                    }
                }
            }
            catch(IOException e)
            {
                System.out.println("Error");
                e.printStackTrace();
            }
        System.out.println("\nNumber of occurence of the word : " + count);     
    }  
}