/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estante.virtual;

/**
 *
 * @author Miguel
 */
public class EstanteVirtual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livros livro1 = new Livros("a","a","a");
        
        Leitor leitor1 = new Leitor("b",1,"b",1);
        Leitor leitor2 = new Leitor("b",1,"b",1);
        leitor1.adicionarAvaliacao(livro1);
        leitor1.adicionarAmigo(leitor2);
        leitor1.listarAmigos();
        leitor1.removerAmigo();
        livro1.listarAvaliações();
        
    }
    
}
