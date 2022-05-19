package esercizio21;

public class ShiftArray {
	
	private int[] array= { 1, 2, 3, 4, 5 };
	
	public void Shift() {
		int temp=array[0];
		for(int i=0;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		array[array.length-1]=temp;
	}
	
	public void stampaArray() {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}
