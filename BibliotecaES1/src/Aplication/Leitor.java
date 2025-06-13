/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaes1;
import java.util.ArrayList;

/**
 *
 * @author Júlia
 */
public class Leitor extends Usuario{
    private ArrayList<Livro> livros;
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Reserva> reservas;

    public Leitor(){
        
    }

    public Leitor(ArrayList<Livro> livros, ArrayList<Emprestimo> emprestimos, ArrayList<Reserva> reservas, String nome, String CPF, String email, String endereco, int dataDeNascimento, String telefone) {
        super(nome, CPF, email, endereco, dataDeNascimento, telefone);
        this.livros = new ArrayList<Livro>();
        this.emprestimos = new ArrayList<Emprestimo>();
        this.reservas = new ArrayList<Reserva>();
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
}
