/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaes1;

/**
 *
 * @author Júlia
 */
public class Funcionario extends Usuario{
    
    public Funcionario(){
        
    }

    public Funcionario(String nome, String CPF, String email, String endereco, int dataDeNascimento, String telefone) {
        super(nome, CPF, email, endereco, dataDeNascimento, telefone);
    }
    
    public void fazerEmprestimo(int tombo, String CPF){
        
        
    }
}
