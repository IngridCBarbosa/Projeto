
package marcaçãoaulaautoescola.dao;

import java.util.ArrayList;
import marcaçãoaulaautoescola.model.Aluno;


public class AlunoDao implements AlunoBridge {
    
    private  ArrayList<Aluno> listaAluno = new ArrayList();;
    private static AlunoDao dao;
   
    
    private  AlunoDao(){
    
    }
    
    public static AlunoDao getInstance(){
        
        if(dao == null){
           dao = new AlunoDao();
        }
        return dao;
    }
    
    @Override
    public String cadastrarAlunoDao(Aluno p){
                
        if(verificaAluno(p.getMatricula()) == false){
        
            listaAluno.add(p);
        
            return "Salvo com sucesso";
        }else{
            return "Erro ao Salvar";
        }          
    }
    
    @Override
    public boolean verificaAluno(String matricula){
        
        for(int i=0;i< listaAluno.size();i++){
           
            if(listaAluno.get(i).getMatricula() == matricula || listaAluno.get(i).getMatricula().equals( matricula)){
                return true;
            }
            
        }
        return false;
    }
    
    @Override
    public Aluno pesquisarAlunoDao(String matricula){ //retorna o objeto
        for(int i = 0; i < listaAluno.size();i++){
            if(matricula.equals(listaAluno.get(i).getMatricula()) == true){
                return listaAluno.get(i);
            }
        }
        return null;
    }
    private int pesquisaPosicaoAlunoDao(String matricula){ // retorna a posição no arrayList
        int cont = -1;
        for(int i = 0; i < listaAluno.size();i++){
            if(matricula.equals(listaAluno.get(i).getMatricula())){
                cont = i;
                break;
            }
        }
        return cont;
    }
    @Override
    public boolean salvarAlteracaoDao(Aluno a){ //
        int posicao;
        posicao = pesquisaPosicaoAlunoDao(a.getMatricula());
        if(posicao >= 0){
            listaAluno.get(posicao).setEmail(a.getEmail());
            listaAluno.get(posicao).setEndereco(a.getEndereco());
            listaAluno.get(posicao).setFone(a.getFone());
            listaAluno.get(posicao).setTipoCarteira(a.getTipoCarteira());
            listaAluno.get(posicao).setNome(a.getNome());
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean removerAlunoDao(String matricula){
        Aluno p;
        p = pesquisarAlunoDao(matricula);
        if(p != null){
            
            listaAluno.remove(p);
            return true;
            
        }
        else{
            return false;
        }
    }
   

    @Override
    public ArrayList<Aluno> listaAlunoDao() {
         if(listaAluno.isEmpty() == false){
            return listaAluno;
        }
        else{
            return null;
        }
    }
}
