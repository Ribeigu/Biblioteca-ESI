/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

/**
 *
 * @author Júlia
 */
public class Gerente extends Funcionario{
    
    public Gerente(){
        
    }

    public Gerente(String nome, String senha, String CPF, String email, String endereco, int dataDeNascimento, String telefone) {
        super(nome, senha, CPF, email, endereco, dataDeNascimento, telefone);
        status = EnumTipo.GERENTE; 
    }
   
    
}
