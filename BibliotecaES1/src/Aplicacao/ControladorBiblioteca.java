//*
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 //*/
package Aplicacao;
import java.util.ArrayList;
import java.time.LocalDate;
 
/**
 *
 * @author Júlia
 */
public class ControladorBiblioteca {
    //catalogos
    private CatalogoLivros catalogoLivros;
    private CatalogoExemplar catalogoExemplar;
    private CatalogoLeitor catalogoLeitor;
    private CatalogoFuncionario catalogoFuncionario;
    private CatalogoEmprestimo catalogoEmprestimo;
    private CatalogoReserva catalogoReserva;
    
    public ControladorBiblioteca(){
        
    }
    
    public void FazerRegistroLivro(String titulo, ArrayList<String> autores, int edicao, String ISBN, ArrayList<EnumGeneros> generos){
        int quantidade = catalogoLivros.VerificarQuantidade(ISBN);
        String tombo = CalcularTombo(ISBN, quantidade);
        Livro livro = new Livro(titulo, ISBN, edicao, autores, tombo, generos);
        if(catalogoLivros.BuscarCatalogoExemplar(ISBN) == false){
            CatalogoExemplar novoCatalogoExemplar = new CatalogoExemplar(ISBN);
            catalogoLivros.AdicionarCatalogoExemplar(novoCatalogoExemplar);
        }
        catalogoLivros.AdicionarExemplar(livro);
    }
    
    public String CalcularTombo(String ISBN, int quantidade){
        quantidade = quantidade + 1;
        String tombo = ISBN.concat(Integer.toString(quantidade));
        return tombo;
    }

    public boolean FazerCadastroLeitor(String nome, String email, String CPF, String senha, String telefone, String endereco, LocalDate dataDeNascimento){
        if(catalogoLeitor.VerificarAutenticidade(email) == false){
            return false;
        }
        Leitor leitor = new Leitor(nome, senha, CPF, email, endereco, dataDeNascimento, telefone);
        catalogoLeitor.AdicionarLeitor(leitor);
        return true;
    }
    
    public boolean FazerCadastroFuncionario(String nome, String email, String CPF, String senha, String telefone, String endereco, LocalDate dataDeNascimento){
        if(catalogoFuncionario.VerificarAutenticidade(email) == false){
            return false;
        }
        Funcionario funcionario = new Funcionario(nome, senha, CPF, email, endereco, dataDeNascimento, telefone);
        catalogoFuncionario.AdicionarFuncionario(funcionario);
        return true;
    }
   
    public boolean FazerLoginLeitor(String email, String senha){
        return catalogoLeitor.VerificarAutenticidadeLogin(email, senha);
    }
    
    public boolean FazerLoginFuncionario(String email, String senha){
        return catalogoFuncionario.VerificarAutenticidadeLogin(email, senha);
    } 
    
    public boolean ReservarLivro(Livro livro, Leitor leitor){
        if(catalogoLivros.VerificarDisponibilidade(livro.getISBN()) == false){
            return false;
        }
        livro.AtualizarDiponibilidade(EnumDisponibilidade.RESERVADO);
        Reserva reserva = new Reserva(livro, leitor.getCPF());
        catalogoReserva.AdicionarReserva(reserva);
        leitor.AdicionarReserva(reserva);
        EnviarEmailPrazo(leitor.getEmail(), reserva.getDataExpiracao());
        return true;
    }
    
    public void EnviarEmailPrazo(String email, LocalDate dataExpiracao){
        //aqui deveria ser feito o código para o envio de email contendo o prazo da reserva
    }
    
    public boolean RenovarEmpestimo(Livro livro){
        if(catalogoLivros.VerificarDisponibilidade(livro.getISBN()) == false){
            return false;
        }
        Emprestimo emprestimo = catalogoEmprestimo.BuscarEmprestimo(livro);
        emprestimo.CalcularDataDevolucao();
        Leitor leitor = catalogoLeitor.BuscarLeitor(emprestimo.getCPF());
        EnviarReciboRenovacao(leitor.getEmail(), emprestimo);
        return true;
    }
    
    public void EnviarReciboRenovacao(String email, Emprestimo emprestimo){
        //aqui deveria ser feito o código para o envio de email contendo a nova data de devolucao
    }
    
    public boolean Emprestar(String CPF){
        Leitor leitor = catalogoLeitor.BuscarLeitor(CPF);
        if(leitor == null){
            return false;
        }
        catalogoLeitor.VerificarPermissao(leitor);
        return true;
    }
    
    public boolean FazerEmprestimoLivro(String CPF, String ISBN, String tombo){
        Reserva reserva = catalogoReserva.VerificarExistenciaReserva(ISBN, CPF);
        
        if(reserva == null){
            if(catalogoLivros.VerificarDisponibilidade(ISBN) == false){
                return false;
            }
            Livro livro = catalogoExemplar.BuscarLivro(tombo);
            livro.AtualizarDiponibilidade(EnumDisponibilidade.EMPRESTADO);
            Emprestimo emprestimo = new Emprestimo();
            emprestimo.FazerEmprestimo(CPF, livro);
            Leitor leitor = catalogoLeitor.BuscarLeitor(CPF);
            leitor.AdicionarEmprestimo(emprestimo);
            catalogoEmprestimo.AdicionarEmprestimo(emprestimo);
            EnviarReciboEmprestimo(leitor.getEmail(), emprestimo);
            return true;
        } 
        Livro livro = catalogoReserva.RemoverReserva(reserva);
        livro.AtualizarDiponibilidade(EnumDisponibilidade.EMPRESTADO);
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.FazerEmprestimo(CPF, livro);
        Leitor leitor = catalogoLeitor.BuscarLeitor(CPF);
        leitor.AdicionarEmprestimo(emprestimo);
        leitor.RemoverReserva(reserva);
        catalogoEmprestimo.AdicionarEmprestimo(emprestimo);
        EnviarReciboEmprestimo(leitor.getEmail(), emprestimo);
        return true;
    }
    
    public void EnviarReciboEmprestimo(String email, Emprestimo emprestimo){
        //aqui deveria ser feito o código para o envio do email contendo a data de emprestimo e de devolucao
    }
    
    //se voltar um true, significa que o leitor possui multa
    public boolean DevolverLivro(String ISBN, String tombo){
        Livro livro = catalogoLivros.BuscarLivro(ISBN, tombo);
        Emprestimo emprestimo = catalogoEmprestimo.BuscarEmprestimo(livro);
        catalogoEmprestimo.AdicionarDevolucao(emprestimo);
        Leitor leitor = catalogoLeitor.BuscarLeitor(emprestimo.getCPF());
        leitor.RemoverEmprestimo(emprestimo);
        livro.AtualizarDiponibilidade(EnumDisponibilidade.DISPONIVEL);
        boolean multa = leitor.VerificarMulta();
        EnviarReciboDevolucao(leitor.getEmail());
        return multa;
    }
    
    public void EnviarReciboDevolucao(String email){
        //aqui deveria ser feito o código para o envio do email confirmando a devolucao
    }
    
    public boolean CancelarContaLeitor(Leitor leitor){
        if(catalogoLeitor.VerificarPermissaoCancelar(leitor) == false){
            return false;
        }
        catalogoLeitor.AdicionarLeitorInvalido(leitor);
        return true;
    }
    
    public void CancelarContaFuncionario(Funcionario funcionario){
        catalogoFuncionario.AdicionarFuncionarioInvalido(funcionario);
    }
    
    public void CancelarReserva(Livro livro){
        Reserva reserva = catalogoReserva.RemoverReserva(livro.getTombo());
        livro.AtualizarDiponibilidade(EnumDisponibilidade.DISPONIVEL);
        Leitor leitor = catalogoLeitor.BuscarLeitor(reserva.getCPF());
        leitor.RemoverReserva(reserva);
    }
    
    public float PagarMulta(String CPF){
        float preco = 0;
        ArrayList<Emprestimo> emprestimos = catalogoEmprestimo.BuscarEmprestimosAtrasados(CPF);
        for(Emprestimo e : emprestimos){
            preco = preco + e.CalcularMulta();
        }
        Leitor leitor = catalogoLeitor.BuscarLeitor(CPF);
        leitor.AdicionarEmprestimosAtrasados(emprestimos, preco);
        return preco;
    }
    
    public float EfetuarPagamento(String CPF, float valor){
        Leitor leitor = catalogoLeitor.BuscarLeitor(CPF);
        float troco = CalcularTroco(leitor, valor);
        if(troco == -1){
            leitor.RemoverEmprestimosAtrasados();
            return -1;
        }
        ArrayList<Emprestimo> emprestimos = leitor.RemoverEmprestimosAtrasados();
        for(Emprestimo e : emprestimos){
            catalogoEmprestimo.AdicionarDevolucao(e);
            leitor.RemoverEmprestimo(e);
        }
        return troco;
    }
    
    public float CalcularTroco(Leitor leitor, float valor){
        float troco;
        if((troco = leitor.getMulta() - valor) >= 0){
            return troco;
        }
        return -1;
    }    
    
    public boolean VerificarSeEGerente(String email){
        return catalogoFuncionario.VerificarSeEGerente(email);
    }
}
