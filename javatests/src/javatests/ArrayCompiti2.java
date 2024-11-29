package javatests;

public class ArrayCompiti2 {
	public static void main(String[] args) {
        // Dichiariamo l'array di numeri interi
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};
        
        // Scorriamo l'array e troviamo i duplicati
        System.out.print("Elementi duplicati: ");
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Se troviamo un duplicato
                if (array[i] == array[j]) {
                    // Stampiamo il duplicato e interrompiamo il ciclo per evitare stampe multiple dello stesso duplicato
                    System.out.print(array[i] + " ");
                    break;
                }
            }
        }
    }
}

