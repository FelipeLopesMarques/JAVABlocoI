package IntroducaoPOO;

public class Exercicio3ProdutoEletronico {
	
	String cor;
	int modelo;
	int memoria;
	boolean desligado;
	
	public void escrever()
	{
		if(this.desligado==true)
			System.out.println("Aten��o, liguel seu PC para inicia��o do Windows!");
		else
			System.out.println("Iniciando Windows, fa�a login:");
	}
	
	public void ligar()
	{
		this.desligado=true;
	}
	
	public void ligando()
	{
		this.desligado=false;
	}
	
	public void estadoAtual()
	{
		System.out.println("cor: "+this.cor);
		System.out.println("modelo: "+ "Lenovo V"+this.modelo+"s");
		System.out.println("memoria: "+this.memoria+"GB UDIMM DDR4 2666MHz.");
		System.out.println("Esta desligado? "+this.desligado);
	}
	
	
	
	

}