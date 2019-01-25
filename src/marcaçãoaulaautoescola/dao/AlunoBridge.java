
package marcaçãoaulaautoescola.dao;

import java.util.ArrayList;
import marcaçãoaulaautoescola.model.Aluno;

public interface AlunoBridge {
    
    
    public String cadastrarAlunoDao(Aluno p);
    
    public boolean verificaAluno(String matricula);
    
    public Aluno pesquisarAlunoDao(String matricula);
    
    public boolean salvarAlteracaoDao(Aluno a);
    
    public boolean removerAlunoDao(String matricula);
    
    
    public ArrayList<Aluno> listaAlunoDao();
}
