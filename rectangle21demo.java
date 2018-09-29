//YANG ZHOU   1/7/2018
/*          cs211 instructor :James      
* It's for question 21. To construct rectangle and give point with width and height Return a new RECTANGLE that reparesents the largest 
* rectangle region      */
public class rectangle21demo {
public static void main(String[]args){
	//rectangledemo 
	Point p1=new Point(1,2);
	Point p2=new Point(3,4);
	//point object
    rectangle21 r1=new rectangle21(p1,3,4);
    //Create call rectangle instance
    rectangle21 r2=new rectangle21(p2,3,4);
    System.out.println(r1);
    rectangle21 r3;
    //function call for union
    r3=r1.union(r2);
    System.out.println("After union:"+r3);
}
}
