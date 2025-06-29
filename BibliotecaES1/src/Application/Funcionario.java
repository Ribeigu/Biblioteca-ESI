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
    protected EnumTipo status;
    
    public Funcionario(){
        
    }

    public Funcionario(String nome, String senha, String CPF, String email, String endereco, int dataDeNascimento, String telefone) {
        super(nome, senha, CPF, email, endereco, dataDeNascimento, telefone);
        status = EnumTipo.FUNCIONARIO;
    }

    public EnumTipo getStatus() {
        return status;
    }

    public void setStatus(EnumTipo status) {
        this.status = status;
    }
    
}
