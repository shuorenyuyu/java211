import java.awt.Point;

//YANG ZHOU   1/12/2018
/*          cs211 instructor :James      
* It's for question 21. To construct rectangle and give point with width and height Return a new RECTANGLE that reparesents the largest 
* rectangle region      */
public class Rectangle {
	private int X;
	private int Y;
	private int width;
	private int height;
	//Initializes data
		 public Rectangle(int x,int y,int width,int height){
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
		 public Rectangle(Point p,int width,int height){
			 X=p.x;
			 Y=p.y;
			 this.width=width;
			 this.height=height;
			 //constructor with point object as parameter 
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
		 public Rectangle union(Rectangle r){
			 int newX=	Math.min(X, r.getX());
			 int newY=	Math.min(Y, r.getY());
			 int newWidth=	Math.max(X+width,r.getX()+r.getWidth())-newX;
			 int newHeight=	Math.max(Y+height,r.getY()+r.getHeight())-newY;
			 return new Rectangle(newX,newY,newWidth,newHeight);
          //afther union
		 }
       
       public Rectangle intersection(Rectangle rect) {
			     
      int oldX = Math.max(this.getX(), rect.getX());
      
		int endX = Math.min(this.getX() + this.getWidth(), rect.getX() + rect.getWidth());
      
		int oldY = Math.max(this.getY(), rect.getY());
      
		int endY = Math.min(this.getY() + this.getHeight(), rect.getY() + rect.getHeight());
      //boolean the intersection works
      if (this.getX() + this.getWidth() < rect.getX() || rect.getX() + rect.getWidth() < this.getX()
				|| this.getY() + this.getHeight() < rect.getY() || rect.getY() + rect.getHeight() < this.getY())
			return null;
		// the situation doesn't work will be negative number come out

      
	  // the meathod to get intersection Rectangle
		return new Rectangle(oldX, oldY, endX - oldX, endY - oldY);
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
