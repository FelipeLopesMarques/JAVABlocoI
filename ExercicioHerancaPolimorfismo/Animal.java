package ExercicioHerancaPolimorfismo;

public class Animal {
	
	public String nome;
	public int idade;
	public double emitesom;
	
	public void som()
	{
		System.out.println("Esses animais emitem qual som?");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getEmitesom() {
		return emitesom;
	}
	public void setEmitesom(double emitesom) {
		this.emitesom = emitesom;
	}
	
	

}


