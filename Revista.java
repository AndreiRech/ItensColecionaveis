import java.util.List;

public class Revista extends Produto {
    private int anoPublicacao;
    private int volume;
    private String editora;
    private String itemEspecificoDoAssunto;

    public Revista(int identificacao, String nome, String dataAquisicao, List<String> autores, int anoPublicacao, int volume, String editora, String itemEspecificoDoAssunto) {
        super(identificacao, nome, dataAquisicao, autores);
        this.anoPublicacao = anoPublicacao;
        this.volume = volume;
        this.editora = editora;
        this.itemEspecificoDoAssunto = itemEspecificoDoAssunto;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public int getVolume() {
        return volume;
    }

    public String getEditora() {
        return editora;
    }

    public String getItemEspecificoDoAssunto() {
        return itemEspecificoDoAssunto;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setItemEspecificoDoAssunto(String itemEspecificoDoAssunto) {
        this.itemEspecificoDoAssunto = itemEspecificoDoAssunto;
    }
}
