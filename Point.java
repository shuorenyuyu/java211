/* 	CS211(A) Winter 2018 Assignment HW2
 	Tan Fuzhuo
 	Point class for HW2Exercise018. */
public class Point {
	private int x;
	private int y;

	public Point() {
		this(0, 0);
	}

	public Point(int x, int y) {
		setLocation(x, y);
	}

	public double distanceFromOrigin() {
		return Math.sqrt(x * x + y * y);
	}

	public int getx() {
		return x;
	}

	public int gety() {
		return y;
	}

	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public int compareTo(Point other) {
		double distance1 = Math.sqrt(x * x + y * y);
		// the distance will be two side square summation, and then square root
		double distance2 = Math.sqrt(other.x * other.x + other.y * other.y);
		if (distance1 - distance2 < 0) {
			return -1;
		} else if (distance1 - distance2 > 0) {
			return 1;
		} else {
			return 0;
		}
		// compare distance from the point to origin
	}
}
