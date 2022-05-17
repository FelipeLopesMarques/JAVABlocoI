package Repeticao;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		
		int n, ContP=0, ContI=0;
		
		Scanner Cont = new Scanner(System.in);
		
		for(int x=0; x<=10; x++) 	
		{
			System.out.println("Informe a Numeração: ");
			n=Cont.nextInt();
			if(n%2==0) 
			{
				ContP++;
			}
			else 
				ContI++;		
		}
		
		System.out.println("Total de Numero Pares: " + ContP);
		
		System.out.println("Total de Numeros Impares: " + ContI);

	}

}
