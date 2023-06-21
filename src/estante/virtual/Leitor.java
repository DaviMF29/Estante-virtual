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
public class Leitor {
    
    
    String nome;
    int id;
    String email;
    int idade;
    
    
    ArrayList<Livros> livros = new ArrayList<Livros>();
    ArrayList<Leitor> amigos = new ArrayList<Leitor>();
    

    
    public Leitor(String nome, int id, String email, int idade) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.idade = idade;
    }
    
    public void adicionarLivroLido(Livros livro){
        livros.add(livro);
    }
    
    public void listarLivros(){
        for(int i =0; i< livros.size();i++){
            System.out.println(livros.get(i));
        }
          
    }
    
    
    
    public void adicionarEstrela(Livros livro){
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você gostou do livro? De 0-5.");
        int numero = input.nextInt();
        Avaliacao avaliacao = new Avaliacao();
        
        avaliacao.setNumero(numero);
        
        
    }
    public void adicionarAvaliacao(Livros livro){
        Scanner input = new Scanner(System.in);
        System.out.println("Diga o que vc achou do livro: ");
        Avaliacao avaliacao = new Avaliacao();
        String texto = input.nextLine();
        avaliacao.setTexto(texto);
        adicionarEstrela(livro);
        livro.adicionarAvaliacao(avaliacao);
        
    }
    
    public void adicionarAmigo(Leitor leitor){
        System.out.println(leitor.nome+ " Adicionado como amigo.");
        amigos.add(leitor);
    }
    public void removerAmigo(){
        System.out.println("Lista de amigos:");
        listarAmigos();
        System.out.println("Remova por posicação");
        Scanner input = new Scanner(System.in);
        int posicao = input.nextInt();
        if(posicao> amigos.size()){
            System.out.println("Posição inválida");
        }
        else{
            amigos.remove(posicao-1);
            System.out.println("Usuário removido da lista de amigos");
        }
    }
    public void listarAmigos(){
        System.out.println("Sua lista de amigos:");
        for(int i =0; i<amigos.size();i++){
            System.out.println((i+1) + "- " + amigos.toString());
            
        }
        
    }

    @Override
    public String toString() {
        return "\nNome:" + nome + "\nID:" + id + "\nIdade:" + idade+"\n";
    }
    
    
    
    
}
