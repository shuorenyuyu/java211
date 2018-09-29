
import java.util.LinkedList;
import java.util.List;
//YANG ZHOU   1/7/2018
/*          cs211 instructor :James      
* It's for question 20. To construct rectangle and give point with width and height      */
public class Rectangledemo20 {
    public static void main(String[]args)
    {
    	Point p=new Point(2,4);
    	//creat point object
    rectangle19 r=new rectangle19(p,3,6);
    //creating rectangle example
    System.out.println(r);
    int pX=6,pY=3;
 System.out.println("("+pX+","+pY+")");
 //print out rectangle data
    if(r.contains(pX,pY))
    	System.out.println("Point found in rectangle");
    else
    	System.out.println("Point not found in rectangle");
    //check if it's in rectangle
    Point point=new Point(5,6);
    System.out.println(point);
    if(r.contains(pX,pY))
    	System.out.println("Point found in rectangle");
    else
    	System.out.println("Point not found in rectangle");
    }}

