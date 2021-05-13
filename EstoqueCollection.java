package POO;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class EstoqueCollection {

public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int op;
ArrayList<String> estoques = new ArrayList();
		
while(true) {
System.out.print("Digite uma opção para gestoriar o estoque:\n1- Add\n2-Remover\n3-Atualizar\n4-Visualizar\n0-Sair" + "\nDigite uma opção: ");
op = in.nextInt();
if(op == 0 || op < 1 || op > 4) break;
			
switch (op) {
case 1: 
in.nextLine();
System.out.print("\nPara adicionar um produto digite um numero: ");
String prod = in.nextLine();
estoques.add(prod);
break;
			case 2:
				in.nextLine();
				System.out.print("\nDigite um número para remover o produto do estoque: ");
				String prod1 = in.nextLine();
if(estoques.contains(prod1)) estoques.remove(prod1);
else System.out.println("\nO PRODUTO não foi localizado!!!");
				break;
			case 3:
				in.nextLine();
				System.out.print("\nPara atualizar o estoque, digite o número do PRODUTO: ");
				String prod2 = in.nextLine();
				System.out.print("\nDigite um produto para realizar a substituição o "+prod2+" : ");
				String prod3 = in.nextLine();
if(estoques.contains(prod2)) {
estoques.remove(prod2);
estoques.add(prod3);
}else System.out.println("Produto INESISTENTE!!!");
				break;
			case 4:
				in.nextLine();
				String msg = "estoque sem PRODUTO!!!: ";
				String msgNew = msg.toUpperCase();
				System.out.println("\nEstoque geral: ");
				if(!estoques.isEmpty()) for(String i:estoques) System.out.println("* "+i);
				else System.out.println(msgNew+"\n");
				break;
			default:
				System.out.println("\nOperação finalizada!");
			}
		}
		
	}

}