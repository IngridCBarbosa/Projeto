
package marcaçãoaulaautoescola.dao;

import java.util.ArrayList;
import marcaçãoaulaautoescola.model.Aula;


public class AulaDao implements AulaBridge{
    
    private  ArrayList<Aula> listaAula =  new ArrayList();
    private static AulaDao dao;
    
    public  AulaDao(){}
    
    public static AulaDao getInstance(){
        if(dao == null){
            dao = new AulaDao();
        }
        return dao;
    }
     
    @Override
    public String cadastrarAulaDao(Aula a){
                
        if(verificaAula(a.getAluno().getMatricula()) == false){
        
            listaAula.add(a);
        
            return "Salvo com sucesso";
        }else{
            return "Erro ao Salvar";
        }          
    }
      
    @Override
    public boolean verificaAula(String matricula){
        
        for(int i=0;i< listaAula.size();i++){
           
            if(listaAula.get(i).getAluno().getMatricula() == matricula || listaAula.get(i).getAluno().getMatricula().equals( matricula)){
                return true;
            }
            
        }
        return false;
    }  
    
    @Override
    public Aula pesquisarAulaDao(String matricula){ //retorna o objeto
        for(int i = 0; i < listaAula.size();i++){
            if(matricula.equals(listaAula.get(i).getAluno().getMatricula()) == true){
                return listaAula.get(i);
            }
        }
        return null;
    }
    
    private int pesquisaPosicaoAulaDao(String matricula){ // retorna a posição no arrayList
        int cont = -1;
        for(int i = 0; i < listaAula.size();i++){
            if(matricula.equals(listaAula.get(i).getAluno().getMatricula())){
                cont = i;
                break;
            }
        }
        return cont;
    }
    
    @Override
    public boolean salvarAlteracaoDao(Aula aula){ //
        int posicao;
        posicao = pesquisaPosicaoAulaDao(aula.getAluno().getMatricula());
        if(posicao >= 0){
            listaAula.get(posicao).setHora(aula.getHora());
            listaAula.get(posicao).setData(aula.getData());
            listaAula.get(posicao).setProfessor(aula.getProfessor());
            listaAula.get(posicao).setAluno(aula.getAluno());
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public boolean removerAulaDao(String matricula){
        Aula aula;
        aula = pesquisarAulaDao(matricula);
        if(aula != null){
            
            listaAula.remove(aula);
            return true;
            
        }
        else{
            return false;
        }
    }
}
