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
public class gerenciadorDeLivros implements criadorLivro {

    public static gerenciadorDeLivros instancia;
    
    
    private ArrayList<Livros> livros = new ArrayList<Livros>();

    public gerenciadorDeLivros() {
        livros = new ArrayList<>();
    }
  
    public static gerenciadorDeLivros getInstancia() {
        if (instancia == null) {
            instancia = new gerenciadorDeLivros();
        }
        return instancia;
    }
  
    @Override
    public Livros criarLivros() {
        Scanner input = new Scanner(System.in);
        String titulo = input.nextLine();
        String autor = input.nextLine();
        String genero = input.nextLine();
        Livros aux = new Livros(titulo,autor,genero);
        livros.add(aux);
        System.out.println("Livro "+aux.getTitulo()+" foi adicionado" );
        System.out.println(aux);
        return aux;

    }
    
    public void listarLivros() {
        System.out.println("Livros cadastrados: ");
        for(int i =0; i<livros.size();i++){
           System.out.println((i+1)+"-"+livros.get(i));
        }
    }
    
    public void elemento1(){
        System.out.println(livros.get(0));
        
    }
    
    public void tamanho(){
        System.out.println(livros.size());
    }


    public ArrayList<Livros> getLivros(){
        return livros;
  }

    
 
}