/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicacao;
import Interface.TelaBiblioteca;
import javax.swing.SwingUtilities;
/**
 *
 * @author gusta
 */
public class Biblioteca {
import Interface.TelaBiblioteca;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var Biblioteca = ControladorBiblioteca.getInstancia();
        Biblioteca.Instanciar();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Cria uma instância da sua tela
               TelaBiblioteca tela = new TelaBiblioteca();
                
                // Torna a tela visível
                tela.setVisible(true);
            }
        });
    }
    
}
