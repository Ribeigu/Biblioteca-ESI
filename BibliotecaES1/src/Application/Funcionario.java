/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

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
    @Override
    public boolean login(String email, String senha){
        Funcionario funcionario = catalogoFuncionario.buscaEmail(email);
        if(funcionario==null) return false;
        String senhaFuncionario = funcionario.getSenha();
        if(senha!=senhaFuncionario) return false;
        return true;
    }
} 
