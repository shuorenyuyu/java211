//YANG ZHOU   1/7/2018
/*          cs211 instructor :James      
 * It's for question 19. To construct rectangle and give point with width and height      */
public class rectangle19 {
	private int X;
	private int Y;
	private int width;
	private int height;
	//Initializes data
		 public rectangle19(int x,int y,int width,int height){
			 X=x;
			 Y=y;
			 if(height<=0||width<=0){
				 throw new IllegalArgumentException();
			 }
			 else{
				 this.width=width;
				 this.height=height;
				 
				
			 }
		 }
		public rectangle19(Point p, int width, int height) {
			X=p.x;
			Y=p.y;
			this.width=width;
			this.height=height;
			// TODO Auto-generated constructor stub
		}
		//return width of rectangle
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
