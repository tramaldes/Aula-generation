package POO;

public class Cachorro extends Animal {
   private String ra�a;
	
	public void cachorro(String nome,String idade,String som,String dcorrer,ra�a)
	{
		super(nome,idade,som,dcorrer,sexo);
		this.ra�a = ra�a;
	}
	


	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}