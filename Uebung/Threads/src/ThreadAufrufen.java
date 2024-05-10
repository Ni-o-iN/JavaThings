public class ThreadAufrufen extends Thread{
	
	int number;
	
	ThreadAufrufen(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i <= 5; i++) {
			System.out.println("Thread " + number + " zum " + i + ". mal.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread " + number + " geschlossen.");
		
	}
	
}
