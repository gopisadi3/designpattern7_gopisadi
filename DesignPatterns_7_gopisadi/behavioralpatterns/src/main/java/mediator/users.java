package mediator;

public class users {
	   private String name;

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public User(String name){
	      this.name  = name;
	   }

	   public void sendmessage(String message){
	      ChatRoom.showmessage(this,message);
	   }
	}
