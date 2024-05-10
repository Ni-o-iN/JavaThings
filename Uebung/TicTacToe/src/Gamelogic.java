import java.util.Scanner;

public class Gamelogic {

	public static void main(String[] args) {
				
		char gameBoard[][] = 	{{' ', '1', ' ', '3', ' ', '5'}, 
								{'1', ' ', '|', ' ', '|', ' '},
								{' ', '-', '+', '-', '+', '-'},
								{'3', ' ', '|', ' ', '|', ' '},
								{' ', '-', '+', '-', '+', '-'},
								{'5', ' ', '|', ' ', '|', ' '}};
	
		printGameBoard(gameBoard);
		
		Scanner scanner = new Scanner(System.in);
		
		while(!gewinner(gameBoard)) {
			if(rundenZaehler%2==1)
				System.out.println("Spieler 1 ist dran");
			else
				System.out.println("Spieler 2 ist dran");
			System.out.println("An welche x Stelle wollen sie ihren Spielstein setzen?");
			int zahlY = scanner.nextInt();
			System.out.println("An welche y Stelle wollen sie ihren Spielstein setzen?");
			int zahlX = scanner.nextInt();
			setToken(zahlX, zahlY, gameBoard);
			printGameBoard(gameBoard);
			spielerOGewinnt(gameBoard);
			spielerXGewinnt(gameBoard);
			if(alleFelderBesetzt(gameBoard)) {
				System.out.println("Alle Felder sind besetzt und keiner hat gewonnen.");
				break;
			}
		}
		
	}
	
	static int rundenZaehler = 1;
	static boolean spieler1Gewinnt = false;
	static boolean spieler2Gewinnt = false;

		
	public static void printGameBoard(char[][] gameBoard) {
		for(int i = 0; i<6; i++) {
			for(int j = 0; j<6; j++) {
				char c = gameBoard[i][j];
				System.out.print(c);
			}
			System.out.println();
		}
		System.out.println();
	}
				
	public static char playersSymbol() {
		if(rundenZaehler%2==1)
			return 'X';
		else
			return 'O';
	}
		
	public static void setToken(int zahlX, int zahlY, char[][] gameBoard) {
		if(gameBoard[zahlX][zahlY] == ' ') {		
			gameBoard[zahlX][zahlY] = playersSymbol();
			rundenZaehler++;
		} else {
			System.out.println("Inkorrekte Eingabe, bitte erneut eingeben.");
		}
	}
	
	public static void spielerOGewinnt(char[][] gameBoard) {
		if((gameBoard[1][1] & gameBoard[1][3] & gameBoard[1][5]) == 'O') {
			spieler2Gewinnt = true;
		}else if ((gameBoard[3][1] & gameBoard[3][3] & gameBoard[3][5]) == 'O') {
			spieler2Gewinnt = true;
		}else if ((gameBoard[5][1] & gameBoard[5][3] & gameBoard[5][5]) == 'O') {
			spieler2Gewinnt = true;
		}else if ((gameBoard[1][1] & gameBoard[3][1] & gameBoard[5][1]) == 'O') {
			spieler2Gewinnt = true;
		}else if ((gameBoard[1][3] & gameBoard[3][3] & gameBoard[5][3]) == 'O') {
			spieler2Gewinnt = true;
		}else if ((gameBoard[1][5] & gameBoard[3][5] & gameBoard[5][5]) == 'O') {
			spieler2Gewinnt = true;
		}else if ((gameBoard[1][1] & gameBoard[3][3] & gameBoard[5][5]) == 'O') {
			spieler2Gewinnt = true;
		}else if ((gameBoard[3][1] & gameBoard[3][3] & gameBoard[1][5]) == 'O') {
			spieler2Gewinnt = true;
		}else {
			spieler2Gewinnt = false;
		}
		
	}
		
	public static void spielerXGewinnt(char[][] gameBoard) {
		if((gameBoard[1][1] & gameBoard[1][3] & gameBoard[1][5]) == 'X') {
			spieler1Gewinnt = true;
		}else if ((gameBoard[3][1] & gameBoard[3][3] & gameBoard[3][5]) == 'X') {
			spieler1Gewinnt = true;
		}else if ((gameBoard[5][1] & gameBoard[5][3] & gameBoard[5][5]) == 'X') {
			spieler1Gewinnt = true;
		}else if ((gameBoard[1][1] & gameBoard[3][1] & gameBoard[5][1]) == 'X') {
			spieler1Gewinnt = true;
		}else if ((gameBoard[1][3] & gameBoard[3][3] & gameBoard[5][3]) == 'X') {
			spieler1Gewinnt = true;
		}else if ((gameBoard[1][5] & gameBoard[3][5] & gameBoard[5][5]) == 'X') {
			spieler1Gewinnt = true;
		}else if ((gameBoard[1][1] & gameBoard[3][3] & gameBoard[5][5]) == 'X') {
			spieler1Gewinnt = true;
		}else if ((gameBoard[3][1] & gameBoard[3][3] & gameBoard[1][5]) == 'X') {
			spieler1Gewinnt = true;
		}else {
			spieler1Gewinnt = false;
		}
	}
	
	public static boolean alleFelderBesetzt(char[][] gameBoard) {
		return(rundenZaehler==10);
	}
	
	public static boolean gewinner(char[][] gameBoard) {
		if(spieler2Gewinnt == true) {
			System.out.println("Spieler 2 hat gewonnen.");
			return true;
		} else if(spieler1Gewinnt == true) {
			System.out.println("Spieler 1 hat gewonnen.");
			return true;
		}
		return false;
	}
		
}