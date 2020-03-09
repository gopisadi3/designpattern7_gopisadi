package bridge;

public class BridgepatternDemo {
	   public static void main(String[] args) {
	      Shape redCircle = new Circle(100,100, 10, new RedCircle());
	      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

	      Redcircle.draw();
	      Greencircle.draw();
	   }
	}