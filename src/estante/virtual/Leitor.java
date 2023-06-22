
import estante.virtual.Avaliacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Leitor {

    gerenciadorDeLivros gerenciador = new gerenciadorDeLivros();
    Livros livro;
    private String nome;
    private int id;
    private String email;
    private int idade;
    
    
    ArrayList<Livros> livrosLidos;
    ArrayList<Livros> listaDeDesejo;
    ArrayList<Leitor> amigos;
    ArrayList<Livros> listaLivros;

    public Leitor(String nome, int id, String email, int idade) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.idade = idade;
        this.livrosLidos = new ArrayList<>();
        this.listaDeDesejo = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public void adicionarLivroLido() {
        gerenciadorDeLivros gerente = gerenciadorDeLivros.getInstancia();
        //ArrayList<Livros> listaLivros = gerente.getLivros();
        System.out.println("--"+this.nome +" selecione um livro para adicionar à lista:");
        gerente.listarLivros(); 
       
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        if (escolha >= 1 && escolha <= listaLivros.size()) {
            this.livrosLidos.add(listaLivros.get(escolha - 1));
            System.out.println("Livro " + listaLivros.get(escolha - 1).getTitulo() + " adicionado à lista");
        } else {
            System.out.println("Opção inválida. Livro não encontrado.");
            
        }
    }

    public void adicionarLivroDesejado() {
        gerenciadorDeLivros gerente = gerenciadorDeLivros.getInstancia();
        ArrayList<Livros> listaLivros = gerente.getLivros();
        System.out.println("-- Selecione um livro para adicionar à lista:");
        gerente.listarLivros();
        
        Scanner input = new Scanner(System.in);
        int escolha = input.nextInt();
        if (escolha >= 1 && escolha <= listaLivros.size()) {
            this.listaDeDesejo.add(listaLivros.get(escolha - 1));
            System.out.println("Livro " + listaLivros.get(escolha - 1).getTitulo() + " adicionado à lista");
        } else {
            System.out.println("Opção inválida. Livro não encontrado.");
            
        }
        input.close();
    }

    public void listarLivrosLidos() {
        System.out.println("Livros lidos de " + nome + ":");
        for (int i = 0; i < livrosLidos.size(); i++) {
            System.out.println((i+1)+"-"+livrosLidos.get(i));
        }
    }

    public void adicionarEstrela(){
        listarLivrosLidos();
        System.out.println("Qual livro quer avaliar?");
        Scanner input = new Scanner(System.in);
        int posicao = input.nextInt();
        System.out.println("Em quantas estrelas vc avalia?");
        int estrelas = input.nextInt();
        livrosLidos.get(posicao-1).setEstrelas(estrelas);
    }
    
    public void adicionarAvaliacao(Livros livro) {
        Scanner input = new Scanner(System.in);
        System.out.println("Diga o que vc achou do livro: ");
        Avaliacao avaliacao = new Avaliacao();
        String texto = input.nextLine();
        avaliacao.setTexto(texto);
        adicionarEstrela();
        livro.adicionarAvaliacao(avaliacao);
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
    }

    public void listarAmigos() {
        System.out.println("Sua lista de amigos:");
        for(int i=0;i<amigos.size();i++){
           this.amigos.get(i).toString(); 
        }
        
    }
    
    public void tamanhoAmigo(){
        System.out.println(amigos.size());
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