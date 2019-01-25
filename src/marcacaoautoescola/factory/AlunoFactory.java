
package marcacaoautoescola.factory;


import marcacaoaulaautoescola.dao.AlunoDao;



public class AlunoFactory {
    
   
    
    public static AlunoDao create(int tipoAlunoDao){
       
     
        switch(tipoAlunoDao){
            case 0:
                return AlunoDao.getInstance();
            case 1:
                throw new UnsupportedOperationException();
            default: return null;
        }
        
    }
}
