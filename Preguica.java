package POO;

public class Preguica extends Animal {

	
	public Preguica(int idade) {
		super("Pregui�a", idade);
	}

	@Override
	public void mostraInfo() {
		System.out.print("O nome do animal �: "+getNome()+"\nIdade: "+getIdade()+"\nSom: ");
	}
	@Override
	public void emitirSom() {
		System.out.println("????");
	}
	@Override
	public void correr() {
		System.out.println("Sobe em �rvore");
	}
}