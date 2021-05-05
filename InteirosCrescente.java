package Turma22;

import java.util.Scanner;

public class InteirosCrescente {

	public static void main(String[] args) 
	{
	   Scanner ler = new Scanner(System.in);
	   int a, b, c;
	   
	   System.out.print("Primeiro número: ");
	   a = ler.nextInt();
	   System.out.print("Segundo número: ");
	   b = ler.nextInt();
	   System.out.print("Terceiro número: ");
	   c = ler.nextInt();
	   
	   if(a < b) {
		   if(b < c) {
			   System.out.println(a+"\n"+b+"\n"+c);	
		   }
		   else if(a < c) {
			   System.out.println(a+"\n"+c+"\n"+b);
		   }else {
			   System.out.println(c+"\n"+a+"\n"+b);
		   }
	   }
	   else if(b < c) {
		   if(a < c) {
			   System.out.println(b+"\n"+a+"\n"+c);
		   }else {
			   System.out.println(b+"\n"+c+"\n"+a);
		   }
	   }
	}
           
}
