package Turma22;
import java.util.*;
public class ExercicioWHILE {

	public static void main(String[] args) {
		int idade,idade21,idade50;
		idade=0;
		idade21=0;
		idade50=0;
		while(idade<=98){
		Scanner leia = new Scanner(System.in);
		System.out.printf("Digite sua idade: ");
		idade = leia.nextInt();
		if(idade<21) { idade21=idade21+1;}
		if(idade>50) { idade50=idade50+1;}
		}
		System.out.printf("Idade menor que 21: %d\n", idade21);
		System.out.printf("Idade maior que 50: %d\n\n", idade50);
		
		
		

	}

}
