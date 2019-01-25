
package marcaçãoaulaautoescola.controller;

import java.util.ArrayList;
import marcacaoautoescola.factory.AlunoFactory;
import marcaçãoaulaautoescola.dao.AlunoBridge;
import marcaçãoaulaautoescola.model.Aluno;


public class AlunoController {
    
    private AlunoBridge dao;
    
       
    public AlunoController(){
        if(dao == null){
            dao = AlunoFactory.create(0);
         }
    }
    
    public String inserir(Aluno p){
        
        if(validaAluno(p) == "ok"){
            return dao.cadastrarAlunoDao(p);
        }
        return validaAluno(p);
    }
    
    private String validaAluno(Aluno p){
       String mensagem; 
       if(p.getMatricula().isEmpty()|| p.getMatricula() == null){
           return "matricula inválida";
       }
        return mensagem = "ok";
    }
  
    public Aluno consultaAluno(String matricula){
        Aluno p;
        if(matricula.isEmpty()){
            return null;
        }
        else{
            p = dao.pesquisarAlunoDao(matricula);
            return p;   
        }
    }
    
    public boolean removerAlunoController(String matricula){
        if(matricula.isEmpty() || matricula == null){
            return false;
        }
        else{
            return dao.removerAlunoDao(matricula);
        }
    }
    public boolean alterarDadosAlunoController(Aluno a){
        if(a != null){
            return dao.salvarAlteracaoDao(a);
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Aluno> listarAlunoController(){
        return dao.listaAlunoDao();
    }
}
