package ExercicioHerancaPolimorfismo;

public class Preguica extends Animal{

	public String modulo;
	public double subir;
	
	@Override
	public void som()
	{
		System.out.println("N�o emite som");
	}

}
