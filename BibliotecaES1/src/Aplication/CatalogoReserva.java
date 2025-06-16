/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplication;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class CatalogoReserva {
    private ArrayList<Reserva> reservas;
    private CatalogoReserva() {}
    private static CatalogoReserva instancia;
    
    public static CatalogoReserva getInstancia(){
        if(instancia==null) instancia = new CatalogoReserva();
        return instancia;
    }
    
    
    public Reserva busca(int posicao){
        return reservas.get(posicao);
    }
    
    public int tamanhoReservas(){
        return reservas.size();
    }
    
    public void adicionarReserva(Reserva reserva){
        reservas.add(reserva);
    }
}
