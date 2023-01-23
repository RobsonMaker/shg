/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Produto;
import modelo.Quarto;
import util.GerenciadorConexao;

/**
 *
 * @author aluno
 */
public class ControleQuarto {
    public void inserir(Quarto q) 
    {
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // inicia uma transação
        gerente.getTransaction().begin();
        
        // salvar a sala no banco de dados
        gerente.persist(q);
        
        // finaliza a transação
        gerente.getTransaction().commit();
        
        // finaliza a conexao com o banco
        gerente.close();
    }
    
    // método para excluir uma sala passada por parâmetro
    public void excluir(Quarto q)
    {
        //cria um entitymanager para as operações com banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // pegar o objeto do banco utilizando sua chave primária
        Quarto QuartoExcluir = gerente.find(Quarto.class, q.get_quarto());
        
        // iniciar uma transação
        gerente.getTransaction().begin();
        
        // excluir a sala do banco de dados
        gerente.remove(QuartoExcluir);
        
        // faz um commit na transação
        gerente.getTransaction().commit();
        
        // fecha a conexão
        gerente.close();
        
    }
    
    // método para sobrepor um registro na tabela
    // obs. a chave primária não pode ser alterada
    public void alterar(Quarto q)
    {
        // criar uma entitymanager
        EntityManager gerente = GerenciadorConexao.getGerente(); 
        gerente.getTransaction().begin();
        gerente.merge(q);
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Quarto> listarTodas()
    {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // criar um objeto do tipo Consulta
        TypedQuery<Quarto> consulta = 
                    gerente.createNamedQuery("Quarto.Todos", Quarto.class);
        
        // retorna a lista de objetos da consulta
        return consulta.getResultList();
        
    }
    
    public List<Quarto> listarPorTipo(String n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Quarto> consulta = gerente.createNamedQuery("Quarto.porTipo", Quarto.class);
        consulta.setParameter("tipo", "%" + n + "%");

        return consulta.getResultList();

    }
    
    public List<Quarto> listarPorId(int i) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Quarto> consulta = gerente.createNamedQuery("Quarto.porId", Quarto.class);
        consulta.setParameter("id_quarto", i);

        return consulta.getResultList();

    }
    
    public List<Quarto> listarPorStatus(String s) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Quarto> consulta = gerente.createNamedQuery("Quarto.porStatus", Quarto.class);
        consulta.setParameter("status", "%" + s + "%");

        return consulta.getResultList();

    }
  
    public List<Quarto> listarPorNumero(Integer n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Quarto> consulta = gerente.createNamedQuery("Quarto.porNumero", Quarto.class);
        consulta.setParameter("numero", "%" + n + "%");

        return consulta.getResultList();

    }
    
     public List<Quarto> listarSemUso() {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Quarto> consulta = gerente.createNamedQuery("Quarto.SemUso", Quarto.class);
       

        return consulta.getResultList();

    }
}
