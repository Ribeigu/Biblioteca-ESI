/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.util.ArrayList;
/**
 *
 * @author Júlia
 */
public class CatalogoEmprestimo {
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Emprestimo> devolucoes;
    
    private CatalogoEmprestimo() {
        emprestimos = new ArrayList<>();
        devolucoes = new ArrayList<>();
    }
    private static CatalogoEmprestimo instancia;
    
    public static CatalogoEmprestimo getInstancia(){
        if(instancia==null) instancia = new CatalogoEmprestimo();
        return instancia;
    }
    
    public void AdicionarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    } 
    
    public void AdicionarDevolucao(Emprestimo devolucao){
        emprestimos.remove(devolucao);   
        devolucoes.add(devolucao);
    } 
    
    public Emprestimo BuscarEmprestimo(Livro livro){
        Livro aux;
        Emprestimo emprestimo;
        for(Emprestimo e : emprestimos){
            aux = e.getLivro();
            if(aux.equals(aux)){
            emprestimo = e;
                return emprestimo;
            }
        }
        return null;
    }
    
    public Emprestimo BuscarDevolucao(String tombo){
        Livro aux;
        Emprestimo devolucao;
        for(Emprestimo d : devolucoes){
            aux = d.getLivro();
            if(aux.getTombo().equals(tombo)){
                devolucao = d;
                return devolucao;
            }
        }
        return null;
    }
    
    public ArrayList<Emprestimo> BuscarEmprestimosAtrasados(String CPF){
        ArrayList<Emprestimo> aux = new ArrayList<>(); 
        for(Emprestimo e : emprestimos){
            if(e.getCPF().equals(CPF)){
                if(e.getMulta()){
                    aux.add(e);
                }
            }
        }
        return aux;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public ArrayList<Emprestimo> getDevolucoes() {
        return devolucoes;
    }    
}
