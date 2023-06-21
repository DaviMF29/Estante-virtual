/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estante.virtual;

/**
 *
 * @author Miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        gerenciadorDeLivros gerenciador = new gerenciadorDeLivros();
        Leitor leitor1 = new Leitor("b",1,"b",1);
//        Leitor leitor2 = new Leitor("b",1,"b",1);
//        leitor1.adicionarAvaliacao(livro1);
//        leitor1.adicionarAmigo(leitor2);
//        leitor1.listarAmigos();
//        leitor1.removerAmigo();
//        System.out.println(" ");

          
//          gerenciador.getLivros().add(gerenciador.criarLivros());
          gerenciador.criarLivros();
          gerenciador.criarLivros();
          //gerenciador.tamanho();
          //gerenciador.criarLivros();
          
          leitor1.adicionarLivroLido();
          leitor1.adicionarLivroDesejado();
          
          

    }
    
}
