package singleton;

	class Factory {
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
	
	

		Worker worker;          
		public Factory(Worker worker) 
		{

			this.worker=worker;
			
		}

		public void ManageWork() 
		{	
			
			this.worker.work();  / 
		}

	}

	interface Worker      
	{
		void work();
		
	}
	class smartworker implements Worker{
		public void work() {
			System.out.println("smart worker working");
		}

	}

	class lazyworker implements Worker {
		public void work() {
			System.out.println("Lazy worker working");
		}

	}

	class extraordinaryworker implements Worker
	{
		public void work()
		{
			System.out.println("ExtraOrdinary worker working");
		}

	}
	
	
	


	

		
		
