package IntroducaoPOO;

public class Exercicio2ModeloAviao {
	
	String cor;
	int modelo;
	int capacidade;
	boolean voando;
	
	public void escrever()
	{
		if(this.voando==true)
			System.out.println("Aguarde! Seu voo esta atrasado, avião ainda não chegou.");
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
		System.out.println("capacidade: "+this.capacidade+"% de ocupação.");
		System.out.println("Esta voando? "+this.voando);
	}
	
	
	
	

}

