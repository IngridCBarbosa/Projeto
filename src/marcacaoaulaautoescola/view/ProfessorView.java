
package marcacaoaulaautoescola.view;

import marcacaoaulaautoescola.model.Endereco;
import marcacaoaulaautoescola.model.Professor;
import java.util.Scanner;
import marcacaoaulaautoescola.controller.ProfessorController;
import marcacaoaulaautoescola.model.Pessoa;

public class ProfessorView {
    private ProfessorController control = new ProfessorController();
    
    public void cadastrarProfessorView(){
        Scanner enter = new Scanner(System.in);
        Professor p;
        Endereco endereco;
        String nome,matricula,cep,complemento,cpf,email,fone;
        int idade;
        
        System.out.println("Matricula: ");
        matricula = enter.nextLine();
        System.out.println("Nome: ");
        nome = enter.nextLine();
        System.out.println("Email: ");
        email = enter.nextLine();
        System.out.println("CPF:");
        cpf = enter.nextLine();
        System.out.println("Idade:");
        idade = enter.nextInt();
        enter.nextLine();
        System.out.println("CEP: ");
        cep = enter.nextLine();
        System.out.println("Complemento:");
        complemento = enter.nextLine();
        System.out.println("Fone: ");
        fone = enter.nextLine();
        endereco = new Endereco(cep,complemento);
        p = new Professor(matricula, nome, email, idade, fone, endereco);
        String mensagem = control.inserir(p);
        System.out.println(mensagem);
    }
    public void consultaProfessorView(){
        Scanner enter = new Scanner(System.in);
        String matricula;
        Professor p;
        System.out.println("Matricula: ");
        matricula = enter.nextLine();
        p = control.consultaProfessor(matricula);
        if(p != null){
            System.out.println("Professor \nMatricula: "+p.getMatricula());
            System.out.println(p);
        }else{
            System.out.println("Professor não cadastrado no sistema");
        }
    }
    public void removerProfessorView(){
        Scanner enter = new Scanner(System.in);
        boolean verifica;
        String matricula;
        System.out.println("Matricula:");
        matricula = enter.nextLine();
        verifica = control.removerProfessorController(matricula);
        if(verifica == true){
            System.out.println("Cadastro removido com sucesso");
        }
        else{
            System.out.println("Erro ao tentar remover Cadastro");
        }
    }
    public void alterarDadosProfessorView(){
        Scanner enter = new Scanner(System.in);
        Professor p;
        Endereco endereco;
        String nome,matricula,cep,complemento,cpf,email,fone;
        boolean valida;
        int idade;
        System.out.println("matricula:");
        matricula = enter.nextLine();
        p = control.consultaProfessor(matricula);
        
        if(p != null){
            System.out.println("Nome:");
            nome = enter.nextLine();
            System.out.println("Email:");
            email = enter.nextLine();
            System.out.println("CPF: ");
            cpf = enter.nextLine();
            System.out.println("Idade:");
            idade = enter.nextInt();
            enter.nextLine();
            System.out.println("Fone: ");
            fone = enter.nextLine();
            System.out.println("CEP:");
            cep = enter.nextLine();
            System.out.println("Complemento: ");
            complemento = enter.nextLine();
            endereco = new Endereco(cep, complemento);
            p = new Professor(matricula, nome, email, idade, fone, endereco);
            
            valida = control.alterarDadosController(p);
            if(valida == true){
                System.out.println("Dados alterados com sucesso");
            }
            else{
                System.out.println("Erro ao tentar alterar Dados");
            }
        }
        else{
            System.out.println("Professor não cadastrado no sistema");
        }
    }
}
