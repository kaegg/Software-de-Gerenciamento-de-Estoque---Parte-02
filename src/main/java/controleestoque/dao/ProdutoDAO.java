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
    public ArrayList<Produto> pesquisarProdutos(int codigo, String nome, double preco, int qtdEstoque) throws ExceptionDAO{
            StringBuilder sqlBuilder = new StringBuilder("SELECT * FROM produtos WHERE 1=1");

            if (codigo != 0) {
                sqlBuilder.append(" AND codigo = ?");
            }
            
            if (nome != null && !nome.isEmpty()) {
                sqlBuilder.append(" AND nome LIKE ?");
            }
            
            if (preco > 0) {
                sqlBuilder.append(" AND preco >= ?");
            } 
            
            if (qtdEstoque != 0) {
                sqlBuilder.append(" AND quantidade >= ?");
            }
            
            Connection connection;
            PreparedStatement pStatement = null;
            ArrayList<Produto> produtos = new ArrayList<>();
            
            try{
                connection = ConnectionFactory.getConnection();
                pStatement = connection.prepareStatement(sqlBuilder.toString());
                int parameterIndex = 1;
                if (codigo != 0) {
                    pStatement.setInt(parameterIndex++, codigo);
                } 
                
                if (nome != null && !nome.isEmpty()) {
                    pStatement.setString(parameterIndex++, nome + "%");
                }
                
                if (preco > 0) {
                    pStatement.setDouble(parameterIndex++, preco);
                }
                
                if (qtdEstoque != 0) {
                    pStatement.setInt(parameterIndex, qtdEstoque);
                }
                
                ResultSet resultSet = pStatement.executeQuery();
                
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
    
    public void editarProduto() throws ExceptionDAO{
        
    }
}
