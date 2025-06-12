/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplication;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class CatalogoLivros {
    private ArrayList<CatalogoExemplar> livros;
    
    public int tamanhoCatalogo(){
        return livros.size();
    }
    
    public CatalogoExemplar buscaExemplares(int posicao){
        return livros.get(posicao);
    }
    
    public Livro buscarISBN(int ISBN){
        for(int i=0; i<tamanhoCatalogo(); i++){
            CatalogoExemplar exemplares = buscaExemplares(i);
            Livro livro=exemplares.buscaISBN(ISBN);
            if (livro!=null) return livro;
        }
        return null;
    }
    
}
