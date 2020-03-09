package facade;


public class shapemaker {
	
		 
	 
	private shape1 circle;
	   private shape1 rectangle;
	   private shape1 square;

	   public shapemaker() {
	      circle = new circle();
	      rectangle = new rectangle();
	      square = new square();
	   }

	   public void drawCircle(){
	      circle.draw();
	   }
	   public void drawRectangle(){
	      rectangle.draw();
	   }
	   public void drawSquare(){
	      square.draw();
	   }

}

