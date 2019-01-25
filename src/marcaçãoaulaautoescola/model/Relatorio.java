
package marcaçãoaulaautoescola.model;


public class Relatorio {
  private Aula aula;
  private Professor professor;
  private Aluno aluno;

    public Relatorio(Aula aula, Professor professor, Aluno aluno) {
        this.aula = aula;
        this.professor = professor;
        this.aluno = aluno;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Relatorio{" + "aula=" + aula + ", professor=" + professor + ", aluno=" + aluno + '}';
    }
  
  
}
