package singleton;



public class Mainfactory {

public static void main(String[] args) {

		
	smartworker sw = new smartworker();
		Factory mn = new Factory(sw);
		mn.managework();
		
		lazyworker lw = new lazyworker();
		Factory mn2 = new Factory(lw);
		mn2.managework();
		
		extraordinaryworker ew = new extraordinaryworker();
		Factory mn3 = new Factory(ew);
		mn3.managework();

	}

}
