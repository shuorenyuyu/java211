//YANG ZHOU   1/7/2018
/*          cs211 instructor :James      
* It's for question 21. To construct rectangle and give point with width and height Return a new RECTANGLE that reparesents the largest 
* rectangle region      */
public class rectangle21demo {
public class rectangle21 {
	private int X;
	private int Y;
	private int width;
	private int height;
	//Initializes data
		 public rectangle21(int x,int y,int width,int height){
			 X=x;
			 Y=y;
			 if(height<=0||width<=0){
				 throw new IllegalArgumentException();
				 // give hint for wrong data input
			 }
			 else{
				 this.width=width;
				 this.height=height;
				 			
			 }
		 }
		 public rectangle21(Point p,int width,int height){
			 X=p.x;
			 Y=p.y;
			 this.width=width;
			 this.height=height;
			 //constructor with point object as paramter 
		 }
		
		 public boolean contains(int x,int y){
			 if(X==x&Y==y)
				 return true;
				 	
			 else
				 			 return false;
		 }
		 public boolean contains(Point p){
			 if(X==p.x&&Y==p.y)
				 return true;
				 		 else
				 			 return false;
		 }
		 public rectangle21 union(rectangle21 r){
			 int newX=	Math.min(X, r.getX());
			 int newY=	Math.min(Y, r.getY());
			 int newWidth=	Math.max(X+width,r.getX()+r.getWidth())-newX;
			 int newHeight=	Math.max(Y+height,r.getY()+r.getHeight())-newY;
			 return new rectangle21(newX,newY,newWidth,newHeight);
		 }
		 public int getWidth(){
			 return width;
		 }
		//return height of rectangle
		 public int getHeight(){
			 return height;
		 }
		 //return the x coordinates 
		 public int getX(){
			 return X;
		 }
		 //return the y coordinates 
		 public int getY(){
			 return Y;
		 }
		 public String toString(){
			 return "Rectangle[x="+getX()+"y="+getY()+"width="+getWidth()+"height="+getHeight()+"]";
		 }
		 
}
