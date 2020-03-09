package strategy;

public class Facebookstrategy implements ISocialMediaStrategy {
	 
    public void connectTo(String friendName) 
    {
        System.out.println("Connecting with" + friendName + "through Facebook");
    }
}
