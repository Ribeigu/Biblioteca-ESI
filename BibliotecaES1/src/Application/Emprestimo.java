/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
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
    private Leitor leitor;
    private float multa;

    public Emprestimo(){
        
    }
    
    public Emprestimo(Livro livro, Leitor leitor, float multa) {
        this.livro = livro;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = dataEmprestimo.plusDays(10);
        this.leitor = leitor;
        this.multa = multa;
    }
    
    //é a Biblioteca que coloca um empréstimo no catálogo
    
    public boolean atualizaEmprestimo(){
        boolean bool = verificaMulta();
        if(bool == true){
            return false;
        }
        dataAtual = LocalDate.now();
        dataDevolucao = dataAtual.plusDays(10);
        return true;
    }
    
    public boolean verificaMulta(){
        dataAtual = LocalDate.now();
        if(dataAtual.isAfter(dataDevolucao)){
            return true;
        }
        return false;
    }
    
    public float calculaMulta(){
        dataAtual = LocalDate.now();
        float dias = ChronoUnit.DAYS.between(dataDevolucao, dataAtual);
        if(dias > 60){  
           multa = 60*5;   //valor máximo que a multa pode assumir
        }else{
            multa = dias*5;
        }
        return multa;
    }
    
    public float getMulta() {
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

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }    
}
