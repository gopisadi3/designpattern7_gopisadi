package strategy;
import strategy.FacebookStrategy;
import strategy.TwitterStrategy;


public class Demo {

	
	    public static void main(String[] args) {
	 
	       
	        SocialMediaContext context = new SocialMediaContext();
	 
	        context.setSocialmediaStrategy(new FacebookStrategy());
	        context.connect("gopi");
	 
	       
	 
	        
	        System.out.println("====================");
	 
	        context.setSocialmediaStrategy(new GooglePlusStrategy());
	        context.connect("gopi");
	 
	        System.out.println("====================");
	 
	        context.setSocialmediaStrategy(new OrkutStrategy());
	        context.connect("gopi");
	    }
	}

