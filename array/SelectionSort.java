package array;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Algoritmo di ordinamento Selection Sort (o per minimi successivi).
 * Ordinamento crescente e decrescente.
 */
public class SelectionSort {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		
		out.println("+++ SELECTION SORT +++");
		
		out.print("\nInserire dimensione del vettore: ");
		int n=in.nextInt();
		
		// Dichiarazione/allocazione dell'array
		int[] vet = new int[n];
		
		//Caricamento del vettore
		for(int i=0;i<vet.length;i++) {
			out.printf("[%d]: ",i);
			vet[i] = in.nextInt();
		}
		
		//Visualizzazione del vettore
		for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
		
		
		out.println("\n\n------- ORDINAMENTO CRESCENTE --------");
		int posMin; 
		int tmp;
		
		// cicla
		for(int i=0;i<vet.length-1;i++) {
			// imposta la posizione predefinita del minimo
			posMin=i;

			// calcola la posizione del minimo
			// scartando gli elementi già posizionati
			// correttamente.
			for(int j=posMin+1;j<vet.length;j++) {
				if(vet[j]<vet[posMin]) posMin=j;
			}
			out.println("posMin: "+posMin);
			
			// scambia l'elemento di posizione i con l'elemento di posizione posMin
			tmp=vet[i];
			vet[i]=vet[posMin];
			vet[posMin]=tmp;
			
			//Visualizzazione del vettore
			for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
			out.println("\n");
		}
		
		out.print("VETTORE ORDINATO IN MODO CRESCENTE: ");
		for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
		
		out.println("\n\n------- ORDINAMENTO DECRESCENTE --------");
		
		// indica la posizione dell'elemento maggiore 
		// tra quelli confrontati.
		int posMax;
		
		// ogni volta che cicla, posiziona l'elemento maggiore
		// in posizione i.
		for(int i=0;i<vet.length-1;i++) {
			
			// imposta la posizione predefinita del massimo 
			posMax=i;
			
			// calcola la posizione del massimo
			// scartando gli elementi già posizionati
			// correttamente.
			for(int j=posMax+1;j<vet.length;j++) {
				if(vet[j]>vet[posMax]) posMax=j;
			}
			out.println("posMax: "+posMax);
			
			// scambia l'elemento di posizione i con l'elemento di posizione posMax
			tmp=vet[i];
			vet[i]=vet[posMax];
			vet[posMax]=tmp;
			
			// visualizza del vettore
			for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
			out.println("\n");
		}
		
		out.print("VETTORE ORDINATO IN MODO DECRESCENTE: ");
		for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
		
		in.close();
		out.println("\nProgramma terminato.");
		
	}

}
