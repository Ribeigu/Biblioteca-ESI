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
public class CatalogoLeitor {
    private ArrayList<Leitor> validos;
    private ArrayList<Leitor> invalidos;
    
    public CatalogoLeitor(){
        validos = new ArrayList<>();
        invalidos = new ArrayList<>();
    }
    
     public void adicionarLeitor(Leitor leitor){
        validos.add(leitor);
    }
    
    public void tornarInvalido(Leitor leitor){
        validos.remove(leitor);
        invalidos.add(leitor);
    }
    
    public boolean buscarLeitorValido(String CPF){
        for(int i=0; i<validos.size(); i++){
            if(validos.get(i).getCPF().equals(CPF)){
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarLeitorInvalido(String CPF){
        for(int i=0; i<invalidos.size(); i++){
            if(invalidos.get(i).getCPF().equals(CPF)){
                return true;
            }
        }
        return false;
    }
}
