import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Family_Tree {
	  public static void main(String[] args)
	            throws FileNotFoundException {
	        
	      Scanner input = new Scanner(new File("tudor.txt"));

	        // and count words
	        int count = 0;
	        while (input.hasNextLine()) {
	            String Name = input.nextLine();
	            count++;
               System.out.println(Name);

	        }
	       System.out.println(count);	    
	    
}
}