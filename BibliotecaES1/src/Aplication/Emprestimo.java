/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaes1;

/**
 *
 * @author Júlia
 */
public class Emprestimo {
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private Leitor leitor;
    private boolean multa;

    public Emprestimo(){
        
    }
    
    public Emprestimo(Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao, Leitor leitor, boolean multa) {
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.leitor = leitor;
        this.multa = multa;
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

    public boolean isMulta() {
        return multa;
    }

    public void setMulta(boolean multa) {
        this.multa = multa;
    }
    
    //adicionar emprestimo no catálogo
    public void criarEmprestimo(int tombo, String CPF){
        
    }
    
    public void atualizarEmprestimo(int tombo){
        
    }
    
    public void fazerDevolucao(int tombo){
        
    }
    
    public void calcularMulta(int tombo){
        
    }
    
    
}
