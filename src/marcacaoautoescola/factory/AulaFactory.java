/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcacaoautoescola.factory;

import marcacaoaulaautoescola.dao.AulaDao;


/**
 *
 * @author Ingrid
 */
public class AulaFactory {
   
    public static AulaDao create(int tipoAulaDao){
     
        
        switch(tipoAulaDao){
            case 0:
                return AulaDao.getInstance();
        
            case 1:
                throw new UnsupportedOperationException();
        
            default: return null;
        }
    }
}
