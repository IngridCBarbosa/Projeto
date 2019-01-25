package marcacaoaulaautoescola.model;

/**
 *
 * @author Ingrid
 */
public class Funcionario extends Pessoa{
    private String funcao;
    private String matricula;

    public Funcionario(String funcao, String matricula, String nome, String email, int idade, String fone, Endereco endereco) {
        super(nome, email, idade, fone, endereco);
        this.funcao = funcao;
        this.matricula = matricula;
    }

   
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
}
