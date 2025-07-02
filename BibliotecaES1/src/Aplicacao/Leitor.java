/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicacao;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author Júlia
 */
public class Leitor extends Usuario{
    private ArrayList<Emprestimo> emprestimos;
    private ArrayList<Emprestimo> emprestimosAtrasados;
    private ArrayList<Reserva> reservas;
    private float multa;

    public Leitor(){
        
    }

    public Leitor(String nome, String senha, String CPF, String email, String endereco, LocalDate dataDeNascimento, String telefone) {
        super(nome, senha, CPF, email, endereco, dataDeNascimento, telefone);
        this.emprestimosAtrasados = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.multa = 0;
    }

    public void AdicionarReserva(Reserva reserva){
        reservas.add(reserva);
    }
    
    public void RemoverReserva(Reserva reserva){
        reservas.remove(reserva);
    }
    
    public void AdicionarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
    
    public void RemoverEmprestimo(Emprestimo emprestimo){
        emprestimos.remove(emprestimo);
    }
    
    public void AdicionarEmprestimosAtrasados(ArrayList<Emprestimo> emprestimos, float multa){
        for(Emprestimo e : emprestimos){
            emprestimosAtrasados.add(e);
        }
        this.multa = multa;
    }
    
    public ArrayList<Emprestimo> RemoverEmprestimosAtrasados(){
        ArrayList<Emprestimo> aux = emprestimosAtrasados;
        emprestimosAtrasados.clear();
        return aux;
    }
    
    public boolean VerificarMulta(){
        for(Emprestimo e : emprestimos){
            if(e.getMulta() == true){
                return true;
            }
        }
        return false;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public ArrayList<Emprestimo> getEmprestimosAtrasados() {
        return emprestimosAtrasados;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
    public float getMulta(){
        return multa;
    }
}
