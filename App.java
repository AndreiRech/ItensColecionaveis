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
                    dados();
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
        int i = 0;

        do {
            tipos();
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    i = 1;
                    dados(i);
                    break;
                case 2:
                    i = 2;
                    dados(i);
                    break;
                case 3:
                    i = 3;
                    dados(i);
                    break;
                case 4:
                    i = 4;
                    dados(i);
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

    public static void dados(int i) {
        String nome, autor, data;
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

        switch (i) {
            case 1:
                String editoraL;
                int anoPublicacaoL;

                System.out.println("---------- [ CADASTRO LIVRO ] ----------");

                System.out.print("Informe o nome da editora: ");
                editoraL = in.next();

                System.out.print("Informe o ano de publicação: ");
                anoPublicacaoL = in.nextInt();

                //ADICIONE AQUI O METÓDO PARA CRIAR O LIVRO

                break;
            case 2:
                ArrayList <String> musicas = new ArrayList<>();
                String genero, musica;
                int continua = 1;

                System.out.println("---------- [ CADASTRO CD's ] ----------");

                System.out.print("Informe o gênero do CD: ");
                genero = in.next();

                do {
                    System.out.print("Informe o nome das músicas: ");
                    musica = in.next();
                    musicas.add(musica);

                    System.out.print("Deseja continua? [1 = SIM | 2 = NÃO]");
                    continua = in.nextInt();
                }
                while (continua == 1);

                //ADICIONE AQUI O METÓDO PARA CRIAR O CD
                
                break;
            case 3:
                String tipo, descricao;

                System.out.println("---------- [ CADASTRO DVD's ] ----------");

                System.out.print("Informe o tipo do DVD [MUSICAL - FILME - DADOS]: ");
                tipo = in.next();

                System.out.print("Informe a descrição do mesmo: ");
                descricao = in.next();

                //ADICIONE AQUI O METÓDO PARA CRIAR O DVD

                break;
            case 4:
                String editoraR, assunto;
                int anoPublicacaoR, volume;

                System.out.println("---------- [ CADASTRO REVISTAS ] ----------");

                System.out.print("Informe o nome da editora: ");
                editoraR = in.next();

                System.out.print("Informe o assunto do mesmo: ");
                assunto = in.next();

                System.out.print("Informe o ano de publicação: ");
                anoPublicacaoR = in.nextInt();

                System.out.print("Informe o número de volume: ");
                volume = in.nextInt();

                //ADICIONE AQUI O METÓDO PARA CRIAR A REVISTA

                break;
        }
    }
}