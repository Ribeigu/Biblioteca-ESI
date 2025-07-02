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
public class CatalogoExemplar {
    private final ArrayList<Livro> exemplares;
    private final String ISBN;

    public CatalogoExemplar(String ISBN) {
        this.exemplares = new ArrayList<>();
        this.ISBN = ISBN;
    }
    
    public int TamanhoCatalogo(){
        return exemplares.size();
    }

    public ArrayList<Livro> getExemplares() {
        return exemplares;
    }
    
    public void AdicionarExemplar(Livro livro){
        exemplares.add(livro);
    }
    
    public Livro BuscarLivro(String tombo){
        for(Livro e : exemplares){
            if(e.getTombo().equals(tombo)){
                return e;
            }
        }
        return null;
    }
    
    public boolean VerificarDisponibilidade(){
        for(Livro e : exemplares){
            if(e.getDisponibilidade().equals(EnumDisponibilidade.DISPONIVEL)){
                return true;
            }
        }
        return false;
    }

    public String getISBN() {
        return ISBN;
    }
    
    public void ImprimirLivro(){
        exemplares.get(0).ImprimirInformacoes();
    }
}
