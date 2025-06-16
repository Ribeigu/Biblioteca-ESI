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
    
    public CatalogoEmprestimo(){
        emprestimos = new ArrayList<>();
        devolucoes = new ArrayList<>();
    }
    
    public void adicionarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    } 
    
    public void adicionarDevolucao(Emprestimo devolucao){
        emprestimos.remove(devolucao);   //ta certo isso??
        devolucoes.add(devolucao);
    } 
    
    public boolean buscarEmprestimo(int tombo){
        Livro aux;
        for(int i=0; i<emprestimos.size(); i++){
            aux = emprestimos.get(i).getLivro();
            if(aux.getTombo() == tombo){
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarDevolucao(int tombo){
        Livro aux;
        for(int i=0; i<devolucoes.size(); i++){
            aux = devolucoes.get(i).getLivro();
            if(aux.getTombo() == tombo){
                return true;
            }
        }
        return false;
    }
}
