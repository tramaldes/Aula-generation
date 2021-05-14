package POO;

import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		new Cliente2();
	}

	public Cliente() {

		
		ArrayList<InfoCliente> somenteInfoCliente = new ArrayList<InfoCliente>();

		
		Scanner leitor = new Scanner(System.in);

		
		int sair = 1;

		while (sair != 0) {
			
			InfoCliente info = new InfoCliente();

			
			System.out.print("Digite nome do cliente:");
			info.setNome(leitor.next());

			
			System.out.print("Digite o salario:");
			info.setSalario(Double.valueOf(leitor.next()));

			
			somenteInfoCliente.add(info);

			System.out.println("INFO: Digite zero para sair ou 1 para continuar:");
			sair = leitor.nextInt();
		}

		
		for (InfoCliente info : somenteInfoCliente) {

			System.out.println("nome mais salario :" + info.getNome() + " ->"
					+ info.getSalario());

		}

	}
}


class InfoCliente {
	double salario;
	String nome;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
