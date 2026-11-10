package array;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Ricerca sequenziale (o lineare) su un vettore non ordinato.
 *
 */
public class RicercaSequenzialeVettoreNonOrdinato {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		
		out.println("+++ RICERCA SEQUENZIALE IN UN VETTORE NON ORDINATO +++");
		
		out.print("\nInserire dimensione del vettore: ");
		int n=in.nextInt();
		
		// Dichiarazione/allocazione dell'array
		int[] vet = new int[n];
		
		//Caricamento del vettore
		for(int i=0;i<vet.length;i++) {
			out.printf("[%d]: ",i);
			vet[i] = in.nextInt();
		}
		
		out.println("-----------------------------");
		
		//Visualizzazione del vettore
		out.println("\nVETTORE");
		for(int i=0;i<vet.length;i++) {
			out.printf("\n[%d]: %d",i,vet[i]);
		}
		
		
		out.print("\n\nInserire valore da ricercare: ");
		int num=in.nextInt();
				
		// ricerca di un valore in un vettore non ordinato
		int pos=-1;
		for(int i=0;i<vet.length;i++) {
			if(vet[i]==num) {
				pos=i;
				break;
			}
		}
		if(pos>0) out.printf("\nValore %d trovato in posizione %d",num,pos);
		else out.printf("\nValore %d non trovato.",num);
		
		//Chiusura del flusso di input
		in.close();
	}
	
}

