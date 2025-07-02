/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacao;
import java.util.ArrayList;
/**
 *
 * @author Júlia
 */
public class CatalogoLeitor {
    private ArrayList<Leitor> validos;
    private ArrayList<Leitor> invalidos;
    
    private CatalogoLeitor() {
        validos = new ArrayList<>();
        invalidos = new ArrayList<>();
    }
    private static CatalogoLeitor instancia;
    
    public static CatalogoLeitor getInstancia(){
        if(instancia==null) instancia = new CatalogoLeitor();
        return instancia;
    }
    
     public void AdicionarLeitor(Leitor leitor){
        validos.add(leitor);
    }
    
    public void AdicionarLeitorInvalido(Leitor leitor){
        validos.remove(leitor);
        invalidos.add(leitor);
    }
    
    public Leitor BuscarLeitor(String CPF){
        for(Leitor l : validos){
            if(l.getCPF().equals(CPF)){
                return l;
            }
        }
        return null;
    }
    
    public Leitor BuscarLeitorInvalido(String CPF){
        for(Leitor l : invalidos){
            if(l.getCPF().equals(CPF)){
                return l;
            }
        }
        return null;
    }
    
    public boolean VerificarAutenticidade(String email){
        for(Leitor l : invalidos){
            if(l.getEmail().equals(email)){
                return false;   //ta invalido
            }
        }
        for(Leitor l : validos){
            if(l.getEmail().equals(email)){
                return true;    //nao ta invalido
            }
        }
        return false; //nao ta cadastrado
    }
    
    public boolean VerificarAutenticidadeLogin(String email, String senha){
        for(Leitor l : invalidos){
            if(l.getEmail().equals(email)){
                return false;  //ta invalido
            }
        }
        for(Leitor l : validos){
            if(l.getEmail().equals(email) && l.getSenha().equals(senha)){
                return true;  //ta valido
            }
        }
        return false;  //nao ta cadastrado
    }

    
    public boolean VerificarPermissao(Leitor leitor){
        return leitor.VerificarMulta();
    }
    
    public boolean VerificarPermissaoCancelar(Leitor leitor){
        return !(leitor.VerificarMulta() == true || leitor.getEmprestimos() != null);
    }

    public ArrayList<Leitor> getValidos() {
        return validos;
    }

    public ArrayList<Leitor> getInvalidos() {
        return invalidos;
    }
    
    
}
