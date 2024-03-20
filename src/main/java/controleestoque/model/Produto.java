package controleestoque.model;

import controleestoque.dao.ExceptionDAO;
import controleestoque.dao.ProdutoDAO;
import java.util.ArrayList;

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
    
    public Produto(int codigo, String nome, String descricao, double preco, int qtdEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }
    
    public Produto() {
        super();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    
    
    public ArrayList<Produto> pesquisarProdutos(int codigo, String nome, double preco, int qtdEstoque) throws ExceptionDAO{
        return new ProdutoDAO().pesquisarProdutos(codigo, nome, preco, qtdEstoque);
    }
    
    public void editarProduto(int codigo, String nome, String descricao, double preco, int qtdEstoque) throws ExceptionDAO{
       new ProdutoDAO().editarProduto(codigo, nome, descricao, preco, qtdEstoque);
    }
}
