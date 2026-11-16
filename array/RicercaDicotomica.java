package array;

import java.io.PrintStream;

/**
 * Ricerca dicotomica (o binaria) in un vettore ordinato (in modo crescente).
 * Applica la tecnica "divide-et-impera", cioè divide l'array in due parti
 * e verifica se l'elemento centrale coincide con il valore cercato. Diversamente
 * sposta la ricerca sulla parte sx o parte dx a seconda che il valore da ricercare
 * sia minore o maggiore del valore centrale.
 * 
 */
public class RicercaDicotomica {

	public static void main(String[] args) {
		PrintStream out=System.out;
		
		// dichiara/alloca/inizializza un vettore ordinato in modo crescente
		int vet[]= {10,20,30,40,50,60,70,80};

		
		// visualizza il vettore
		for(int k=0;k<vet.length;k++) out.printf("[%d]",vet[k]);
		
		int num=65; // valore da ricercare (chiave)
		int pos=-1;
		int inizio=0; // posizione iniziale
		int fine=vet.length-1; // posizione finale
		
		while(inizio<=fine) {
			// calcola la posizione centrale
			int centro=(inizio+fine)/2;
			out.printf("\ninizio: %d, centro: %d, fine; %d",inizio,centro,fine);

			// verifica se il valore centrale è uguale alla chiave
			if(vet[centro]==num) {
				pos=centro;
				break;
			} else if(num>vet[centro]) inizio=centro+1; // se la chiave è maggiore del valore centrale allora la ricerca si sposta sulla parte dx spostando l'inizio subito dopo il centro
			else fine=centro-1; // se la chiave è minore del valore centrale allora la ricerca si sposta sulla parte sx spostando la fine subito prima del centro
		}
		// se la posizione pos è maggiore o uguale di zero allora la chiave è stata trovata
		// altrimenti se la posizione è rimasta -1 significa che non è stata trovata.
		if(pos>=0) out.printf("\nValore %d trovato in posizione %d",num,pos);
		else out.printf("\nValore %d non trovato.",num);

		out.println("\n\nProgramma terminato.");
	}

}
