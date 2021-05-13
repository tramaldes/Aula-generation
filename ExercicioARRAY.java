package Turma22;

import java.util.Scanner;

public class ExercicioARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numero = new int[6];
		int somapar=0,quantimpar=0;
		
		Scanner l = new Scanner(System.in);
		
		for(int x=0;x<6;x++)
		{
			System.out.println("\nEntre com um numero: ");
			numero[x] = l.nextInt();
			
			if(numero[x]%2==0)
			{
				System.out.println(numero[x]+" <-- Este numero é impar: ");
				quantimpar++;
			}
		}
		System.out.println("\nSomatório dos números pares: "+somapar);
		System.out.println("\nQuantidade de númeors impares: "+quantimpar);
	}

}
