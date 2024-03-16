package controleestoque;

/**
 *
 * @author kauan
 */
public class ControllerTelaPrincipal {
    public ControllerTelaPrincipal(){
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
        }

        try {
            System.out.println(codigo + " " + nome + " " + preco + " " + qtdEstoque + " " );
            return null; // Retorna null se a pesquisa for bem-sucedida
        } catch (Exception e) {
            // Retorna a mensagem de erro se ocorrer um problema durante a pesquisa
            return "Erro ao pesquisar: " + e.getMessage();
        }
    }
}
