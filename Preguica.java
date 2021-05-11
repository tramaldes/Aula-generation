package POO;

public class Preguica extends Animal{
	private String sexo;
	   
	   public Preguica(String nome,String idade,String som,String dcorrer,String sexo,String sarvore)
	   {
		   super(nome,idade,som,dcorrer, sexo);
		   this.sexo = sexo;
		   this.getSarvore();
	   }

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	}


