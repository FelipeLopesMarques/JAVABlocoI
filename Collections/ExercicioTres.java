package Collections;

import java.util.ArrayList;

public class ExercicioTres {

	public static void main(String[] args) {
		
		String estoque1 = "Arroz";
		String estoque2 = "Feij�o";
		String estoque3 = "Macarr�o";
		String estoque4 = "Peixe";
		String estoque5 = "P�o";
		String estoque6 = "Leite";
		String estoque7 = "Ovos";
		String estoque8 = "Carne";
		String estoque9 = "Frango";
		String estoque10 = "Caf�";
		
		ArrayList <String> estoque = new ArrayList<>();
		
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4);
		estoque.add(estoque5);
		estoque.add(estoque6);
		estoque.add(estoque7);
		estoque.add(estoque8);
		estoque.add(estoque9);
		estoque.add(estoque10);
		
		System.out.println("Estoque de Armazenamento de Alimentos.\n");
		
		System.out.println("Informa��es atuais de itens armazenados no seu estoque: " + "\n" + estoque );
		
		System.out.println("\nEstoque cont�m: " + estoque.size() + " itens \n");
		
		estoque.remove(0);
		estoque.remove(2);
		estoque.remove(4);
		
		System.out.println("Os Itens Arroz, Peixe e Ovos foram removidos!");
		
		System.out.println("\nA quantidade atual de Intens em seu estoque � : " + estoque.size());
		
		System.out.println("\nOs alimentos ainda armazenas em seu estoque s�o: " + estoque);
		
		

	}

}
