package Turma22;

import java.util.*;

public class Exercicio1NumeroMaior {

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner (System.in);
		int a,b,c;
		
		System.out.println("Digite o primeiro número: ");
		a = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		b = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		c = ler.nextInt();
		
		if(a > b);{
			if(a > c);{
				if(b < c);{
					System.out.println("O número maior é: "+b);
				}
				
			}
		}

	}

}
