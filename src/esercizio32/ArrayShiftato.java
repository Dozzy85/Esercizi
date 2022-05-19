package esercizio32;

import java.util.Scanner;

public class ArrayShiftato {
	
	private int[] array;
	private int dim;
	
	public ArrayShiftato(int unaDim) {
		this.dim=unaDim;
		array=new int[dim];
	}
	
	public void aggiungi() {
		Scanner in=new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.println("Valore "+i+"=");
			array[i]=in.nextInt();
		}
	}
	
	public void stampa() {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public void shiftArray() {
		int temp=array[0];
		for(int i=0;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		array[dim-1]=temp;
	}

}
