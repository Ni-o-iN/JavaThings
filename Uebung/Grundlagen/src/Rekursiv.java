public class Rekursiv {
     public static void main (String[] args) {  
    	 int test = 4;
         rek(test); 
         System.out.println();
         rekOhneHochzaehlen(test);
     }                         
     
     public static void rek(int z) {          
         z--;                                  
         System.out.println(z);			// 3 2 1     
         if (z!=0)                         
             rek(z);					// mit 3 in die Methode dann mit 2 und dann mit 1
         System.out.println(z);
     }								 	/* 3 2 1 wird aber erst erreicht wenn z 0 ist dann wird   
                                        * es von hinten abgearbeitet also wird erst die 1 dann die 2 und       
     									* dann die 3 ausgegeben */
         
     public static void rekOhneHochzaehlen(int z) {    
         z--;                                    		
         System.out.println(z);                  		
         if (z!=0)                               	
        	 rekOhneHochzaehlen(z); 
         else
        	 System.out.println(z);
     }       
 }        