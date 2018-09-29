import java.awt.Point;



//YANG ZHOU   1/12/2018
/*          cs211 instructor :James      
* It's for question 21. To construct rectangle and give point with width and height Return a new RECTANGLE that reparesents the largest 
* rectangle region      */
public class Rectangledemo {
public static void main(String[]args){
	Rectangle re=new Rectangle(1,2,3,4);
	//print out data
	System.out.println("18."+re);
	System.out.println();
	//18 demo

		Point p= new Point(1,2);
		//creating instance of class rectangle
		Rectangle r=new Rectangle(p,3,4);
		//display rectangle data
		System.out.println("19."+r);
		System.out.println();
	//19demo
		
		Point p20=new Point(2,4);
    	//creat point object
    Rectangle rec=new Rectangle(p,3,6);
    //creating rectangle example
    System.out.println("20."+rec);
    int pX=6,pY=3;
 System.out.println("("+pX+","+pY+")");
 //print out rectangle data
    if(r.contains(pX,pY))
    	System.out.println("Point found in rectangle");
    
    else
    	System.out.println("Point not found in rectangle");
    System.out.println();
    



	Point p1=new Point(1,2);
	Point p2=new Point(3,4);
	//point object
	Rectangle r1=new Rectangle(p1,3,4);
    //Create call rectangle instance
	Rectangle r2=new Rectangle(p2,3,4);
    System.out.println("21."+r1);
    Rectangle r3;
    //function call for union
    r3=r1.union(r2);
    System.out.println("After union:"+r3);
    //Rectangle20
System.out.println(" ");
System.out.println("22.The interesction rectangle is"+r2.intersection(r1));


}
}