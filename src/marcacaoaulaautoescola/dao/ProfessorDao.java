package marcacaoaulaautoescola.dao;

import java.util.ArrayList;

import marcacaoaulaautoescola.model.Professor;


public class ProfessorDao implements ProfessorBridge{
    
    private ArrayList<Professor> lista= new ArrayList();
    private static ProfessorDao dao;
    
    private ProfessorDao(){}
    
    public static ProfessorDao getInstance(){
        if(dao == null){
            dao  = new ProfessorDao();
        }
        return dao;
    }
    
   
    
    @Override
    public String inserirProfessor(Professor p){
                
        if(verificaProfessor(p.getMatricula()) == false){
        
            lista.add(p);
        
            return "Professor cadastrado com sucesso";
        }else{
            return "Erro ao cadastrar";
        }        
    }
    
    @Override
    public boolean verificaProfessor(String matricula){
        
        for(int i=0;i< lista.size();i++){
           
            if(lista.get(i).getMatricula() == matricula || lista.get(i).getMatricula().equals( matricula)){
                return true;
            }
            
        }
        return false;
    }
    
    @Override
    public Professor pesquisarProfessorDao(String matricula){ // retorna o objeto
        for(int i = 0; i < lista.size();i++){
            if(matricula.equals(lista.get(i).getMatricula()) == true){
                return lista.get(i);
            }
        }
        return null;
    }
    private int pesquisaPosicaoProfessorDao(String matricula){ //retorna a posicao no arrayList
        int cont = -1;
        for(int i = 0; i < lista.size();i++){
            if(matricula.equals(lista.get(i).getMatricula())){
                cont = i;
                break;
            }
        }
        return cont;
    }
    @Override
    public boolean salvarAlteracaoDao(Professor p){ //
        int posicao = pesquisaPosicaoProfessorDao(p.getMatricula());
        lista.get(posicao).setEmail(p.getEmail());
        lista.get(posicao).setEndereco(p.getEndereco());
        lista.get(posicao).setFone(p.getFone());
        lista.get(posicao).setNome(p.getNome());
        return true;
    }
    @Override
    public boolean removerProfessorDao(String matricula){
        Professor p;
        p = pesquisarProfessorDao(matricula);
        if(p != null){
            lista.remove(p);
            return true;
        }
        else{
            return false;
        }
    }
}
