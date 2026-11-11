package array;

import java.io.PrintStream;
import java.util.Scanner;

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
		
		
		// calcolo minimo
		int posMin=0;
		for(int j=0+1;j<vet.length;j++) {
			if(vet[j]<vet[posMin]) posMin=j;
		}
		out.println("posMin: "+posMin);
		
		// scambia l'elemento 0 con l'elemento di posizione posMin
		int tmp=vet[0];
		vet[0]=vet[posMin];
		vet[posMin]=tmp;
		
		//Visualizzazione del vettore
		for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
		
		// passo 2
		// calcolo minimo
		posMin=1;
		for(int j=posMin+1;j<vet.length;j++) {
			if(vet[j]<vet[posMin]) posMin=j;
		}
		out.println("\nposMin: "+posMin);
		
		// scambia l'elemento 1 con l'elemento di posizione posMin
		tmp=vet[1];
		vet[1]=vet[posMin];
		vet[posMin]=tmp;
		
		//Visualizzazione del vettore
		for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
		
		for(int i=0;i<vet.length-1;i++) {
			// calcolo minimo
			posMin=i;
			for(int j=posMin+1;j<vet.length;j++) {
				if(vet[j]<vet[posMin]) posMin=j;
			}
			out.println("\nposMin: "+posMin);
			
			// scambia l'elemento di posizione i con l'elemento di posizione posMin
			tmp=vet[i];
			vet[i]=vet[posMin];
			vet[posMin]=tmp;
			
			//Visualizzazione del vettore
			for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
		}
		
		
		out.println("\n------- ORDINATO IN MODO DECRESCENTE --------");
		
		int posMax;
		for(int i=0;i<vet.length-1;i++) {
			// calcolo massimo
			posMax=i;
			for(int j=posMax+1;j<vet.length;j++) {
				if(vet[j]>vet[posMax]) posMax=j;
			}
			out.println("\nposMax: "+posMax);
			
			// scambia l'elemento di posizione i con l'elemento di posizione posMax
			tmp=vet[i];
			vet[i]=vet[posMax];
			vet[posMax]=tmp;
			
			//Visualizzazione del vettore
			for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
		}
		
		
		out.println("\n-----------------------------");
		
		
		
		
		
		
		
	}

}
