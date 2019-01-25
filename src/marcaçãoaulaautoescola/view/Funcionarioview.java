package marcaçãoaulaautoescola.view;

import marcaçãoaulaautoescola.model.Funcionario;
import java.util.Scanner;
import marcaçãoaulaautoescola.controller.FuncionarioController;
import marcaçãoaulaautoescola.model.Endereco;

public class Funcionarioview {
    private FuncionarioController controlFuncionario = new FuncionarioController();
    
    public void cadastroFuncionarioView(){
        Scanner enter = new Scanner(System.in);
        Funcionario funcionario;
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
        funcionario = new Funcionario(fone, matricula, nome, email, idade, fone, endereco);
        String mensagem = controlFuncionario.inserirFuncionarioController(funcionario);
        System.out.println(mensagem);
    }
    public void alteraDadosFuncionarioView(){
        Scanner enter = new Scanner(System.in);
        Funcionario f;
        Endereco endereco;
        String nome,matricula,cep,complemento,cpf,email,fone;
        boolean valida;
        int idade;
        System.out.println("matricula:");
        matricula = enter.nextLine();
        f = controlFuncionario.consultaFuncionarioController(matricula);
        
        if(f != null){
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
            f = new Funcionario(fone, matricula, nome, email, idade, fone, endereco);
            
            valida = controlFuncionario.alterarDadosController(f);
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
    public void removerFuncionarioView(){
        Scanner enter = new Scanner(System.in);
        boolean verifica;
        String matricula;
        System.out.println("Matricula:");
        matricula = enter.nextLine();
        verifica = controlFuncionario.removerFuncionarioController(matricula);
        if(verifica == true){
            System.out.println("Cadastro removido com sucesso");
        }
        else{
            System.out.println("Erro ao tentar remover Cadastro");
        }
    }
    
    public void consultaFuncionarioView(){
        Scanner enter = new Scanner(System.in);
        String matricula;
        Funcionario f;
        System.out.println("Matricula: ");
        matricula = enter.nextLine();
        f = controlFuncionario.consultaFuncionarioController(matricula);
        if(f != null){
            System.out.println("Professor \nMatricula: "+f.getMatricula());
            System.out.println(f);
        }else{
            System.out.println("Professor não cadastrado no sistema");
        }
    }
}
