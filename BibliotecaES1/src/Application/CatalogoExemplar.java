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
    private ArrayList<Livro>  exemplares;
    private CatalogoExemplar() {}
    private static CatalogoExemplar instancia;
    
    public static CatalogoExemplar getInstancia(){
        if(instancia==null) instancia = new CatalogoExemplar();
        return instancia;
    }
    
    
    public void adicionarExemplar(Livro livro){
        exemplares.add(livro);
    }
    
    public Livro busca(int posicao){
        return exemplares.get(posicao);
    }
    
    public Livro buscaDisponibilidade(){
        for(int i =0; i<exemplares.size(); i++){
            Livro livro = busca(i);
            if(livro.getDisponibilidade()== Disponibilidade.DISPONIVEL){
                return livro;
            }
        }
        return null;
    }
    
    public Livro buscaISBN(int ISBN){
        Livro livro = busca(1);
        if(livro.getISBN()==ISBN) return livro;
        return null;
    }
}
