package POO;

public class Cachorro extends Animal {
	
	public Cachorro(int idade) {
		super("Cachorro", idade);
	}

	@Override
	public void correr() {
		System.out.println("Corre");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("AU AU AU...");
		
	}

	public static void mostraInfo() {
		System.out.print("O nome do animal é: "+getNome()+"\nIdade: "+getIdade()+"\nSom: ");
		
	}
}
