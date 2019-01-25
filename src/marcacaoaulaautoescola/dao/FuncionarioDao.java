
package marcacaoaulaautoescola.dao;

import java.util.ArrayList;
import marcacaoaulaautoescola.model.Funcionario;




public class FuncionarioDao implements FuncionarioBridge {
    
    private  ArrayList<Funcionario> funcionario = new ArrayList();
    private static FuncionarioDao dao;
    
    private FuncionarioDao(){}
    
    public static FuncionarioDao getInstance(){
        if(dao == null){
            dao = new FuncionarioDao();
        }
        return dao;
    }
    
    @Override
    public String inserirFuncionarioDao( Funcionario f){
                
        if(verificaFuncionario(f.getMatricula()) == false){
        
            funcionario.add(f);
        
            return "Salvo com sucesso";
        }else{
            return "Erro ao Salvar";
        }        
    }
    
    @Override
    public boolean verificaFuncionario(String matricula){
        
        for(int i=0;i< funcionario.size();i++){
            if(funcionario.get(i).getMatricula() == matricula || funcionario.get(i).getMatricula().equals( matricula)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public Funcionario pesquisarFuncionarioDao(String matricula){ // retorna o objeto
        for(int i = 0; i < funcionario.size();i++){
            if(matricula.equals(funcionario.get(i).getMatricula()) == true){
                return funcionario.get(i);
            }
        }
        return null;
    }
    
    private int pesquisaPosicaoFuncionarioDao(String matricula){ //retorna a posicao no arrayList
        int cont = -1;
        for(int i = 0; i < funcionario.size();i++){
            if(matricula.equals(funcionario.get(i).getMatricula())){
                cont = i;
                break;
            }
        }
        return cont;
    }
    
    @Override
    public boolean salvarAlteracaoDao(Funcionario f){
        
        int posicao = pesquisaPosicaoFuncionarioDao(f.getMatricula());
        funcionario.get(posicao).setEmail(f.getEmail());
        funcionario.get(posicao).setEndereco(f.getEndereco());
        funcionario.get(posicao).setFone(f.getFone());
        funcionario.get(posicao).setNome(f.getNome());
        return true;
    }
    
    @Override
    public boolean removerFuncioanrioDao(String matricula){
        Funcionario f;
        f = pesquisarFuncionarioDao(matricula);
        if(f != null){
            funcionario.remove(f);
            return true;
        }
        else{
            return false;
        }
    }

 
 
}
