package jana60;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class FestaCasFerragnez {
	
	public static void main (String[] args){
		//lista invitati
		String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		//creo scanner per chiedere nome
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("il suo nome prego:");
		
		String nome = scanner.nextLine();
		
		scanner.close();
		
		//controllo invito
		
		boolean invitato = false;
		
		for (int i = 0; i < listaInvitati.length; i++) {
			
			if (nome.equalsIgnoreCase(listaInvitati[i])) {
				invitato = true;
				
			}
		}
			
	//risultato
	if (invitato) {
		System.out.println("Benvanuto/a, si goda la festa");
	} else
		System.out.println("Lei non è presente sulla lista, la prego di andarsene");
	}
}