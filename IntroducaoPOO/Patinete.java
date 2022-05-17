package IntroducaoPOO;

import java.util.Scanner;

public class Patinete {

	public static void main(String[] args) {
		
		Exercicio5ModeloPatinete Patinete1 = new Exercicio5ModeloPatinete();
		Scanner ler = new Scanner(System.in);
		
		Patinete1.cor="Preto";
		Patinete1.modelo=205;
		Patinete1.capacidade=50;
		Patinete1.montar();
		Patinete1.montado();
		Patinete1.escrever();
		Patinete1.estadoAtual();
		

	}

}