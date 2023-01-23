/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Hospede;
import modelo.Quarto;
import util.GerenciadorConexao;

/**
 *
 * @author aluno
 */
public class ControleHospede {
      public void inserir(Hospede h) 
    {
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // inicia uma transação
        gerente.getTransaction().begin();
        
        // salvar a sala no banco de dados
        gerente.persist(h);
        
        // finaliza a transação
        gerente.getTransaction().commit();
        
        // finaliza a conexao com o banco
        gerente.close();
    }
    
    // método para excluir uma sala passada por parâmetro
    public void excluir(Hospede h)
    {
        //cria um entitymanager para as operações com banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // pegar o objeto do banco utilizando sua chave primária
        Hospede hospedeExcluir = gerente.find(Hospede.class, h.getHospede());
        
        // iniciar uma transação
        gerente.getTransaction().begin();
        
        // excluir a sala do banco de dados
        gerente.remove(hospedeExcluir);
        
        // faz um commit na transação
        gerente.getTransaction().commit();
        
        // fecha a conexão
        gerente.close();
        
    }
    
    // método para sobrepor um registro na tabela
    // obs. a chave primária não pode ser alterada
    public void alterar(Hospede h)
    {
        // criar uma entitymanager
        EntityManager gerente = GerenciadorConexao.getGerente(); 
        gerente.getTransaction().begin();
        gerente.merge(h);
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Hospede> listarTodas()
    {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // criar um objeto do tipo Consulta
        TypedQuery<Hospede> consulta = 
                    gerente.createNamedQuery("Hospede.Todos", Hospede.class);
        
        // retorna a lista de objetos da consulta
        return consulta.getResultList();
        
    }
    
    public List<Hospede> listarPorNome(String n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospede> consulta = gerente.createNamedQuery("Hospede.porNome", Hospede.class);
        consulta.setParameter("nome_hospede", "%" + n + "%");

        return consulta.getResultList();

    }
    
    public List<Hospede> listarPorCPF(String c) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospede> consulta = gerente.createNamedQuery("Hospede.porCPF", Hospede.class);
        consulta.setParameter("id_hospede", "%" + c + "%");

        return consulta.getResultList();

    }
    
    public List<Hospede> listarPorId(int i) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Hospede> consulta = gerente.createNamedQuery("Hospede.porId", Hospede.class);
        consulta.setParameter("hospede_id", i);

        return consulta.getResultList();

    }
}
