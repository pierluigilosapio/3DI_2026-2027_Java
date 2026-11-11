package array;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Ricerca sequenziale (o lineare) su un vettore non ordinato.
 * Come funziona:
 * 1. Si confronta l'elemento cercato (chiave) con il primo elemento del vettore.
 * 2. Se sono uguali, la ricerca termina con successo restituendo la posizione (indice).
 * 3. altrimenti, si passa all'elemento successivo e si ripete il procedimento.
 * 4. Se si raggiunge la fine del vettore senza trovare l'elemento, l'algoritmo segnala che il valore non è presente.
 */
public class RicercaSequenzialeVettoreNonOrdinato {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		
		out.println("+++ RICERCA SEQUENZIALE IN UN VETTORE NON ORDINATO +++");
		
		out.print("\nInserire dimensione del vettore: ");
		int n=in.nextInt();
		
		// Dichiara/alloca il vettore
		int[] vet = new int[n];
		
		// Carica il vettore
		for(int i=0;i<vet.length;i++) {
			out.printf("[%d]: ",i);
			vet[i] = in.nextInt();
		}
		
		out.println("-----------------------------");
		
		// Visualizza il vettore
		out.println("\nVETTORE");
		for(int i=0;i<vet.length;i++) {
			out.printf("\n[%d]: %d",i,vet[i]);
		}
		
		// chiede in input il valore da ricercare (chiave)
		out.print("\n\nInserire valore da ricercare: ");
		int num=in.nextInt();
		
		// imposta un posizione non valida		
		int pos=-1;
		for(int i=0;i<vet.length;i++) {
			if(vet[i]==num) {
				pos=i; // memorizza l'indice dove è stato trovata la chiave
				break; // esce dal ciclo perchè è inutile continuare la ricerca
			}
		}

		// se la posizione pos è maggiore o uguale di zero allora la chiave è stata trovata
		// altrimenti se la posizione è rimasta -1 significa che non è stata trovata.
		if(pos>=0) out.printf("\nValore %d trovato in posizione %d",num,pos);
		else out.printf("\nValore %d non trovato.",num);
		
		//Chiusura del flusso di input
		in.close();
	}
	
}

