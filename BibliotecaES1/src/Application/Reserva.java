/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gusta
 */
public class Reserva {
    private Livro livro;
    private LocalDate dataExpiracao;
    private String CPF;

    public Reserva(){
        
    }

    public Reserva(Livro livro, String CPF) {
        this.livro = livro;
        this.CPF = CPF;
        this.dataExpiracao = LocalDate.now().plusDays(3);
    }
    
    public boolean VerificarValidade(){
        LocalDate diaAtual = LocalDate.now();
        return !diaAtual.isAfter(dataExpiracao);
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }
    
    
}