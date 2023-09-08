import java.util.*;
public class DVD extends Produto {

    private String tipo;
    private String descricao;
    public DVD(int identificacao, String nome, String dataAquisicao, String autores, String tipo, String descricao) {
        super(identificacao, nome, dataAquisicao, autores);
        this.tipo=tipo;
        this.descricao=descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }
}
