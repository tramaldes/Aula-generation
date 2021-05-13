package POO;

public abstract class Animal {
	private String nome;
	private int idade;
	
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
		
	}
	
	abstract public void correr();
	abstract public void emitirSom();
	abstract public void mostraInfo();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public static void mostraInfo1() {
}

}

