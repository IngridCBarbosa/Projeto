/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcacaoautoescola.factory.Iterator;

import java.util.ArrayList;
import marcacaoaulaautoescola.model.Aluno;

/**
 *
 * @author Ingrid
 */
public class IteratorAluno implements AlunoIterator<Aluno> {

    private ArrayList<Aluno> c = new ArrayList();
    private int cont = 0;
    private int qtd = 0;

    public void adiciona(Aluno a) {
        c.add(a);
        qtd++;
    }

    @Override
    public boolean hasNext() {
        if (cont >= c.size() || c.get(cont) == null) {
            cont = 0;
            return false;
        } else {
            return true;
        }

    }

    @Override
    public Aluno next() {
        Aluno a = c.get(cont);
        cont++;
        return a;
    }

}
