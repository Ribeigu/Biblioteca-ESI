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
public class CatalogoLivros {
    private ArrayList<CatalogoExemplar> livros;
    private CatalogoLivros() {}
    private static CatalogoLivros instancia;
    
    public static CatalogoLivros getInstancia(){
        if(instancia==null) instancia = new CatalogoLivros();
        return instancia;
    }
    
    public void AdicionarExemplar(Livro livro){
        int ISBN = livro.getISBN();
        for(CatalogoExemplar e : livros){
            if(e.getISBN() == ISBN){
                e.AdicionarExemplar(livro);
            }
        }
    }
    
    public int tamanhoCatalogo(){
        return livros.size();
    }
    
    public int VerificarQuantidade(int ISBN){
        for(CatalogoExemplar e : livros){
            if(e.getISBN() == ISBN){
                return e.TamanhoCatalogo();
            }
        }
        return 0;
    }
    
    public boolean VerificarDisponibilidade(int ISBN){
        for(CatalogoExemplar e : livros){
            if(e.getISBN() == ISBN){
                return e.VerificarDisponibilidade();
            }
        }
        return false;
    }
    
    public boolean BuscarCatalogoExemplar(int ISBN){
        for(CatalogoExemplar e : livros){
            if(e.getISBN() == ISBN){
                return true;
            }
        }
        return false;
    }
    
}
