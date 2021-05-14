package POO;
public class Funcionario {
	protected String nome;
    protected String documento;

    public String toString(){
        return "\n--Funcionário--" +
               "\nNome: " + this.nome +
               "\nDocumento: " + this.documento;
    }
}

class Motorista extends Funcionario{

    Motorista(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String toString(){
        return "\n--Motorista--" +
               "\nNome: " + this.nome +
               "\nDocumento: " + this.documento;
    }
}

class Secretaria extends Funcionario{
    private String telefone;

    Secretaria(String nome, String documento, String telefone) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
    }

    public String toString(){
        return "\n--Secretaria--" +
               "\nNome: " + this.nome +
               "\nDocumento: " + this.documento +
               "\nTelefone: " + this.telefone;
    }
    
}
