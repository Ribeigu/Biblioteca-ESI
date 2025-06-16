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
    
    public CatalogoEmprestimo(){
        emprestimos = new ArrayList<>();
    }
    
    public void adicionarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    } 
    
    public boolean buscar(int tombo){
        Livro aux;
        for(int i=0; i<emprestimos.size(); i++){
            aux = emprestimos.get(i).getLivro();
            if(aux.getTombo() == tombo){
                return true;
            }
        }
        return false;
    }
}
