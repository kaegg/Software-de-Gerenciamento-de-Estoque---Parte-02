package controleestoque;

/**
 *
 * @author kauan
 */
public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private int qtdEstoque;
    private boolean ativo;
    
    public Produto(int codigo, String nome, String descricao, double preco, int qtdEstoque, boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.ativo = ativo;
    }
}
