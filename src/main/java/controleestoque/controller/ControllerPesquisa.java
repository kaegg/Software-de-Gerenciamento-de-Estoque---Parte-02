package controleestoque.controller;

import controleestoque.dao.ExceptionDAO;
import controleestoque.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author kauan
 */
public class ControllerPesquisa {
    public ControllerPesquisa(){
        super();
    }
    
    public String pesquisar(String codigo, String nome, String preco, int qtdEstoque){
        try {
            if(!codigo.isEmpty()){
                int codigoInt = Integer.parseInt(codigo);
            }

            if(!preco.isEmpty()){
                preco = preco.replace(",", ".");
                double codigoDouble = Double.parseDouble(preco);
            }
        } catch (NumberFormatException e) {
            return "O campo Código e preço aceita apenas Números";
        } catch(Exception e){
            return "Ocorreu um erro na pesquisa: " + e;
        }
        
        return null;
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
   
    public void editarProduto(int codigo, String coluna, String valorNovo) throws ExceptionDAO{
        String nome = "";
        String descricao = "";
        double precoDouble = 0;
        int quantidadeInt = 0;
        
        try{
            switch(coluna){
                case "Nome" -> {
                    nome = valorNovo;
                    System.out.println(nome);
                }
                case "Descrição" -> {
                    descricao = valorNovo;
                    System.out.println(descricao);
                }
                case "Preço" -> {
                    precoDouble = Double.parseDouble(valorNovo);    
                    System.out.println(precoDouble);
                }
                case "Quantidade" -> {
                    quantidadeInt = Integer.parseInt(valorNovo);
                    System.out.println(quantidadeInt);
                }   
            }
            
            new Produto().editarProduto(codigo, nome, descricao, precoDouble, quantidadeInt);
        }catch(NumberFormatException e){
            throw new ExceptionDAO("O campo Código e Preço aceita apenas Números\n");
        }catch(Exception e){
            throw new ExceptionDAO("Ocorreu um erro ao Editar o produto " + codigo + e + ".\n");
        }
    }
}
