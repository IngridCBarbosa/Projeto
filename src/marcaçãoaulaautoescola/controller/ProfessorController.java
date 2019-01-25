
package marcaçãoaulaautoescola.controller;

import marcacaoautoescola.factory.ProfessorFactory;
import marcaçãoaulaautoescola.dao.ProfessorBridge;
import marcaçãoaulaautoescola.model.Professor;


public class ProfessorController{
    
    private ProfessorBridge dao;
    
        
   public ProfessorController(){
        this.dao = ProfessorFactory.create(0);
    }
    
    public String inserir(Professor p){
        
        if(validaProfessor(p) == "ok"){
            return dao.inserirProfessor(p);
        }else{
            return validaProfessor(p);
        }
    }
    
    private String validaProfessor(Professor p){
       String mensagem; 
       if(p.getMatricula().isEmpty()|| p.getMatricula() == null){
           return "matricula inválida";
       }
        return mensagem = "ok";
    }
  
    public Professor consultaProfessor(String matricula){
        Professor p;
        if(matricula.isEmpty()){
            return null;
        }
        else{
            p = dao.pesquisarProfessorDao(matricula);
            return p;   
        }
    }
    
    public boolean removerProfessorController(String matricula){
        if(matricula.isEmpty() || matricula == null){
            return false;
        }
        else{
            return dao.removerProfessorDao(matricula);
        }
    }
    
    public boolean alterarDadosController(Professor p){
        if(p != null){
            return dao.salvarAlteracaoDao(p);
        }
        else{
            return false;
        }
    }

}
