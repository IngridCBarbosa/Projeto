
package marcacaoaulaautoescola.dao;

import marcacaoaulaautoescola.model.Professor;


public interface ProfessorBridge {
    
    public String inserirProfessor(Professor p);
    
    public boolean verificaProfessor(String matricula);
    
    public Professor pesquisarProfessorDao(String matricula);
    
    public boolean salvarAlteracaoDao(Professor p);
    
    public boolean removerProfessorDao(String matricula);
    
    
    
}
