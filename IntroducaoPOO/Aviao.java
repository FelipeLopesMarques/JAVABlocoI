package IntroducaoPOO;

import java.util.Scanner;

public class Aviao {

	public static void main(String[] args) {
		
		Exercicio2ModeloAviao aviao1 = new Exercicio2ModeloAviao();
		Scanner ler = new Scanner(System.in);
		
		aviao1.cor="Branco";
		aviao1.modelo=737;
		aviao1.capacidade=100;
		aviao1.voar();
		aviao1.pousando();
		aviao1.escrever();
		aviao1.estadoAtual();
		
		

	}

}