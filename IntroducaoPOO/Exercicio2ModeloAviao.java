package IntroducaoPOO;

public class Exercicio2ModeloAviao {
	
	String cor;
	int modelo;
	int capacidade;
	boolean voando;
	
	public void escrever()
	{
		if(this.voando==true)
			System.out.println("Aguarde! Seu voo esta atrasado, avi�o ainda n�o chegou.");
		else
			System.out.println("Aviao pronto para levantar voo.");
	}
	
	public void voar()
	{
		this.voando=true;
	}
	
	public void pousando()
	{
		this.voando=false;
	}
	
	public void estadoAtual()
	{
		System.out.println("cor: "+this.cor);
		System.out.println("modelo: "+ "Boeing "+this.modelo);
		System.out.println("capacidade: "+this.capacidade+"% de ocupa��o.");
		System.out.println("Esta voando? "+this.voando);
	}
	
	
	
	

}

