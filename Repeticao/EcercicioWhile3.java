package Repeticao;

import java.util.Scanner;

public class EcercicioWhile3 {

	public static void main(String[] args) {

		int I, Mais=0, Menos=0;
				
			Scanner Ler = new Scanner(System.in);
			
			System.out.print("Idade: ");
			I=Ler.nextInt();
		
		 while(I<=99)
		 {
			 System.out.print("Idade: ");
			 I=Ler.nextInt();
			 
			 if (I<=21 )
			  Menos++;
			 
			 else if(I>=50)
		      Mais++;
		 }
		
		 System.out.print( Menos + " Pessoas com menos de 21 anos e ");
		 System.out.print( Mais + " pessoas com mais de 50 Anos.");
	   
	  
	}
}
