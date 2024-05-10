import java.io.*;
	
public class FileStream { 									//liest Files ein
	    
	public static void main(String[] args) throws IOException{
		
		@SuppressWarnings("resource")
		FileReader reader = new FileReader("test.txt");
		//FileWriter writer = new FileWriter("test2.txt");	//Diese 
		
		char[] c = new char[1024]; 							//Wie viele Zeichen sollen nach einander ein/ausgelesen werden
		int i = 0;
		
		while ((i = reader.read(c)) >= 0) {
			System.out.print(c);
			System.out.println();
			System.out.println("Anzahl der Zeichen " + i);
			System.out.println();
			//writer.write(c, 0, i);							//Diese 
		}
		
		//writer.close();										//Und diese Zeile stehen hier wenn man den Text einer Datei in eine andere Datei kopieren m�chte.
		
		FileWriter writer = new FileWriter("test2.txt");	//(Hier k�nnen wir 
															//(die Datei selbst
		writer.write("Wird in der neuen Datei eingef�gt");	//(bef�llen
		writer.close();
		
	}
	
}