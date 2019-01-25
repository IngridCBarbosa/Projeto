
package marcaçãoaulaautoescola.model;


public class Aluno extends Pessoa{
    
    private String tipoCarteira;
    private String matricula;

    public Aluno(String tipoCarteira, String matricula, String nome, String email, int idade, String fone, Endereco endereco) {
        super(nome, email, idade, fone, endereco);
        this.tipoCarteira = tipoCarteira;
        this.matricula = matricula;
    }
        
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getTipoCarteira() {
        return tipoCarteira;
    }

    public void setTipoCarteira(String tipoCarteira) {
        this.tipoCarteira = tipoCarteira;
    }
    
}
