package POO;

public class Cavalo extends Animal {

	public Cavalo(int idade) {
		super("Cavalo", idade);
	}
	@Override
	public void mostraInfo() {
		System.out.print("O nome do animal é: "+getNome()+"\nIdade: "+getIdade()+"\nSom: ");
		
	}
	@Override
	public void emitirSom() {
		System.out.println("Relincha");
	}
	@Override
	public void correr() {
		System.out.println("Corre");
	}
}