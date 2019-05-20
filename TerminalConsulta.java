import java.util.Scanner;

public class TerminalConsulta {
    private CadastroFuncionarios cadastro;

    public TerminalConsulta() {
        cadastro = new CadastroFuncionarios();
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Entre a matricula do funcionario (0 = fim): ");
            String matricula = s.nextLine();
            if (matricula.equals("0")){
                break; // Quebra o while
            }
            Funcionario func = cadastro.recuperaPorMatricula(matricula);
            System.out.println("----------");
            if (func == null) {
                System.out.println("Funcionario nao encontrado !!");
            }else{
                System.out.println("Categoria: "+func.getClass().getName());
                System.out.println("Matricula: "+func.getMatricula());
                System.out.println("Nome: "+func.getNome());
                System.out.println("Salario bruto: "+func.getSalarioBruto());
                System.out.println("(-) INSS: "+func.getINSS());
                System.out.println("(-) IR: "+func.getImpRenda());
                System.out.println("Salario liquido: "+func.getSalarioLiquido());
                System.out.println("----------");
            }
            System.out.println("Digite qualquer tecla para continuar.\n");
            s.nextLine();
        }
        s.close();
    }
}