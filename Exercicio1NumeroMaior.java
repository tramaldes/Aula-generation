package Turma22;

import java.util.*;

public class Exercicio1NumeroMaior {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int a,b,c;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		c = ler.nextInt();
		
		if(a > b);{
			if(a > c);{
				if(b < c);{
					System.out.println("O n�mero maior �: "+b);
				}
				
			}
		}

	}

}
