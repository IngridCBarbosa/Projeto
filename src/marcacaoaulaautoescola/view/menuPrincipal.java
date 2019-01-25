
package marcacaoaulaautoescola.view;

import java.util.Scanner;


public class menuPrincipal {
    private final ProfessorView viewProfessor = new ProfessorView();
    private final Funcionarioview viewFuncionario = new Funcionarioview();
    private final AlunoView viewAluno = new AlunoView();
    private final AulaView viewAula = new AulaView();
    public void menuPrincipal(){
        Scanner enter = new Scanner (System.in);
        int opc;
        do{
            System.out.println("1-Aluno");
            System.out.println("2-Funcionario");
            System.out.println("3-Professor");
            System.out.println("4-Aula");
            System.out.println("5-Sair do sistema");
            System.out.println("Opção:");
            opc = enter.nextInt();
            switch(opc){
                case 1:
                    menuAluno();
                    break;
                case 2:
                    menuFuncionario();
                    break;
                case 3:
                    menuProfessor();
                    break;
                case 4:
                    menuAula();
                    break;
                case 5:
                    break;
                default:System.err.println("Opção inválida.Digite novamente");
            }
        }while(opc != 5);
    }
    private void menuAluno(){
        Scanner enter = new Scanner (System.in);
        int opc;
        do{
            System.out.println("Aluno");
            System.out.println("1-Cadastrar");
            System.out.println("2-Remover");
            System.out.println("3-Alterar dados");
            System.out.println("4-Consultar");
            System.out.println("5-Listar Alunos");
            System.out.println("6-Sair do menu de aluno");
            opc = enter.nextInt();
            switch(opc){
                case 1:
                    viewAluno.cadastrarAlunoView();
                    break;
                case 2:
                    viewAluno.removerAlunoView();
                    break;
                case 3:
                    viewAluno.alterarDadosAlunoView();
                    break;
                case 4:
                    viewAluno.consultaAlunoView();
                    break;
                case 5:
                    viewAluno.listarAlunosView();
                    break;
                case 6:
                    break;
                default:System.err.println("Opção inválida.Digite novamente:");
            }
        }while( opc != 6);
    }
    private void menuProfessor(){
        Scanner enter = new Scanner (System.in);
        int opc;
        do{
            System.out.println("Professor");
            System.out.println("1-Cadastrar");
            System.out.println("2-Remover");
            System.out.println("3-Alterar dados");
            System.out.println("4-Consultar");
            System.out.println("5-Sair do menu de Professor");
            opc = enter.nextInt();
            switch(opc){
                case 1:
                    viewProfessor.cadastrarProfessorView();
                    break;
                case 2:
                    viewProfessor.removerProfessorView();
                    break;
                case 3:
                    viewProfessor.alterarDadosProfessorView();
                    break;
                case 4:
                    viewProfessor.consultaProfessorView();
                    break;
                case 5:
                    break;
                default:System.err.println("Opção inválida.Digite novamente:");
            }
        }while( opc != 6);
    }
    private void menuFuncionario(){
        Scanner enter = new Scanner (System.in);
        int opc;
        do{
            System.out.println("Funcionario");
            System.out.println("1-Cadastrar");
            System.out.println("2-Remover");
            System.out.println("3-Alterar dados");
            System.out.println("4-Consultar");
            System.out.println("5-Sair do menu de Funcionario");
            opc = enter.nextInt();
            switch(opc){
                case 1:
                    viewFuncionario.cadastroFuncionarioView();
                    break;
                case 2:
                    viewFuncionario.removerFuncionarioView();
                    break;
                case 3:
                    viewFuncionario.alteraDadosFuncionarioView();
                    break;
                case 4:
                    viewFuncionario.consultaFuncionarioView();
                    break;
                case 5:
                    break;
                default:System.err.println("Opção inválida.Digite novamente:");
            }
        }while( opc != 5);
    }
    private void menuAula(){
        Scanner enter = new Scanner (System.in);
        int opc;
        do{
            System.out.println("Aula");
            System.out.println("1-Cadastrar");
            System.out.println("2-Remover");
            System.out.println("3-Alterar dados");
            System.out.println("4-Consultar");
            System.out.println("5-Sair do menu de Aula");
            opc = enter.nextInt();
            switch(opc){
                case 1:
                    viewAula.cadastrarAula();
                    break;
                case 2:
                    viewAula.removerCadastroAulaView();
                    break;
                case 3:
                    break;
                case 4:
                    viewAula.consultarCadastroAulaView();
                    break;
                case 5:
                    break;
                default:System.err.println("Opção inválida.Digite novamente:");
            }
        }while(opc != 5);
    }
}
