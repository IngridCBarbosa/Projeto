/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcacaoautoescola.factory;


import marcacaoaulaautoescola.dao.FuncionarioDao;



public class FuncionarioFactory {
    
  
    
    public static FuncionarioDao create(int tipoFuncionarioDao){
        
        switch(tipoFuncionarioDao){
            case 0:
                return FuncionarioDao.getInstance();
            case 1:
                throw new UnsupportedOperationException();
            default: return null;
        }
    }
}
