
/* 	CS211(A) Winter 2018 Assignment HW2
 	Tan Fuzhuo
 	This object work on Exercise 017 on page 713.
 	Modify the Point class from Chapter 8 so that if defines natural ordering by implementing the Comparable interface. */
import java.util.Scanner;

public class HW2Exercise018 {

	private static Scanner console;

	public static void main(String args[]) {

		console = new Scanner(System.in);
		System.out.print("Enter your first x1 value: ");
		int x1 = console.nextInt();
		System.out.print("Enter your first y1 value: ");
		int y1 = console.nextInt();
		// enter x1 and y1 values
		Point point1 = new Point(x1, y1);
		System.out.println("Your first point: " + point1.toString());
		// create point1 for the point class
		System.out.print("Enter your second x2 value: ");
		int x2 = console.nextInt();
		System.out.print("Enter your second y2 value: ");
		int y2 = console.nextInt();
		// enter x2 and y2 values
		Point point2 = new Point(x2, y2);
		System.out.println("Your second point: " + point2.toString());
		// create point2 for the point class
		if (point1.compareTo(point2) == -1) {
			System.out.println("The first point " + point1.toString()
					+ " will be closer to the origin point than second point " + point2.toString());
		} else if (point1.compareTo(point2) == 1) {
			System.out.println("The second point " + point2.toString()
					+ " will be closer to the origin point than first point " + point1.toString());
		} else {
			System.out.println("The first point " + point1.toString() + " and The second point " + point2.toString()
					+ " have the same distance with the origin point");
		}
	}
}