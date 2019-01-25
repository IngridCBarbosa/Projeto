
package marcaçãoaulaautoescola.dao;

/**
 *
 * @author Ingrid
 */
public class ProfessorSingleton {
    
    private static ProfessorDao dao;
    
    private ProfessorSingleton(){}
     
    public static ProfessorDao getInstance(){
        if(dao == null){
            dao = new ProfessorDao();
        }
        return dao;
    }
}
