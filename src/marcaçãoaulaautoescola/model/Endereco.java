
package marcaçãoaulaautoescola.model;

/**
 *
 * @author Ingrid
 */
public class Endereco {
    private String cep;
    private String complemento;

    public Endereco(String cep, String complemento) {
        this.cep = cep;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return  "cep=" + cep + ", complemento=" + complemento;
    }
    
    
}