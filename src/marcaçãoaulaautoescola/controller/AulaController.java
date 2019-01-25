
package marcaçãoaulaautoescola.controller;


import marcacaoautoescola.factory.AulaFactory;
import marcaçãoaulaautoescola.dao.AulaBridge;
import marcaçãoaulaautoescola.model.Aula;


public class AulaController {
    private AulaBridge daoAula ;
    
   public AulaController(){
        if(daoAula == null){
            daoAula = AulaFactory.create(0);
        }
    }
   
    public String inserir(Aula a){
        
        if(validaAula(a) == "ok"){
            return daoAula.cadastrarAulaDao(a);
        }
        return validaAula(a);
    }
    
    private String validaAula(Aula a){
        String menssagem;
        if(a.getAluno().getMatricula().isEmpty()|| a.getProfessor().getMatricula().isEmpty()){
            return "matricula inválida";
        }
        return menssagem = "ok";
    }
    
    public boolean removerAulaController(String matricula){
        if(matricula.isEmpty() || matricula == null){
            return false;
        }
        else{
            return daoAula.removerAulaDao(matricula);
        }
    }
    
    public boolean alterarDadosAulaController(Aula a){
        if(a != null){
            return daoAula.salvarAlteracaoDao(a);
        }
        else{
            return false;
        }
    }
    
    public Aula consultarAula(String matricula){
        Aula a;
        if(matricula.isEmpty()){
            return null;
        }
        else{
            a = daoAula.pesquisarAulaDao(matricula);
            return a;   
        }
    }
}
