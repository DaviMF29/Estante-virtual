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

    gerenciadorDeLivros gerenciador;
    Livros livro;
    private String nome;
    private int id;
    private String email;
    private int idade;
    
    
    ArrayList<Livros> livrosLidos;
    ArrayList<Livros> listaDeDesejo;
    ArrayList<Leitor> amigos;

    public Leitor(String nome, int id, String email, int idade) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.idade = idade;
    }

    public void adicionarLivroLido() {
        ArrayList<Livros> listaLivros = gerenciadorDeLivros.getInstancia().getLivros();

        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.println("\n" + (i+1) + " - " + listaLivros.get(i+1).getTitulo());
        }
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        if (escolha >= 1 && escolha <= listaLivros.size()) {
            livrosLidos.add(listaLivros.get(escolha - 1));
        } else {
            System.out.println("Opção inválida. Livro não encontrado.");
            
        }

    }

    public void adicionarLivroDesejado() {
        ArrayList<Livros> listaLivros = gerenciadorDeLivros.getInstancia().getLivros();

        for (int i = 0; i < listaLivros.size(); i++) {
            System.out.println("\n" + (i+1) + " - " + listaLivros.get(i).getTitulo());
        }
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        if (escolha >= 1 && escolha <= listaLivros.size()) {
            listaDeDesejo.add(listaLivros.get(escolha - 1));
        } else {
            System.out.println("Opção inválida. Livro não encontrado.");
            
        }
    }

    public void listarLivrosLidos() {
        for (int i = 0; i < livrosLidos.size(); i++) {
            System.out.println(livrosLidos.get(i));
        }
    }

    public void adicionarEstrela(Livros livro) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você gostou do livro? De 0-5.");
        int numero = input.nextInt();
        Avaliacao avaliacao = new Avaliacao();
        if (numero <= 5 && numero >= 0) {
            avaliacao.setNumero(numero);
        } else {
            System.out.println("Apenas avaliações entre 0 e 5.");
        }
        input.close();

    }

    public void adicionarAvaliacao(Livros livro) {
        Scanner input = new Scanner(System.in);
        System.out.println("Diga o que vc achou do livro: ");
        Avaliacao avaliacao = new Avaliacao();
        String texto = input.nextLine();
        avaliacao.setTexto(texto);
        adicionarEstrela(livro);
        livro.adicionarAvaliacao(avaliacao);
        input.close();
    }

    public void adicionarAmigo(Leitor leitor) {
        System.out.println(leitor.nome + " Adicionado como amigo.");
        amigos.add(leitor);
    }

    public void removerAmigo() {
        listarAmigos();
        System.out.println("Remova por posicação");
        Scanner input = new Scanner(System.in);
        int posicao = input.nextInt();
        if (posicao > amigos.size()) {
            System.out.println("Posição inválida");
        } else {
            amigos.remove(posicao - 1);
            System.out.println("Usuário removido da lista de amigos");
        }
        input.close();
    }

    public void listarAmigos() {
        System.out.println("Sua lista de amigos:");
        for (int i = 0; i < amigos.size(); i++) {
            System.out.println((i + 1) + "- " + amigos.toString());
        }
    }

    public String getNome() {
        return nome;
    }

    public void atualizarAvaliação(Livros livro) {
        livro.listarAvaliações();
        System.out.println("Qual avaliação atualizar? ");
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        livro.mudarAvaliacao(valor);

    }

    @Override
    public String toString() {
        return "\nNome:" + nome + "\nID:" + id + "\nIdade:" + idade + "\n";
    }

}
