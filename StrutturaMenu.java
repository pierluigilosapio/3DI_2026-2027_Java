import java.io.PrintStream;
import java.util.Scanner;

/**
 * Esempio di programma con struttura a menu'
 */
public class StrutturaMenu {

	public static void main(String[] args) {
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		int scelta=0;
		
		do {
			// visualizza il menu'
			out.println("+++ MENU' +++");
			out.println("1- OPZIONE1");
			out.println("2- OPZIONE2");
			out.println("3- OPZIONE3");
			out.println("0- USCITA");
			
			// chiede all'utente di fare la scelta
			out.print("> ");
			scelta=in.nextInt();
			
			// esegue la funzione richiesta
			switch(scelta) {
				case 1: // opzione 1
						out.println("Opzione 1\n");
						break;
				case 2: // opzione 2
						out.println("Opzione 2\n");
						break;	
				case 3: // opzione 3
						out.println("Opzione 3\n");
						break;
				case 0: // opzione 0
						break;
				default:
					// in caso di scelta diversa da tutte 
					// le precedenti, viene visualizzato
					// il messaggio di scelta non valida.
					out.println("Scelta non valida\n");
			}
			
		} while(scelta!=0); // esce in caso di scelta 0

		in.close();
		
		out.println("Programma terminato.");
	}

}
