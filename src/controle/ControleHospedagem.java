/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
//xyzt4321
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.ConsumoServico;
import modelo.Hospedagem;
import modelo.ItemConsumo;
import modelo.Quarto;
import util.GerenciadorConexao;

/**
 *
 * @author aluno
 */
public class ControleHospedagem {

    public void inserir(Hospedagem h) {
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
           
        
        // inicia uma transação
        gerente.getTransaction().begin();
        h.setListaConsumoServicos(null);
        h.setListaConsumoServicos(null);
        

        // salvar a sala no banco de dados
        gerente.persist(h);
        
        
        
        
        
        

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }


    // método para excluir uma sala passada por parâmetro
    public void excluir(Hospedagem h) {
        //cria um entitymanager para as operações com banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // pegar o objeto do banco utilizando sua chave primária
        Hospedagem hospedagemExcluir = gerente.find(Hospedagem.class, h.getHospedagem());

        // iniciar uma transação
        gerente.getTransaction().begin();

        // excluir a sala do banco de dados
        gerente.remove(hospedagemExcluir);

        // faz um commit na transação
        gerente.getTransaction().commit();

        // fecha a conexão
        gerente.close();

    }

    // método para sobrepor um registro na tabela
    // obs. a chave primária não pode ser alterada
    public void alterar(Hospedagem h) {
        // criar uma entitymanager
        EntityManager gerente = GerenciadorConexao.getGerente();
        gerente.getTransaction().begin();
        gerente.merge(h);
        gerente.getTransaction().commit();
        gerente.close();
    }

    public List<Hospedagem> listarTodas() {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta
                = gerente.createNamedQuery("Hospedagem.Todos", Hospedagem.class);

        // retorna a lista de objetos da consulta
        return consulta.getResultList();

    }

    public List<Hospedagem> listarPorNomeHospede(String n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta = gerente.createNamedQuery("Hospedagem.porHospede", Hospedagem.class);
        consulta.setParameter("nomeHospede", "%" + n + "%");

        return consulta.getResultList();

    }
    
     public List<Hospedagem> listarPorStatus(String s) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta = gerente.createNamedQuery("Hospedagem.porStatus", Hospedagem.class);
        consulta.setParameter("status", s);

        return consulta.getResultList();

    }
    
    

    public List<Hospedagem> listarPorCPFHospede(String c) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta = gerente.createNamedQuery("Hospedagem.porHospedeCpf", Hospedagem.class);
        consulta.setParameter("cpfHospede", "%" + c + "%");

        return consulta.getResultList();

    }
    
     public List<Hospedagem> listarPorNomeFuncionario(String n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta = gerente.createNamedQuery("Hospedagem.porFuncionarioNome", Hospedagem.class);
        consulta.setParameter("nomeFuncionario", "%" + n + "%");

        return consulta.getResultList();

    }
     
      public List<Hospedagem> listarPorNumeroQuarto(Integer n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta = gerente.createNamedQuery("Hospedagem.porQuartoNumero", Hospedagem.class);
        consulta.setParameter("numeroQuarto", "%" + n + "%");

        return consulta.getResultList();

    }
    
    public List<Hospedagem> listarPorData(Date d) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta = gerente.createNamedQuery("Hospedagem.porData", Hospedagem.class);
        consulta.setParameter("data", d);

        return consulta.getResultList();

    }
    
     public List<Hospedagem> listarEmAtraso(Date d) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta = gerente.createNamedQuery("Hospedagem.porEmAtraso", Hospedagem.class);
        consulta.setParameter("data" ,d);

        return consulta.getResultList();

    }
     
     public List<Hospedagem> listarEncerraHoje(Date d) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta = gerente.createNamedQuery("Hospedagem.porFechadaHoje", Hospedagem.class);
        consulta.setParameter("data" ,d);

        return consulta.getResultList();

    }
    
      public List<Hospedagem> listarPorId(int id) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospedagem> consulta = gerente.createNamedQuery("Hospedagem.porId", Hospedagem.class);
        consulta.setParameter("id_hospedagem" ,id);

        return consulta.getResultList();

    }
      
      public List<ItemConsumo> listarItemConsumo() {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<ItemConsumo> consulta = gerente.createNamedQuery("ItemConsumo.Todos", ItemConsumo.class);
        

        return consulta.getResultList();

    }
    
    public double CalcularPrecoiaria(Quarto q, long qtd,List<ConsumoServico>servicos,List<ItemConsumo>item){
        double ValorTot = 0;       
        double valorTotServicos = 0;
        double valorTotalProduto = 0;
        //System.out.println(servicos);
        
        for (ConsumoServico s : servicos) {
            valorTotServicos = valorTotServicos + (s.getPreco()*s.getQuantidade());
            
        }
        
         for (ItemConsumo i : item) {
            valorTotalProduto = valorTotalProduto + (i.getPreco()*i.getQuantidade());
            
        }
   
        
        
        
        ValorTot = (ValorTot + q.getTipo().getPreco()*qtd)+ valorTotServicos + valorTotalProduto;
        
        return ValorTot;
    }
}
