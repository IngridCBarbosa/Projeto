/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcaçãoaulaautoescola.dao;

/**
 *
 * @author Ingrid
 */
public class FuncionarioSingleton {
    
    private static FuncionarioDao dao;
    
    private FuncionarioSingleton(){}
    
    public static FuncionarioDao getInstance(){
        
        if(dao == null){
            dao = new FuncionarioDao();
        }
        return dao;
    }
}
