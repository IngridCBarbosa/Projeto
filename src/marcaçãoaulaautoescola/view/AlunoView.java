
package marcaçãoaulaautoescola.view;

import java.util.Scanner;
import marcacaoautoescola.factory.Iterator.IteratorAluno;

import marcaçãoaulaautoescola.controller.AlunoController;
import marcaçãoaulaautoescola.model.Aluno;
import marcaçãoaulaautoescola.model.Endereco;


public class AlunoView {
    
    private AlunoController controlerAluno = new AlunoController();
    private IteratorAluno itarato;
    
    public void cadastrarAlunoView(){
        Scanner enter = new Scanner(System.in);
        String tipoCarteira;
        String matricula,nome,email,cpf,cep,complemento,fone;
        Aluno a;
        int idade;
        String mensagem;
        Endereco endereco;
        System.out.println("Matricula: ");
        matricula = enter.nextLine();
        System.out.println("Tipo de carteira:");
        tipoCarteira = enter.nextLine();
        System.out.println("Nome: ");
        nome = enter.nextLine();
        System.out.println("Email: ");
        email = enter.nextLine();
        System.out.println("CPF:");
        cpf = enter.nextLine();
        System.out.println("Idade: ");
        idade = enter.nextInt();
        enter.nextLine();
        System.out.println("CEP: ");
        cep = enter.nextLine();
        System.out.println("Complemento:");
        complemento = enter.nextLine();
        System.out.println("Fone: ");
        fone = enter.nextLine();
        endereco = new Endereco(cep,complemento);
        a = new Aluno(tipoCarteira,matricula,nome, email,idade, fone, endereco);
        a.setTipoCarteira(tipoCarteira);
        mensagem = controlerAluno.inserir(a);
        System.out.println(mensagem);
    }
    public void removerAlunoView(){
        Scanner enter = new Scanner(System.in);
        boolean verifica;
        String matricula;
        System.out.println("Matricula:");
        matricula = enter.nextLine();
        verifica = controlerAluno.removerAlunoController(matricula);
        if(verifica == true){
            System.out.println("Cadastro removido com sucesso");
        }
        else{
            System.out.println("Erro ao tentar remover Cadastro");
        }
    }
    public void consultaAlunoView(){
        Scanner enter = new Scanner(System.in);
        String matricula;
        Aluno a;
        System.out.println("Matricula: ");
        matricula = enter.nextLine();
        a = controlerAluno.consultaAluno(matricula);
        if(a != null){
            System.out.println("Aluno \nMatricula: "+a.getMatricula()+",Tipo de Carteira: "+a.getTipoCarteira());
            System.out.println(a);
        }else{
            System.out.println("Aluno não cadastrado no sistema");
        }
    }
    public void alterarDadosAlunoView(){
        Scanner enter = new Scanner(System.in);
        String nome, tipodeCateira,cpf,fone,email,complemento,cep,matricula;
        int idade;
        Aluno a;
        Endereco e;
        boolean alterado;
        
        System.out.println("Matricula: ");
        matricula = enter.nextLine();
        a = controlerAluno.consultaAluno(matricula);
        if(a != null){
            System.out.println("Tipo de carteira:");
            tipodeCateira = enter.nextLine();
            System.out.println("Nome: ");
            nome = enter.nextLine();
            System.out.println("CPF:");
            cpf = enter.nextLine();
            System.out.println("Idade: ");
            idade = enter.nextInt();
            enter.nextLine();
            System.out.println("Email:");
            email = enter.nextLine();
            System.out.println("fone: ");
            fone= enter.nextLine();
            System.out.println("CEP: ");
            cep = enter.nextLine();
            System.out.println("Complemento:");
            complemento = enter.nextLine();
            e = new Endereco(cep, complemento);
            a = new Aluno(tipodeCateira,matricula, nome, email,idade, fone, e);
            a.setMatricula(matricula);
            alterado = controlerAluno.alterarDadosAlunoController(a);
            if(alterado == true){
                System.out.println("Dados Alterado com sucesso");
            }
            else{
                System.out.println("Erro ao tentar alterar dados");
            }
        }
        else{
            System.out.println("Aluno não cadastrado no sistema");
        }
    }
    
    public void listarAlunosView(){
        IteratorAluno itarator;
       /* while(itarator.hasNext()){
            
        }*/
    }
}
