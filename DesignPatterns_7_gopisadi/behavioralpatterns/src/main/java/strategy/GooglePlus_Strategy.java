package strategy;

public class GooglePlus_Strategy implements ISocialMediaStrategy {
	 
    public void connectTo(String friendName) 
    {
        System.out.println("Connecting with " + friendName + " through GooglePlus");
    }
}