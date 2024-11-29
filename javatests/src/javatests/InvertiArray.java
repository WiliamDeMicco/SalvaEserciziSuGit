package javatests;
import java.util.Arrays;
import java.util.Scanner;
public class InvertiArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//creo l'array
		int [] numeri = new int [6];
		int i = 0;
		while (i< 6 ) {
			//chiediamo all'utente di inserire i numeri
			System.out.print("Inserisci il " + (i + 1) + "° numero: " );
			numeri[i] = scanner.nextInt();
			i++;
		}
		//creo un'altro array per i numeri inversi
		int[] numeriInversi = new int[6];
		int j = 0;
		while (i> 0) {
			numeriInversi[j] = numeri[i - 1];
			i--;
			j++;
		}System.out.print("L'array in ordine inverso è: ");
		for( int num : numeriInversi) {
			System.out.print(num + " ");
		}
		//chiudo lo scanner
		scanner.close();
		
		
	
	}

}
