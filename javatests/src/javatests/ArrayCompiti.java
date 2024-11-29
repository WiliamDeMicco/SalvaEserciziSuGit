package javatests;

public class ArrayCompiti {
	 public static void main(String[] args) {
	        // Dichiariamo i due array ordinati
	        int[] array1 = {1, 3, 5};
	        int[] array2 = {2, 4, 6};
	        
	        System.out.println("Ciao sono una nuova modifica su github sul master");

	        // Creiamo un array per contenere il risultato dell'unione
	        int[] mergedArray = new int[array1.length + array2.length];

	        // Indici per i due array e per l'array finale
	        int i = 0, j = 0, k = 0;

	        // Eseguiamo il merge degli array
	        while (i < array1.length && j < array2.length) {
	            if (array1[i] < array2[j]) {
	                mergedArray[k++] = array1[i++];
	            } else {
	                mergedArray[k++] = array2[j++];
	            }
	        }
	        
	        // Aggiungiamo gli eventuali elementi rimasti nell'array1
	        while (i < array1.length) {
	            mergedArray[k++] = array1[i++];
	        }

	        // Aggiungiamo gli eventuali elementi rimasti nell'array2
	        while (j < array2.length) {
	            mergedArray[k++] = array2[j++];
	        }

	        // Stampiamo il risultato
	        System.out.print("Array unito: ");
	        for (int num : mergedArray) {
	            System.out.print(num + " ");
	        }
	    }
	}

