
package marcacaoaulaautoescola.model;

/**
 *
 * @author Ingrid
 */
public abstract class Pessoa  {
    
    private String nome;
    private String email;
    private int idade;
    private String fone;
    private Endereco endereco;

    public Pessoa(String nome, String email, int idade, String fone, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.fone = fone;
        this.endereco = endereco;
    }
    
    
    
    private Pessoa(){}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome=" + nome + ", email=" + email +", fone=" + fone +", Endereço:"+endereco;
    }
    
    
}
