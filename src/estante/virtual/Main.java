public class Main {
    public static void main(String[] args) {
        gerenciadorDeLivros gerenciador = gerenciadorDeLivros.getInstancia();
        Leitor leitor1 = new Leitor("Davi",1,"b",1);
        Leitor leitor2 = new Leitor("vit",1,"b",1);
        gerenciador.criarLivros();
        gerenciador.criarLivros();
        
        
        leitor1.adicionarAmigo(leitor2);
        leitor1.tamanhoAmigo();
        leitor1.listarAmigos();
        
        leitor1.adicionarEstrela();
        leitor1.adicionarEstrela();
        
        gerenciador.recomendados();
        
        leitor1.listarLivrosLidos();
    }
    
}