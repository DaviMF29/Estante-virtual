import estante.virtual.Avaliacao;
import java.util.ArrayList;
import java.util.Scanner;

public class Livros {
    
    
    Avaliacao avaliacao;
    private String titulo;
    private String autor;
    private String genero;
    double media = 0;
    
    
    private ArrayList<Integer> estrelas = new ArrayList<Integer>();
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

    
    
    
    public Livros(String titulo, String autor, String genero ) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        
  
    }

    Livros() {
        
    }

   
    public double mediaAvaliacao(){
        double mediaTotal = 0;
        for(int i = 0; i <avaliacoes.size();i++){
            media =+ estrelas.get(i); 
            mediaTotal = media/avaliacoes.size();
        }
        return mediaTotal;
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

    public ArrayList<Integer> getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas.add(estrelas);
        calcularMediaNotas();
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }
    
    public void calcularMediaNotas(){
        int soma = 0;
        for (int numero : estrelas) {
            soma += numero;
        }
        this.media = (double) soma/estrelas.size();
        System.out.println("Nova media: " +media);
    }
    

    public double getMedia() {
        return media;
    }
    
    
    
}