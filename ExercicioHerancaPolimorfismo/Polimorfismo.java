package ExercicioHerancaPolimorfismo;

public class Polimorfismo {

	public static void main(String[] args) {
		
		Animal an = new Animal();
		Cachorro Pepy = new Cachorro();
		Cavalo Max = new Cavalo();
		Preguica Many = new Preguica();		
		
        an.som();
        System.out.println("\nCACHORRO:");
     	Pepy.som();
     	
     	System.out.println("\nCAVALO:");
    	Max.som();
    	
    	System.out.println("\nPREGUIÇA:");
    	Many.som();
    	
	}
	
}
