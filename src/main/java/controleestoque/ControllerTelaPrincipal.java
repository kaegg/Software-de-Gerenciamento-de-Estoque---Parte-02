/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleestoque;

/**
 *
 * @author kauan
 */
public class ControllerTelaPrincipal {
    public ControllerTelaPrincipal(){
        super();
    }
    
    public String pesquisar(int codigo, String nome, double preco, int qtdEstoque, int ativo){
        try {
            
            System.out.println(codigo + " " + nome + " " + preco + " " + qtdEstoque + " " + ativo);
            return null; // Retorna null se a pesquisa for bem-sucedida
        } catch (Exception e) {
            // Retorna a mensagem de erro se ocorrer um problema durante a pesquisa
            return "Erro ao pesquisar: " + e.getMessage();
        }
    }
}
