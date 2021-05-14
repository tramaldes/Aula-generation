package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class TestePaciente {

	public static void main(String[] args) {
		int op;
		String nome,cpf, endereco, sexo, idade;
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Paciente> p = new ArrayList<Paciente>(); //Array q armazena os pacientes
			
			do{ //repete o menu at� q seja selecionado a op��o 10 - sair
				System.out.println("-------------------------");
				System.out.println("MENU PRINCIPAL");
				System.out.println("-------------------------");
				System.out.println("1 - CADASTRAR PACIENTE");
				System.out.println("2 - BUSCAR PACIENTE");
				System.out.println("3 - EXCLUIR PACIENTE");
				System.out.println("4 - ALTERAR DADOS PACIENTE");
				System.out.println("5 - EXCLUIR PACIENTE"); //igual ao item 3 do seu menu
				System.out.println("6 - BUSCAR CONSULTA");
				System.out.println("7 - LISTAR CONSULTAS");
				System.out.println("8 - ALTERAR CONSULTA ESPEC�FICA");
				System.out.println("9 - EXCLUIR CONSULTA ESPEC�FICA");
				System.out.println("10 - SAIR");
				System.out.println("Digite sua op��o: ");
				op = sc.nextInt();
					
				switch (op) {//essa op��o de escolha � a correta e � o "if"
				
				case 1:
					Paciente p1 = new Paciente(); //buffer de paciente
					System.out.println("Digite o nome: ");
					System.out.flush(); //limpa o buffer do teclado
					nome = sc.next();
					p1.setNome(nome);
						
					System.out.println("Digite o CPF do paciente: ");
					System.out.flush();
					cpf = sc.next();
					p1.setCpf(cpf);
						
					System.out.println("Digite o endere�o do paciente: ");
					System.out.flush();
					endereco = sc.next();
					p1.setEndereco(endereco);
						
					System.out.println("Qual o sexo: ");
					System.out.flush();
					sexo = sc.next();
					p1.setSexo(sexo);
						
					System.out.println("Qual a idade: ");
					System.out.flush();
					idade = sc.next();
					p1.setIdade(idade);
						
					p.add(p1);//adiciona o paciente atual � nossa lista de pacientes
						
					break;
					
				case 2:
					System.out.println("Digite o CPF do paciente: "); //busca o paciente pelo CPF
					System.out.flush();
					cpf = sc.next();
					boolean find=false;
					for (int i=0; i<p.size();i++){
						Paciente currentPaciente = (Paciente) p.get(i);
						if (currentPaciente.getCpf().equals(cpf)){
							System.out.println("CPF: "+currentPaciente.getCpf());
							System.out.println("Nome: "+currentPaciente.getNome());
							System.out.println("Idade: "+currentPaciente.getIdade());
							System.out.println("Endere�o: "+currentPaciente.getEndereco());
							System.out.println("Sexo: "+currentPaciente.getSexo());						
							find=true;
							//insira uma fun��o para pausar at� que o usu�rio leia...
							break; //sai do la�o de repeti��o
							}
						}
					if (!find){
						System.out.println("Paciente n�o encontrado!");					
					}								
					break;
					
				case 3:
					//implementa��o
					break;
					
				case 10:
					System.out.println("Saindo..");
					System.exit(0);
					break;
				
				default:
					System.out.println("Op��o inv�lida!");
					
					break;
					
				}			
			}while (op!=10);
		}

	}

}
