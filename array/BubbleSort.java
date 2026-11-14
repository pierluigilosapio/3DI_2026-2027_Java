package array;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Algoritmo di ordinamento crescente BubbleSort
 */
public class BubbleSort {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		
		out.println("+++ BUBBLE SORT +++");
		
		out.print("\nInserire dimensione del vettore: ");
		int n=in.nextInt();
		
		// Dichiara/alloca l'array
		int[] vet = new int[n];
		
		// Carica il vettore
		for(int i=0;i<vet.length;i++) {
			out.printf("[%d]: ",i);
			vet[i] = in.nextInt();
		}
		
		// Visualizza il vettore
		for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
		out.println();
		
		// l'indice i rappresenta il numero di elementi già
		// posizionati correttamente.
		for(int i=0;i<vet.length-1;i++) {
			// indica se sono stati fatti
			// degli scambi. 
			// La variabile scambi è detta 'sentinella'.
			boolean scambi=false;
			
			// cicla dal primo sino al penultimo
			for(int j=0;j<vet.length-1-i;j++) {
				if(vet[j]>vet[j+1]) {
					int tmp=vet[j];
					vet[j]=vet[j+1];
					vet[j+1]=tmp;
					
					// è stato fatto almeno uno scambio
					scambi=true;
				}
			}
			// se non sono stati fatti scambi
			// allora il vettore è già ordinato
			//if(scambi==false) break;
			if(!scambi) break;
			
			for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
			out.println();
		}
		
		in.close();
		out.println("\nProgramma terminato.");

	}

}
