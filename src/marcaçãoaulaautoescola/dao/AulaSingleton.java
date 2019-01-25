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
public class AulaSingleton {
    private static AulaDao dao;
    
    private AulaSingleton(){}
    
    public static AulaDao getInstance(){
        if(dao == null){
            dao = new AulaDao();
        }
        return dao;
    }
}
