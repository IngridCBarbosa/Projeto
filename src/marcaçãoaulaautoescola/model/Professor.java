
package marcaçãoaulaautoescola.model;

/**
 *
 * @author Ingrid
 */
public class Professor extends Pessoa{
    private String matricula;

    public Professor(String matricula, String nome, String email, int idade, String fone, Endereco endereco) {
        super(nome, email, idade, fone, endereco);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    

    
    

   

   
  
    


}
