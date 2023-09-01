import java.util.Scanner;
import java.util.ArrayList;
public class App {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        opcao();
    }

    public static void menu () {
        String mensagem = """
                ---------- [ MENU ] ----------

                1. Cadastrar colecionável;
                2. Pesquisar item por identificação;
                3. Pesquisar item por tipo;
                4. Mostrar lista por tipo;
                5. Sair.
                """;
        System.out.println(mensagem);
    }

    public static void tipos () {
        String mensagem = """
                ---------- [ ESCOLHA O TIPO DE COLECIONÁVEL ] ----------

                1. Livros;
                2. CD's;
                3. DVD's;
                4. Revistas;
                5. Cancelar.
                """;
        System.out.println(mensagem);
    }

    public static void opcao () {
        int opc = 0;

        do {
            menu();
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    escolheColecionavel();
                    break;
                case 2:
                    pesquisaIdentificacao();
                    break;
                case 3:
                    pesquisaTipo();
                    break;
                case 4:
                    listaTipo();
                    break;
                case 5:
                    System.out.println("\nSaindo do Gerenciador!");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        }
        while (opc != 5);
    }

    public static void escolheColecionavel() {
        int opc = 0;

        do {
            tipos();
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    cadastraLivro();
                    break;
                case 2:
                    cadastraDvd();
                    break;
                case 3:
                    cadastraCd();
                    break;
                case 4:
                    cadastraRevista();
                    break;
                case 5:
                    System.out.println("\nVoltando ao menu principal.");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
            }
        }
        while (opc != 5);
    }

    public static void dadosComuns() {
        Sting nome, autor, data;
        int identificação;

        System.out.println("---------- [ CADASTRO GERAL ] ----------");

        System.out.print("Informe o nome do item: ");
        nome = in.next();

        System.out.print("Informe o nome do autor do item: ");
        autor = in.next();

        System.out.print("Informe a data de aquisição do item: ");
        data = in.next();

        System.out.print("Informe a identificação do item: ");
        identificação = in.nextInt();


    }
}