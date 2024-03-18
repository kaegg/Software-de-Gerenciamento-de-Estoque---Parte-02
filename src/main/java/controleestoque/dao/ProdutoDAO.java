package controleestoque.dao;

import controleestoque.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kauan
 */
public class ProdutoDAO {
    public ArrayList<Produto> pesquisarProdutos(int codigo) throws ExceptionDAO{
            String sql = "SELECT * FROM produtos WHERE codigo = '%" + codigo + "%' ORDER BY codigo";
            
            Connection connection;
            PreparedStatement pStatement = null;
            ArrayList<Produto> produtos = new ArrayList<>();
            
            try{
                connection = ConnectionFactory.getConnection();
                pStatement = connection.prepareStatement(sql);
                ResultSet resultSet = pStatement.executeQuery(sql);
                
                if(resultSet != null){
                   while(resultSet.next()){
                       int codigoRs = resultSet.getInt("codigo");
                       String nomeRs = resultSet.getString("nome");
                       String descricaoRs = resultSet.getString("descricao");
                       double precoRs = resultSet.getDouble("preco");
                       int quantidadeRs = resultSet.getInt("quantidade");
                       
                       Produto produto = new Produto(codigoRs, nomeRs, descricaoRs, precoRs, quantidadeRs);
                       produtos.add(produto);
                   }
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao realizar a pesquisa de produtos: " + e + "\n");
            }finally{
                try{
                    if(pStatement != null){
                        pStatement.close();
                    }
                }catch(SQLException e){
                    throw new ExceptionDAO("Erro ao fechar o prepared statement: " + e + "\n");
                }
            }
            
            try{
                if(connection != null){
                    connection.close();
                }
            }catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar a conexão com o banco: " + e + "\n");
            }
            
            return produtos;
    }
}
