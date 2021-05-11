package POO;

public class Cavalo extends Animal {
   private String sexo;
   
   public Cavalo(String nome,String idade,String som,String dcorrer,String sexo)
   {
	   super(nome,idade,som,dcorrer, sexo);
	   this.sexo = sexo;
   }

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}
}
