package IntroducaoPOO;

import java.util.Scanner;

public class ProdutoEletronico {
	
public static void main(String[] args) {
		
	Exercicio3ProdutoEletronico Patinete1 = new Exercicio3ProdutoEletronico();
		Scanner ler = new Scanner(System.in);
		
		Patinete1.cor="Dourado";
		Patinete1.modelo=50;
		Patinete1.memoria=4;
		Patinete1.ligar();
		Patinete1.ligando();
		Patinete1.escrever();
		Patinete1.estadoAtual();
}

}

	