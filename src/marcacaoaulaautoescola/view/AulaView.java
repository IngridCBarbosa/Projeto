package marcacaoaulaautoescola.view;


import java.util.Date;
import java.util.Scanner;
import java.text.*;
import marcacaoaulaautoescola.controller.AlunoController;
import marcacaoaulaautoescola.controller.AulaController;
import marcacaoaulaautoescola.controller.ProfessorController;
import marcacaoaulaautoescola.model.Aluno;
import marcacaoaulaautoescola.model.Aula;
import marcacaoaulaautoescola.model.Professor;


public class AulaView {
    private AulaController controllerAula = new AulaController();
    private ProfessorController controllerProf = new ProfessorController();
    private AlunoController controllerAluno = new AlunoController() ;
    
    public void cadastrarAula(){
        Scanner enter = new Scanner (System.in);
        SimpleDateFormat formato = new SimpleDateFormat("dd,MM,YYYY");
        String data,hora;
        Professor professor;
        Aluno aluno;
        Aula aula;
        String mensagem;
        boolean marcou;
        String matriculaProf,matriculaAluno;
        System.out.println("Mátricula do Professor:");
        matriculaProf = enter.nextLine();
        professor = controllerProf.consultaProfessor(matriculaProf);
        System.out.println("Matrícula do aluno: ");
        matriculaAluno = enter.nextLine();
        aluno = controllerAluno.consultaAluno(matriculaAluno);
        if(aluno != null && professor != null){
            System.out.println("Data: ");
            data = enter.nextLine();
            System.out.println("Hora: ");
            hora = enter.nextLine();
            aula = new Aula(data,hora);
            aula.setAluno(aluno);
            aula.setProfessor(professor);
            mensagem = controllerAula.inserir(aula);
            System.out.println(mensagem);
            
        }else{
            System.out.println("Cadastro de aula não válida");
        }
        
    }
    public void removerCadastroAulaView(){
        Scanner enter = new Scanner (System.in);
        String matriculaAluno;
        boolean removeu;
        System.out.println("Matricula aluno: ");
        matriculaAluno = enter.nextLine();
        removeu = controllerAula.removerAulaController(matriculaAluno);
        if(removeu == true){
            System.out.println("Aula removida com sucesso!");
        }
        else{
            System.out.println("Erro ao tentar remover aula");
        }
    }
    public void consultarCadastroAulaView(){
        Scanner enter = new Scanner (System.in);
        String matriculaAl;
        Aula aula;
        System.out.println("Matricula aluno: ");
        matriculaAl = enter.nextLine();
        aula =controllerAula.consultarAula(matriculaAl);
        if(aula != null){
            System.out.println(aula);
        }else{
            System.out.println("Aula não foi marcada");
        }
    }
    public void alterarCadastroAulaView(){
        Scanner enter = new Scanner (System.in);
        String data,hora,matricula;
        Professor professor;
        Aluno aluno;
        Aula aula;
        boolean alterado;
        System.out.println("Matricula aluno: ");
        matricula = enter.nextLine();
        aula = controllerAula.consultarAula(matricula);
        if(aula != null){
            System.out.println("Matricula professor: ");
            matricula = enter.nextLine();
            professor = controllerProf.consultaProfessor(matricula);
            if(professor != null){
                System.out.println("Data: ");
                data = enter.nextLine();
                System.out.println("Hora: ");
                hora = enter.nextLine();
                aula = new Aula(hora, data);
                aula.setProfessor(professor);
                alterado = controllerAula.alterarDadosAulaController(aula);
                if(alterado == true){
                    System.out.println("Alterado com sucesso!");
                }
            }
            else{
                System.out.println("Professor não cadastrado no sistema");
            }
        }
        else{
            System.out.println("Aluno não tem aula cadastrada no sistema");
        }
    }
}
