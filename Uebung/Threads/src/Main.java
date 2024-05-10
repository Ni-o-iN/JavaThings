public class Main{

	public static void main(String[] args) {

		for(int i = 0; i < 3; i++) {
			ThreadAufrufen test = new ThreadAufrufen(i);
			test.start();
			try {
				test.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
//		var nr = Runtime.getRuntime().availableProcessors();
//		System.out.println("Anzahl meiner Prozessoren: " + nr);
//		
//		var self = Thread.currentThread();
//		System.out.println("Name: " + self.getName());
//		System.out.println("Priorit�t: " + self.getPriority());
//		System.out.println("ID: " + self.getId());
		
	}

}
