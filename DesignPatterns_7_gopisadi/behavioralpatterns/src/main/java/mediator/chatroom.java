package mediator;

import java.util.Date;

public class chatroom {
   public static void showmessage(User user, String message){
	   System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
      
   }




}