import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class personMain {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner dataFile = new Scanner(new File("tudor.dat"));
		Scanner userInput = new Scanner(System.in);
		System.out.print("Person's name? ");
		String name = userInput.nextLine();
		
		person joe = new person(dataFile, name);
		
		System.out.println("Maternal line: \n\t" + name);
		joe.maternal();
		
		System.out.println("Paternal line: \n\t" + name);
		joe.paternal();
		
		System.out.println("Children:");
		joe.children();
	}
}