package javatests;
import java.util.Scanner;
public class NumeriInteri {

	public static void main(String[] args) {
		//apriamo lo scanner
		Scanner scanner = new Scanner(System.in);
		int[] numeriInteri = new int[8];//inseriamo il numero massimo dei numeri
		int somma = 0;
		
		//chiediamo all'utente di inserire gli 8 numeri interi
		System.out.println("Inserisci 8 numeri interi: ");
		for(int i = 0; i < 8; i++) {// inserisco un'iterazione per far si che si fermi quando i numeri immessi arrivano a 8
			//chiedi i valori e stampali in console 
			System.out.print("inserisci valori [" + i + "]: ");
			numeriInteri[i] = scanner.nextInt();
		
		
		//somma elementi in posizione pari (indice 0, 2, 4, ecc.).
			if(i % 2 == 0) {
		//uso operatore modulus per far si che la macchina capisca che si apari o meno
				somma += numeriInteri[i];	
			}
		}
		//stampa della somma dei numeri pari
		System.out.println("la somma dei numeri in posizione pari: " + somma);
	}

}
