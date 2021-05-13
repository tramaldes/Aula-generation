package POO;

public class Preguica extends Animal {

	
	public Preguica(int idade) {
		super("Preguiça", idade);
	}

	@Override
	public void mostraInfo() {
		System.out.print("O nome do animal é: "+getNome()+"\nIdade: "+getIdade()+"\nSom: ");
	}
	@Override
	public void emitirSom() {
		System.out.println("????");
	}
	@Override
	public void correr() {
		System.out.println("Sobe em árvore");
	}
}