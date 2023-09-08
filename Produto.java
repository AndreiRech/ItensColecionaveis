//identificação única, nome, data de aquisição, lista de autores
import java.util.*;
public class Produto {
    public int identificacao;
    public String nome;
    public String dataAquisicao;
    public List <String> autores;

    public Produto(int identificacao, String nome, String dataAquisicao, List <String> autores){
        this.identificacao=identificacao;
        this.nome=nome;
        this.dataAquisicao=dataAquisicao;
        this.autores=autores;
    }
    public Produto(){

    }

}
