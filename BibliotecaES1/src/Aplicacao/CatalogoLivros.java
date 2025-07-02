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
public class CatalogoLivros {
    private ArrayList<CatalogoExemplar> livros;
    private CatalogoLivros() {}
    private static CatalogoLivros instancia;
    
    public static CatalogoLivros getInstancia(){
        if(instancia==null) instancia = new CatalogoLivros();
        return instancia;
    }
    
    public void AdicionarExemplar(Livro livro){
        String ISBN = livro.getISBN();
        for(CatalogoExemplar e : livros){
            if(e.getISBN().equals(ISBN)){
                e.AdicionarExemplar(livro);
            }
        }
    }
    
     public void AdicionarCatalogoExemplar(CatalogoExemplar catalogoExemplar){
        livros.add(catalogoExemplar);
    }
    
    public int tamanhoCatalogo(){
        return livros.size();
    }
    
    public int VerificarQuantidade(String ISBN){
        for(CatalogoExemplar e : livros){
            if(e.getISBN().equals(ISBN)){
                return e.TamanhoCatalogo();
            }
        }
        return 0;
    }
    
    public boolean VerificarDisponibilidade(String ISBN){
        for(CatalogoExemplar e : livros){
            if(e.getISBN().equals(ISBN)){
                return e.VerificarDisponibilidade();
            }
        }
        return false;
    }
    
    public boolean BuscarCatalogoExemplar(String ISBN){
        for(CatalogoExemplar e : livros){
            if(e.getISBN().equals(ISBN)){
                return true;
            }
        }
        return false;
    }
    
    public Livro BuscarLivro(String ISBN, String tombo){
        for(CatalogoExemplar e : livros){
            if(e.getISBN().equals(ISBN)){
                return e.BuscarLivro(tombo);
            }
        }
        return null;
    }
    
    public Livro BuscarLivroTitulo(String titulo){
        for(CatalogoExemplar e : livros){
            if(e.getTitulo().toUpperCase().equals(titulo.toUpperCase())){
                ArrayList<Livro> exemplares = e.getExemplares();
                return exemplares.get(0);
            }
        }
        return null;
    }
    
    public Livro BuscarLivroISBN(String ISBN){
        for(CatalogoExemplar e : livros){
            if(e.getISBN().equals(ISBN)){
                ArrayList<Livro> exemplares = e.getExemplares();
                return exemplares.get(0);
            }
        }
        return null;
    }
    
    public void ImprimirCatalogo(){
        for(CatalogoExemplar e : livros){
            e.ImprimirLivro();
            System.out.println("/n");
        }
    }
}
