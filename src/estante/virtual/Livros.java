/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estante.virtual;

import java.util.ArrayList;
import java.util.Scanner;


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

    Livros() {
        
    }

   


    public void adicionarAvaliacao(Avaliacao avaliacao){
        avaliacoes.add(avaliacao);
        
    }
    
    public void listarAvaliações(){
        System.out.println("Livro: "+titulo);
        for(int i = 0; i <avaliacoes.size();i++){
            System.out.println(avaliacoes.toString());
        } 
    }
    
    public void mudarAvaliacao(int i){
        System.out.println("Mudar estrelas, Discricão ou ambos?");
        System.out.println("1|2|3. Respectivamente");
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        if(valor ==1){
            System.out.println("Quantas estrelas? ");
            valor = input.nextInt();
            avaliacoes.get(i).setNumero(valor);
        }
        else if(valor ==2){
            System.out.println("Qual a nova discricão? ");
            String txt = input.nextLine();
            avaliacoes.get(i).setTexto(txt);
        }
        else{
            System.out.println("Quantas estrelas? ");
            valor = input.nextInt();
            avaliacoes.get(i).setNumero(valor);
            System.out.println("Qual a nova discricão? ");
            String txt = input.nextLine();
            avaliacoes.get(i).setTexto(txt);
        }
    }

    @Override
    public String toString() {
        return "Titulo:" + titulo + "\nAutor:" + autor + "\nGenero:" + genero;
    }

    public String getTitulo() {
        return titulo;
    }
    
    
}
