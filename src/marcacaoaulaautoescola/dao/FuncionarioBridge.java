
package marcacaoaulaautoescola.dao;

import marcacaoaulaautoescola.model.Funcionario;


public interface FuncionarioBridge {
    
    public String inserirFuncionarioDao( Funcionario f);
    
    public boolean verificaFuncionario(String matricula);
    
    public Funcionario pesquisarFuncionarioDao(String matricula);
    
    public boolean salvarAlteracaoDao(Funcionario f);
    
    public boolean removerFuncioanrioDao(String matricula);
}
