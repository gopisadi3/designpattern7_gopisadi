package bridge;

public abstract class shape {
	   protected DrawAPI drawAPI;
	   
	   protected Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	 
	public abstract void draw();	
	}