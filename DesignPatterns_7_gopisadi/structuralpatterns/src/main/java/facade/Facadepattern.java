package facade;

public class Facadepattern {
	 public static void main(String[] args) {
	      shapemaker shapemaker = new shapemaker();

	      shapemaker.drawCircle();
	      shapemaker.drawRectangle();
	      shapemaker.drawSquare();		
	   }

}
