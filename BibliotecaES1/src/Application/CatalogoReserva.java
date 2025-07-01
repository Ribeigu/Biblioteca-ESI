/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class CatalogoReserva {
    private ArrayList<Reserva> reservas;
    
    private CatalogoReserva() {
        reservas = new ArrayList<>();
    }
    private static CatalogoReserva instancia;
    
    public static CatalogoReserva getInstancia(){
        if(instancia==null) instancia = new CatalogoReserva();
        return instancia;
    }
   
    public void AdicionarReserva(Reserva reserva){
        reservas.add(reserva);
    }
    
    public Livro RemoverReserva(Reserva reserva){
        Livro aux = reserva.getLivro();
        reservas.remove(reserva);
        return aux;
    }
    
    public Livro RemoverReservaLivro(String tombo){
        for(Reserva r : reservas){
            if(r.getLivro().getTombo().equals(tombo)){
                Livro aux = r.getLivro();
                reservas.remove(r);
                return aux;
            }
        }
        return null;
    }
    
    public Reserva RemoverReserva(String tombo){
        for(Reserva r : reservas){
            if(r.getLivro().getTombo().equals(tombo)){
                reservas.remove(r);
                return r;
            }
        }
        return null;
    }
    
    
    public Reserva VerificarExistenciaReserva(String ISBN, String CPF){
        for(Reserva r : reservas){
            if(r.getCPF().equals(CPF) && r.getLivro().getISBN().equals(ISBN)){
                return r;
            }
        }
        return null;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }
    
}
