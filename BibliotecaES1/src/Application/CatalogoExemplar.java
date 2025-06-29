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
public class CatalogoExemplar {
    private final ArrayList<Livro> exemplares;
    private final int ISBN;

    public CatalogoExemplar(int ISBN) {
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
    
    public Livro BuscarLivro(int tombo){
        for(Livro e : exemplares){
            if(e.getTombo() == tombo){
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

    public int getISBN() {
        return ISBN;
    }
   
}
