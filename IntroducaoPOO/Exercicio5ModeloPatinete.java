package IntroducaoPOO;

public class Exercicio5ModeloPatinete {
	
	String cor;
	int modelo;
	int capacidade;
	boolean desmontado;
	
	public void escrever()
	{
		if(this.desmontado==true)
			System.out.println("Produto novo, utilize o manual para monta-lo!");
		else
			System.out.println("Produto montado, pronto para uso.");
	}
	
	public void montar()
	{
		this.desmontado=true;
	}
	
	public void montado()
	{
		this.desmontado=false;
	}
	
	public void estadoAtual()
	{
		System.out.println("cor: "+this.cor);
		System.out.println("modelo: "+ "ES"+this.modelo+ " Básico");
		System.out.println("Capacidade: "+this.capacidade+ "kg para crianças de 4 à 5 anos de idade.");
		System.out.println("Esta desmontado? "+this.desmontado);
	}
	
	
	
	

}