//*
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 //*/
package Application;
import java.util.ArrayList;

/**
 *
 * @author Júlia
 */
public class ControladorBiblioteca {
    //auxiliares
    private Livro livro;    
    private Leitor leitor;
    private Funcionario funcionario;
    private Emprestimo emprestimo;
    private Reserva reserva;
    //catalogos
    private CatalogoLivros catalogoLivros;
    private CatalogoExemplar catalogoExemplar;
    private CatalogoLeitor catalogoLeitor;
    private CatalogoFuncionario catalogoFuncionario;
    private CatalogoEmprestimo catalogoEmprestimo;
    private CatalogoReserva catalogoReserva;
    
    public ControladorBiblioteca(){
        
    }
    
    public void FazerRegistroLivro(String titulo, ArrayList<String> autores, int edicao, int ISBN, ArrayList<EnumGeneros> generos){
        
    }
    
    public int CalcularTombo(int quantidade){
        
    }
    
    public Livro CriarLivro(String titulo, ArrayList<String> autores, int edicao, int ISBN, ArrayList<EnumGeneros> generos, int tombo){
        
    } 
    
    public boolean FazerCadastroLeitor(String nome, String email, String CPF, String senha, String telefone, int dataDeNascimendo){
        
    }
    
    public boolean FazerCadastroFuncionario(String nome, String email, String CPF, String senha, String telefone, int dataDeNascimendo){
        
    }
    
    public Leitor CriarLeitor(String nome, String email, String CPF, String senha, String telefone, int dataDeNascimendo){
        
    }
    
    public Funcionario CriarFuncionario(String nome, String email, String CPF, String senha, String telefone, int dataDeNascimendo){
        
    }
    
    public boolean FazerLoginLeitor(String email, String senha){
        
    }
    
    public boolean FazerLoginFuncionario(String email, String senha){
        
    }
    
    public boolean ReservarLivro(Livro livro, Leitor leitor){
        
    }
    
    public Reserva CriarReserva(Livro livro, String CPF){
        
    }
    
    public void EnviarEmailPrazo(String email){
        
    }
    
    public boolean RenovarEmpestimo(Livro livro){
        
    }
    
    public void EnviarReciboRenovacao(String email){
        
    }
    
    public Leitor Emprestar(String CPF){
        
    }
    
    public Emprestimo CriarEmprestimo(String CPF){
        
    }
    
    public boolean FazerEmprestimoLivro(int ISBN, int tombo){
        
    }
    
    public void EnviarReciboEmprestimo(String email){
        
    }
    
    public boolean DevolverLivro(int tombo){
        
    }
    
    public void EnviarReciboDevolucao(String email){
        
    }
    
    public boolean CancelarContaLeitor(Leitor leitor){
        
    }
    
    public boolean CancelarContaFuncionario(Funcionario funcionario){
        
    }
    
    public boolean CancelarReserva(Livro livro){
        
    }
    
    public float PagarMulta(String CPF){
        
    }
    
    public float CalcularTotalMulta(String CPF){
        
    }
    
    public boolean EfetuarPagamento(float valor){
        
    }
    
    public float CalcularTroco(float valor){
        
    }
    
    public void CriarCatalogoExemplar(int ISBN){
        
    }
    
    
}
