package POO;

import java.util.ArrayList;

public class TesteFuncionário {

	public static void main(String[] args) {
		{
			ArrayList<Funcionario> lista = new ArrayList<Funcionario>();

	        lista.add(new Secretaria("Fulana", "123.456.789-00", "3322-1234"));
	        lista.add(new Secretaria("Ciclana", "578.367.263-30", "5854-8952"));
	        lista.add(new Motorista("Beltrano", "654.786.324-54"));

	        System.out.println("No momento existem " +lista.size()+ " funcionários cadastrados");

	        for (Funcionario f : lista) {
	            System.out.println(f);
	        }
	        
		}
		

	}

}
