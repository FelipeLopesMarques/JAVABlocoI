package ExercicioHerancaPolimorfismo;

public class Cavalo extends Animal{

	public String modulo;
	public double correr;
	
	@Override
	public void som()
	{
		System.out.println("Relincha");
	}

}


