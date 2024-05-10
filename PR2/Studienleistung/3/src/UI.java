//package pr2.uebung03;
//
//import static pr.MakeItSimple.*;
//
//public class UI {
//
//	HashTable ht;
//
//	public UI(HashTable ht) { // is callable for every kind of tree
//		this.ht = ht;
//	}
//
//	public void menu() {
//		
//		HashTable table;
//				
//		println("linear/quadratic?");
//		
//		String answer = readString().toLowerCase();
//		
//		if(answer.equals("linear")) {
//			table = new HashTable(10, new LinearProbing(0, 0));
// 		} else if(answer.equals("quadratic")) {
//			table = new HashTable(10, new QuadraticProbing());
//		}
//		
//		while(true) {
//			System.out.println("Aktion: put, remove, get, contains, size, empty, clear, containsKey, printHT, reHash, stop");
//			
//			String input = readString().toLowerCase();
//			
//			int int1 = readInt();
//			int int2 = readInt();
//			
//			switch(input) {
//			case "put":
//				ht.put(int1, int2);
//				break;
//			case "remove":
//				ht.remove(int2);
//				break;
//			case "get":
//				ht.get(int2);
//				break;
//			case "contains":
//				ht.contains(int2);
//				break;
//			case "size":
//				ht.size();
//				break;
//			case "empty":
//				ht.isEmpty();
//				break;
//			case "clear":
//				ht.clear();
//				break;
//			case "containskey":
//				ht.containsKey(int2);
//				return;
//			case "printht":
//				ht.printHT();
//				break;
//			case "rehash":
//				ht.reHash();
//				break;
//			case "stop":
//				break;
//			default:
//			}
//		}
//	}
//	
//}
