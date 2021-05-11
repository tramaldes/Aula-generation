package POO;

public class Animal {
   private String nome;
   private String idade;
   private String som;
   private String dcorrer;
   private String sarvore;
   
   public Animal (String nome, String idade, String som, String dcorrer, String sarvore)
   {
	   this.nome = nome;
	   this.idade = idade;
	   this.som = som;
	   this.dcorrer = dcorrer;
	   this.sarvore = sarvore;
	   
   }

public String getSarvore() {
	return sarvore;
}

public void setSarvore(String sarvore) {
	this.sarvore = sarvore;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getIdade() {
	return idade;
}

public void setIdade(String idade) {
	this.idade = idade;
}

public String getSom() {
	return som;
}

public void setSom(String som) {
	this.som = som;
}

public String getDcorrer() {
	return dcorrer;
}

public void setDcorrer(String dcorrer) {
	this.dcorrer = dcorrer;
}
}
