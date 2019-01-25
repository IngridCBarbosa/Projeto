
package marcaçãoaulaautoescola.controller;

import marcacaoautoescola.factory.FuncionarioFactory;
import marcaçãoaulaautoescola.dao.FuncionarioBridge;
import marcaçãoaulaautoescola.model.Funcionario;



public class FuncionarioController{
    
    private FuncionarioBridge daoFuncionario;
    
    
    public FuncionarioController(){
        
        if(daoFuncionario == null ){
            this.daoFuncionario = FuncionarioFactory.create(0);
        }
    }
      
    public String inserirFuncionarioController(Funcionario f){
        
        if(validaFuncionarioController(f) == "ok"){
            return daoFuncionario.inserirFuncionarioDao(f);
        }else{
            return validaFuncionarioController(f);
        }
    }
    
    private String validaFuncionarioController(Funcionario f){
       String mensagem; 
       if(f.getMatricula().isEmpty()){
           return "matricula inválida";
       }
        return mensagem = "ok";
    } 
    
    public Funcionario consultaFuncionarioController(String matricula){
        Funcionario f;
        if(matricula.isEmpty()){
            return null;
        }
        else{
            f = daoFuncionario.pesquisarFuncionarioDao(matricula);
            return f;   
        }
    }
    
    public boolean removerFuncionarioController(String matricula){
        if(matricula.isEmpty() || matricula == null){
            return false;
        }
        else{
            return daoFuncionario.removerFuncioanrioDao(matricula);
        }
    }
    
    public boolean alterarDadosController(Funcionario f){
        if(f != null){
            return daoFuncionario.salvarAlteracaoDao(f);
        }
        else{
            return false;
        }
    }
}
