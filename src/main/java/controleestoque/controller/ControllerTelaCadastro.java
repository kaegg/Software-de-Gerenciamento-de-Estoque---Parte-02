package controleestoque.controller;

import controleestoque.dao.ExceptionDAO;
import controleestoque.model.Produto;

/**
 *
 * @author kauan
 */
public class ControllerTelaCadastro {
    public ControllerTelaCadastro(){
        super();
    }
    
    public boolean cadastrarProduto(String codigo, String nome, String descricao, String preco, int qtdEstoque) throws ExceptionDAO{
        int codigoInt = 0; 
        double precoDouble = 0; 
        
        try {
            if(!codigo.isEmpty()){
                codigoInt = Integer.parseInt(codigo);
            }

            if(!preco.isEmpty()){
                preco = preco.replace(",", ".");
                precoDouble = Double.parseDouble(preco);
            }
            
           Produto produto = new Produto(codigoInt, nome, descricao, precoDouble, qtdEstoque);
           produto.cadastrarProduto(produto);
           
           return true;
        } catch (NumberFormatException e) {
            throw new ExceptionDAO("O campo Código e Preço aceita apenas Números\n");
        } catch(Exception e){
            throw new ExceptionDAO("Ocorreu um erro ao Pesquisar produtos." + e + "\n");
        }
    }
}
