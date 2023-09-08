import java.util.*;
public class CD extends Produto{

    private String generoMusical;
    private List<String> listaMusicas;
    public CD(int identificacao, String nome, String dataAquisicao, List <String> autores, String generoMusical, List<String> listaMusicas) {
        super(identificacao, nome, dataAquisicao, autores);
        this.generoMusical=generoMusical;
        this.listaMusicas=listaMusicas;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public List<String> getListaMusicas() {
        return listaMusicas;
    }

}
