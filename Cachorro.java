package POO;

public class Cachorro extends Animal {
   private String raça;
	
	public void cachorro(String nome,String idade,String som,String dcorrer,raça)
	{
		super(nome,idade,som,dcorrer,sexo);
		this.raça = raça;
	}
	


	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}