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
    private String titulo;
    private int ISBN;
    private int edicao;
    private ArrayList<String> autores;
    private int tombo;
    private ArrayList<EnumGeneros> genero;
    private EnumDisponibilidade disponibilidade;

    public Livro(){
        
    }

    public Livro(String titulo, int ISBN, int edicao, ArrayList<String> autores, int tombo, ArrayList<EnumGeneros> genero, EnumDisponibilidade disponibilidade) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.edicao = edicao;
        this.autores = autores;
        this.tombo = tombo;
        this.genero = genero;
        this.disponibilidade = disponibilidade;
    }

    public void AtualizarDiponibilidade(EnumDisponibilidade disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    public int getTombo() {
        return tombo;
    }

    public void setTombo(int tombo) {
        this.tombo = tombo;
    }

    public ArrayList<EnumGeneros> getGenero() {
        return genero;
    }

    public void setGenero(ArrayList<EnumGeneros> genero) {
        this.genero = genero;
    }

    public EnumDisponibilidade getDisponibilidade() {
        return disponibilidade;
    }   
    
}
