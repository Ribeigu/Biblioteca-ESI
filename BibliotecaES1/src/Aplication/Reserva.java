/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gusta
 */
public class Reserva {
    private Livro livro;
    private LocalDate dataExpiracao;
    private Leitor leitor;

    public Reserva(Livro livro, Leitor leitor) {
        this.livro = livro;
        this.dataExpiracao = LocalDate.now();
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getDataExpiracao() {
        return dataExpiracao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setDataExpiracao(LocalDate dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }
    
    public void criarReserva(Leitor leitor, Livro livro ){
        Reserva reserva = new Reserva(leitor, livro);
        CatalogoReserva aux = CatalogoReserva.getInstancia();
        aux.adicionarReserva(reserva);  
    }
}
