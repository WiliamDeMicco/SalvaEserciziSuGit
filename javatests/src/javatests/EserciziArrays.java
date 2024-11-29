package javatests;
import java.util.Arrays;
public class EserciziArrays {

	public static void main(String[] args) {		
	int []Array1 = {3,6,8};
	int []Array2 = {5,10,2};
		
		System.out.println(Arrays.toString(Array1));
		System.out.println(Arrays.toString(Array2));
			
int []Array = new int [Array1.length + Array2.length];
		
	for(int i=0; i<Array1.length; i++) {
			Array[i] = Array1[i];
		}
	for (int i=0; i<Array2.length; i++) {
			Array[Array1.length + i] = Array2[i];
		}
		
		System.out.println(Arrays.toString(Array));
			
	for(int i=0; i < Array.length-1; i++) {
		for(int y=0; y<Array.length-1; y++) {
			if(Array [y] > Array[y+1]) {
			int temp = Array[y]; // assegnazione temporanea di un valore per scambiare i numeri tra i vari arrays
				Array[y] = Array[y+1];
				Array[y+1] = temp;
			}
			}
		}
		
			System.out.println(Arrays.toString(Array));
	}

}
