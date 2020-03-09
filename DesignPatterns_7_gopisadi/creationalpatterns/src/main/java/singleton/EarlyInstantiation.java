package singleton;

public class EarlyInstantiation{
	private static EarlyInstantiation obj=new EarlyInstantiation();
	 private EarlyInstantiation(){}  
	   
	 public static EarlyInstantiation getA(){  
	  return obj;  
	 }  
	  
	 public void doSomething(){  
	 System.out.println("Object is created at load time"); 
	 }
	 
	 
	 
	 public static void main(String args[])
	 {
	 	EarlyInstantiation obj1=EarlyInstantiation.getA();
	 	obj1.doSomething();
	 	
	 }
	





}