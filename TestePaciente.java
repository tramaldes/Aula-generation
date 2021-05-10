package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class TestePaciente {

	public static void main(String[] args) {
		int op;
		String nome,cpf, endereco, sexo, idade;
		try (Scanner sc = new Scanner(System.in)) {
			ArrayList<Paciente> p = new ArrayList<Paciente>(); //Array q armazena os pacientes
			
			do{ //repete o menu até q seja selecionado a opção 10 - sair
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
				System.out.println("8 - ALTERAR CONSULTA ESPECÍFICA");
				System.out.println("9 - EXCLUIR CONSULTA ESPECÍFICA");
				System.out.println("10 - SAIR");
				System.out.println("Digite sua opção: ");
				op = sc.nextInt();
					
				switch (op) {//essa opção de escolha é a correta e ñ o "if"
				
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
						
					System.out.println("Digite o endereço do paciente: ");
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
						
					p.add(p1);//adiciona o paciente atual à nossa lista de pacientes
						
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
							System.out.println("Endereço: "+currentPaciente.getEndereco());
							System.out.println("Sexo: "+currentPaciente.getSexo());						
							find=true;
							//insira uma função para pausar até que o usuário leia...
							break; //sai do laço de repetição
							}
						}
					if (!find){
						System.out.println("Paciente não encontrado!");					
					}								
					break;
					
				case 3:
					//implementação
					break;
					
				case 10:
					System.out.println("Saindo..");
					System.exit(0);
					break;
				
				default:
					System.out.println("Opção inválida!");
					
					break;
					
				}			
			}while (op!=10);
		}

	}

}
