
package marcacaoaulaautoescola.dao;

import marcacaoaulaautoescola.model.Aula;


public interface AulaBridge {
    
    
    public String cadastrarAulaDao(Aula a);
    
    public boolean verificaAula(String matricula);
     
    public Aula pesquisarAulaDao(String matricula);
    
    public boolean salvarAlteracaoDao(Aula aula);
    
    public boolean removerAulaDao(String matricula);
}
