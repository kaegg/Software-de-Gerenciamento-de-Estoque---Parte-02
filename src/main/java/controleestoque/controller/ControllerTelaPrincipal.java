package controleestoque.controller;

import controleestoque.dao.ExceptionDAO;
import controleestoque.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author kauan
 */
public class ControllerTelaPrincipal {
    public ControllerTelaPrincipal(){
        super();
    }
   
    public ArrayList<Produto> pesquisarProdutos(String codigo, String nome, String preco, int qtdEstoque) throws ExceptionDAO{
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
            
            return new Produto().pesquisarProdutos(codigoInt, nome, precoDouble, qtdEstoque);
        } catch (NumberFormatException e) {
            throw new ExceptionDAO("O campo Código e Preço aceita apenas Números\n");
        } catch(Exception e){
            throw new ExceptionDAO("Ocorreu um erro ao Pesquisar produtos." + e + "\n");
        }
    }
   
    public boolean editarProduto(int codigo, String coluna, String valorNovo) throws ExceptionDAO{
        String nome = "";
        String descricao = "";
        double precoDouble = 0;
        int quantidadeInt = 0;
        
        try{
            switch(coluna){
                case "Nome" -> {
                    nome = valorNovo;
                }
                case "Descrição" -> {
                    descricao = valorNovo;
                }
                case "Preço" -> {
                    precoDouble = Double.parseDouble(valorNovo);
                }
                case "Quantidade" -> {
                    quantidadeInt = Integer.parseInt(valorNovo);
                }   
            }
            
            new Produto().editarProduto(codigo, nome, descricao, precoDouble, quantidadeInt);
            
            return true;
        }catch(NumberFormatException e){
            throw new ExceptionDAO("O campo Código e Preço aceita apenas Números\n");
        }catch(Exception e){
            throw new ExceptionDAO("Ocorreu um erro ao Editar o produto " + codigo + " " + e + ".\n");
        }
    }
    
    public boolean deletarProduto(int codigo) throws ExceptionDAO{
        if(codigo != 0){
            new Produto().deletarProduto(codigo);
            return true;
        }else{
            throw new ExceptionDAO("Não foi possível realizar a remoção do produto, por favor tente novamente");
        } 
    }
}
