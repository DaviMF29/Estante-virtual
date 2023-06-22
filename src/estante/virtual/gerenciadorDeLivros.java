
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class gerenciadorDeLivros implements criadorLivro {

    public static gerenciadorDeLivros instancia;
    List<Double> maioresItens;
    Livros livro;
    public ArrayList<Livros> livros = new ArrayList<Livros>();
    List<Double> media = new ArrayList<>();
    
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
        System.out.println("Insira o título: ");
        String titulo = input.nextLine();
        System.out.println("Insira o autor: ");
        String autor = input.nextLine();
        System.out.println("Insira o gênero: ");
        String genero = input.nextLine();
        Livros aux = new Livros(titulo,autor,genero);
        livros.add(aux);
        System.out.println("Livro "+aux.getTitulo()+" foi adicionado" );
        return aux;

    }
    
    public void listarLivros() {
        System.out.println("Livros cadastrados: ");
        for(int i =0; i<livros.size();i++){
           System.out.println((i+1)+"-"+this.livros.get(i).toString());
        }
    }
    
    
    public void tamanho(){
        System.out.println(this.livros.size());
    }


    public ArrayList<Livros> getLivros(){
        return livros;
  }

    @Override
    public String toString() {
        return "gerenciadorDeLivros{" + "livros=" + livros + '}';
    }
    

    
    public void criarMedia(){
        for(int i = 0; i< livro.getEstrelas().size();i++){
            media.add(livro.mediaAvaliacao()/livro.getEstrelas().size());
        }
              
    }

    public void buscarPorGenero() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o gênero para buscar: ");
        String genero = input.nextLine();
        for(int i = 0; i < livros.size(); i++) {
            if(livros.get(i).getGenero().equals(genero)) {
                System.out.println((i + 1) + "-" + livros.get(i));
            }
        }
    }

    public void buscarPorAutor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o autor para buscar: ");
        String autor = input.nextLine();
        for(int i = 0; i < livros.size(); i++) {
            if(livros.get(i).getAutor().equals(autor)) {
                System.out.println((i + 1) + "-" + livros.get(i));
            }
        }
    }

    public void recomendados(){
        System.out.println("5 Livros com as melhores notas: ");
        Collections.sort(livros, Comparator.comparingDouble(Livros::getMedia).reversed());

        for (int i = 0; i < 5 && i < livros.size(); i++) {
            System.out.println(i+" - "+livros.get(i).getTitulo() + " - Nota: " + livros.get(i).getMedia());
        }
    }
 
}