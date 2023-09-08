import java.util.List;

public class Livros extends Produto{
    private String nomeEditora;
    private int anoPublicacao;

    public Livros (int identificacao, String nome, String dataAquisicao, List<String> autores, String nomeEditora, int anoPublicacao){
        super(identificacao, nome, dataAquisicao, autores);
        this.nomeEditora = nomeEditora;
        this.anoPublicacao = anoPublicacao;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
