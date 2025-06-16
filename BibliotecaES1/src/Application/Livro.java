/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Livro {
    private String Nome;
    private int ISBN;
    private ArrayList<String> Autores;
    private int tombo;
    private ArrayList<Generos> genero;
    private Disponibilidade Disponibilidade;

    public Livro(String Nome, int ISBN, ArrayList<String> Autores, int tombo, ArrayList<Generos> genero, Disponibilidade Disponibilidade) {
        this.Nome = Nome;
        this.ISBN = ISBN;
        this.Autores = Autores;
        this.tombo = tombo;
        this.genero = genero;
        this.Disponibilidade = Disponibilidade;
    }

    public Livro() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public ArrayList<String> getAutores() {
        return Autores;
    }

    public void setAutores(ArrayList<String> Autores) {
        this.Autores = Autores;
    }

    public int getTombo() {
        return tombo;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public ArrayList<Generos> getGenero() {
        return genero;
    }

    public void setGenero(ArrayList<Generos> genero) {
        this.genero = genero;
    }

    public Disponibilidade getDisponibilidade() {
        return Disponibilidade;
    }

    public void setDisponibilidade(Disponibilidade Disponibilidade) {
        this.Disponibilidade = Disponibilidade;
    }
    
    
    
    
    
}
