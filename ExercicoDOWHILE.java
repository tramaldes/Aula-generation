package Turma22;

import java.util.Scanner;

public class ExercicoDOWHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, soma = 0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			
			soma = soma + num;
			
		} while(num !=0);
		
		System.out.println("Soma dos números inseridos: " + soma);

	}

}
