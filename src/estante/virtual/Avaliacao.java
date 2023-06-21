/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estante.virtual;

/**
 *
 * @author Miguel
 */
public class Avaliacao {
    private String texto = "";
    private int numero = 0;

    public Avaliacao(String texto, int numero) {
        this.texto = texto;
        this.numero = numero;
    }

    public Avaliacao() {
    }
    
    

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Discrição: " +texto + "\nEstrelas:" + numero;
    }
    
    
}
