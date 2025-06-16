/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

/**
 *
 * @author Júlia
 */
public class Usuario {
    private String nome;
    private String CPF;
    private String email;
    private String endereco;
    private String senha;
    private int dataDeNascimento;
    private String telefone;
    private EnumTipo status;
    
    public Usuario(){
        
    }

    public Usuario(String nome, String CPF, String email, String endereco, int dataDeNascimento, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.endereco = endereco;
        this.dataDeNascimento = dataDeNascimento;
        this.telefone = telefone;
        this.status = EnumTipo.VALIDO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(int dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public EnumTipo getStatus() {
        return status;
    }

    public void setStatus(EnumTipo status) {
        this.status = status;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public boolean login(String email, String senha){
        return true;
    }
    
    
}
