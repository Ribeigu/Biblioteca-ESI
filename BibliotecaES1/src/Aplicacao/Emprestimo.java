/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacao;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Júlia
 */
public class Emprestimo {
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private LocalDate dataAtual;
    private String CPF;
    private boolean multa;

    public Emprestimo(){
        
    }
        
    public void FazerEmprestimo(String CPF, Livro livro){
        this.CPF = CPF;
        this.multa = false;
        this.livro = livro;
        CalcularDataDevolucao();
    }
    
    public void CalcularDataDevolucao(){
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(10);
    }
    
    public float CalcularMulta(){
        float valorMulta;
        dataAtual = LocalDate.now();
        float dias = ChronoUnit.DAYS.between(dataDevolucao, dataAtual);
        if(dias > 60){  
           valorMulta = 60*5;   //valor máximo que a multa pode assumir
        }else{
            valorMulta = dias*5;
        }
        return valorMulta;
    }
    
    public boolean verificaMulta(){
        dataAtual = LocalDate.now();
        if(dataAtual.isAfter(dataDevolucao) == true){
            return true;
        }
        return false;
    }
    
    public boolean getMulta() {
        multa = verificaMulta();
        return multa;
    }
    
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

}
