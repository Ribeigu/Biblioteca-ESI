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
public class CatalogoFuncionario {
    private ArrayList<Funcionario> validos;
    private ArrayList<Funcionario> invalidos;
    
    public CatalogoFuncionario(){
        validos = new ArrayList<>();
        invalidos = new ArrayList<>();
    }
    
    public void addFuncionario(Funcionario funcionario){
        validos.add(funcionario);
    }
    
    public void tornarInvalido(Funcionario funcionario){
        validos.remove(funcionario);
        invalidos.add(funcionario);
    }
    
    public boolean buscarFucnionarioValido(String CPF){
        for(int i=0; i<validos.size(); i++){
            if(validos.get(i).getCPF().equals(CPF)){
                return true;
            }
        }
        return false;
    }
    
    public boolean buscarFuncionarioInvalido(String CPF){
        for(int i=0; i<invalidos.size(); i++){
            if(invalidos.get(i).getCPF().equals(CPF)){
                return true;
            }
        }
        return false;
    }
}
