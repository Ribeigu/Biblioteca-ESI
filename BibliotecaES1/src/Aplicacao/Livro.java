/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacao;
import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class Livro {
    private String titulo;
    private String ISBN;
    private int edicao;
    private ArrayList<String> autores;
    private String tombo;
    private ArrayList<EnumGeneros> genero;
    private EnumDisponibilidade disponibilidade;

    public Livro(){
        
    }

    public Livro(String titulo, String ISBN, int edicao, ArrayList<String> autores, String tombo, ArrayList<EnumGeneros> genero) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.edicao = edicao;
        this.autores = autores;
        this.tombo = tombo;
        this.genero = genero;
        this.disponibilidade = disponibilidade.DISPONIVEL;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
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

    public String getTombo() {
        return tombo;
    }

    public void setTombo(String tombo) {
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
    
    public void ImprimirInformacoes(){
        System.out.println(titulo + ", " + edicao + "ª edicao, ");
        for(String a : autores){
            System.out.println(a + ", ");
        }
        for(EnumGeneros g : genero){
            System.out.println(g + ", ");
        }
        System.out.println(ISBN);
            
             
    }
}
