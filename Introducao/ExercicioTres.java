package Introducao;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		System.out.println();
		Scanner ler = new Scanner (System.in);
		System.out.println("Informe a sua idade: ");
		int idade;
		idade = ler.nextInt();
		
		
		if(idade>0 && idade<=10)
			System.out.println("\n Fora das categorias");
		else if(idade>10 && idade<=14)
			System.out.println("\n Infantil");
		else if(idade>14 && idade<=17)
			System.out.println("\n Juvenil");
		else if(idade>17 && idade<=25)
			System.out.println("\n Adulto");
		else 
			System.out.println("\n Fora das categorias");
		
		
	}
}

	

