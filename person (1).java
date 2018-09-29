import java.util.ArrayList;
import java.util.Scanner;

public class person {
	private ArrayList <String> personList;
	private ArrayList <String> organizedPersonList;
	private String name;
	
	public person (Scanner fileName, String name) {
		personList = new ArrayList<String>();
		String person = fileName.nextLine();
		while (!person.equals("END")) {
			personList.add(person);
			person = fileName.nextLine();
		}
		
		organizedPersonList = new ArrayList<String>();
		person = fileName.nextLine();
		while (!person.equals("END")) {
			organizedPersonList.add(person);
			person =fileName.nextLine();
		}
		
		this.name = name;
	}
	
	public void maternal() {
		int momCount = 1; //counter for tabs
		String motherName = organizedPersonList.get(organizedPersonList.indexOf(name) + 1);
		String motherName2 = "";
		
		//count system for amount of needed tabs
		for (int i = momCount; i >= 0; i--) {
			System.out.print("\t");
		}
		
		System.out.print(motherName + "\n");
		organizedPersonList.remove(organizedPersonList.lastIndexOf(motherName));
		
		while (organizedPersonList.contains(motherName)) {
			//remove this person's name until their index is a child index
			while (organizedPersonList.lastIndexOf(motherName) != organizedPersonList.indexOf(motherName)) { 
				organizedPersonList.remove(organizedPersonList.lastIndexOf(motherName));
			}
			
			if (organizedPersonList.indexOf(motherName) - 1 != 0) { //check if mother has any known mothers
				motherName2 = organizedPersonList.get(organizedPersonList.indexOf(motherName) + 2); //get grandmother
				organizedPersonList.remove(organizedPersonList.lastIndexOf(motherName)); //remove any remaining mother's name 
				motherName = motherName2;

				//count system for amount of needed tabs
				momCount++; //counter for tabs
				for (int i = momCount; i >= 0; i--) { 
					System.out.print("\t");
				}
				
				//add mother name to maternal tree
				System.out.println(motherName);  
			} else {
				organizedPersonList.remove(organizedPersonList.lastIndexOf(motherName));
			}
		}
	}
	
	public void paternal() {
		int dadCount = 1; //counter for tabs
		String fatherName = organizedPersonList.get(organizedPersonList.indexOf(name) + 1);
		String fatherName2 = "";
		
		//count system for amount of needed tabs
		for (int i = dadCount; i >= 0; i--) {
			System.out.print("\t");
		}
		
		System.out.print(fatherName + "\n");
		organizedPersonList.remove(organizedPersonList.lastIndexOf(fatherName));
		
		while (organizedPersonList.contains(fatherName)) {
			//remove this person's name until their index is a child index
			while (organizedPersonList.lastIndexOf(fatherName) != organizedPersonList.indexOf(fatherName)) { 
				organizedPersonList.remove(organizedPersonList.lastIndexOf(fatherName));
			}
			
			if ((organizedPersonList.indexOf(fatherName) - 2 != 0) 
					&& (organizedPersonList.indexOf(fatherName) - 1 != 0)) { //check if father has any known fathers
				fatherName2 = organizedPersonList.get(organizedPersonList.indexOf(fatherName) + 2); //get grandfather
				organizedPersonList.remove(organizedPersonList.lastIndexOf(fatherName)); //remove any remaining father's name 
				fatherName = fatherName2;

				//count system for amount of needed tabs
				dadCount++; //counter for tabs
				for (int i = dadCount; i >= 0; i--) { 
					System.out.print("\t");
				}
				
				//add father name to paternal tree
				System.out.println(fatherName);  
			} else {
				organizedPersonList.remove(organizedPersonList.lastIndexOf(fatherName)); //remove any remaining father's name
			}
		}
	}
	
	public void children() {
		while (organizedPersonList.lastIndexOf(name) != organizedPersonList.indexOf(name)) {
			int k = 0;
			int a = 1;
			int b = 2;
			while(organizedPersonList.indexOf(name) != (a + k*3)) { 
				k++;
				if(k > 50) {
					k = 0;
					a = 2; //person is mother (2 + k*3) is formula for mother  (1 + k*3) is for father
					b = 1;
				}
			}
			
			System.out.println("\t" + organizedPersonList.get(organizedPersonList.lastIndexOf(name) - b)); 
			
			organizedPersonList.remove(organizedPersonList.lastIndexOf(name));
		}

	}
}
