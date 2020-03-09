package bridge;

public class circle extends Shape {
	   private int x, y, radius;

	  


	   public circle(int x, int y, int radius, DrawAPI drawAPI) {
		      super(drawAPI);
		      this.x = x;  
		      this.y = y;  
		      this.radius = radius;
		   }


	public void draw() {
	      drawAPI.drawCircle(radius,x,y);
	   }

}