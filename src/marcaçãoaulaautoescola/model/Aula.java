
package marcaçãoaulaautoescola.model;




public class Aula {
    private Aluno aluno;
    private String hora;
    private String data;
    private Professor professor;

    public Aula(String hora, String data) {
        
        this.hora = hora;
        this.data = data;
        
    }

   

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Aula\n" + "aluno=" + aluno + ", hora=" + hora + ", data=" + data + ", professor=" + professor ;
    }
    
}
