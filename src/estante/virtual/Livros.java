/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estante.virtual;

import java.util.ArrayList;


/**
 *
 * @author Miguel
 */
public class Livros {
    
    Avaliacao avaliacao;
    private String titulo;
    private String autor;
    private String genero;
    
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

    public Livros(String titulo, String autor, String genero ) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
  
    }


    public void adicionarAvaliacao(Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
        
    }
    
    public void listarAvaliações(){
        for(int i = 0; i <avaliacoes.size();i++){
            System.out.println(avaliacoes.toString());
            
        }
        
    }
    
}
