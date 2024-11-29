package javatests;
import java.util.Arrays;
import java.util.Scanner;
public class MatriceArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] myNumbers = new int [3][3];
		
		//Inseriamo i valori nella matrice
		System.out.println("inserisci i valori per la matrice:" );
		for( int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				//inseriamo una posizione per i valori che devono uscire
				System.out.print("valore di sinistra [" + i + "] valore di destra [" + j + "]: ");
				//contando sempre che il primo valore corrispondera a 0 in entrambi i casi (i,j)
				myNumbers[i][j] = scanner.nextInt();
			}
		}
		//Stampa della matrice in tabellare
		System.out.println("\nLa matrice è: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(myNumbers[i][j] + "\t");
			}
			System.out.println();
		}
		scanner.close();

	}

}
