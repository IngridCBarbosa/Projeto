/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcacaoautoescola.factory;

import marcacaoaulaautoescola.dao.ProfessorDao;


/**
 *
 * @author Ingrid
 */
public class ProfessorFactory {
    
   
    public static ProfessorDao create(int tipoProfessorDao){
        
        
        switch(tipoProfessorDao){
            
            case 0:
                return ProfessorDao.getInstance();
            case 1:
                throw new UnsupportedOperationException();
            default: return null;
        }
    }
}
