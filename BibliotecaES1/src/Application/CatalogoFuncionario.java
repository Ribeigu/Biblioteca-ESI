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
    
    private CatalogoFuncionario() {
        validos = new ArrayList<>();
        invalidos = new ArrayList<>();
    }
    private static CatalogoFuncionario instancia;
    
    public static CatalogoFuncionario getInstancia(){
        if(instancia==null) instancia = new CatalogoFuncionario();
        return instancia;
    }
    
    public void AdicionarFuncionario(Funcionario funcionario){
        validos.add(funcionario);
    }
    
    public void AdicionarFuncionarioInvalido(Funcionario funcionario){
        validos.remove(funcionario);
        invalidos.add(funcionario);
    }
    
    public Funcionario BuscarFucnionario(String CPF){
        for(Funcionario f : validos){
            if(f.getCPF().equals(CPF)){
                return f;
            }
        }
        return null;
    }
    
    public Funcionario BuscarFuncionarioInvalido(String CPF){
        for(Funcionario f : invalidos){
            if(f.getCPF().equals(CPF)){
                return f;
            }
        }
        return null;
    }
    
    public boolean VerificarAutenticidade(String email){
        for(Funcionario f : invalidos){
            if(f.getEmail().equals(email)){
                return false;  //ta invalido
            }
        }
        return true;  //nao ta invalido
    }

    public ArrayList<Funcionario> getValidos() {
        return validos;
    }

    public ArrayList<Funcionario> getInvalidos() {
        return invalidos;
    }
    
}
