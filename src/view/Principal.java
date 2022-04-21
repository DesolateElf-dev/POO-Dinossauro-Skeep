package view;

import java.util.Scanner;

import classes.Dinossauro;

public class Principal {

	public static void main(String[] args) {

		Dinossauro skeep = new Dinossauro();
		
		skeep.setStatus(50, 50, 50, "Neutro");
		
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		boolean jogando = true;
		
		while(jogando) {
			System.out.println("\nEscolha uma das seguintes opções:");
			System.out.println(
					  "\n(P)ular		(C)orrer"
					+ "\nCo(M)er		C(A)ntar"
					+ "\nTomar (S)ol	Ficar na S(O)ombar"
					+ "\nS(T)atus		(F)inalizar");
			
			String textoMaiusculo = leitor.nextLine().toUpperCase();
			char letra = textoMaiusculo.charAt(0);
			
			if(letra=='F'){
				jogando = false;
				System.out.println("Jogo Finalizado");				
			}else if(letra=='P') {
				skeep.pular();
				skeep.getStatus();
			}else if(letra=='C') {
				skeep.correr();
				skeep.getStatus();
			}else if(letra=='M') {
				skeep.comer();
				skeep.getStatus();
			}else if(letra=='A') {
				skeep.cantar();
				skeep.getStatus();
			}else if(letra=='S') {
				skeep.tomarSol();
				skeep.getStatus();
			}else if(letra=='O') {
				skeep.ficarNaSombra();
				skeep.getStatus();
			}else if(letra=='T'){
				skeep.getStatus();
			}
		}
		
	}

}
