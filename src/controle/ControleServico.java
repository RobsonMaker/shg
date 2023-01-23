/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Quarto;
import modelo.Servico;
import util.GerenciadorConexao;

/**
 *
 * @author aluno
 */
public class ControleServico {
    public void inserir(Servico s) 
    {
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // inicia uma transação
        gerente.getTransaction().begin();
        
        // salvar a sala no banco de dados
        gerente.persist(s);
        
        // finaliza a transação
        gerente.getTransaction().commit();
        
        // finaliza a conexao com o banco
        gerente.close();
    }
    
    // método para excluir uma sala passada por parâmetro
    public void excluir(Servico s)
    {
        //cria um entitymanager para as operações com banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // pegar o objeto do banco utilizando sua chave primária
        Servico ServicoExcluir = gerente.find(Servico.class, s.get_servico());
        
        // iniciar uma transação
        gerente.getTransaction().begin();
        
        // excluir a sala do banco de dados
        gerente.remove(ServicoExcluir);
        
        // faz um commit na transação
        gerente.getTransaction().commit();
        
        // fecha a conexão
        gerente.close();
        
    }
    
    // método para sobrepor um registro na tabela
    // obs. a chave primária não pode ser alterada
    public void alterar(Servico s)
    {
        // criar uma entitymanager
        EntityManager gerente = GerenciadorConexao.getGerente(); 
        gerente.getTransaction().begin();
        gerente.merge(s);
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Servico> listarTodas()
    {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // criar um objeto do tipo Consulta
        TypedQuery<Servico> consulta = 
                    gerente.createNamedQuery("Servico.Todos", Servico.class);
        
        // retorna a lista de objetos da consulta
        return consulta.getResultList();
        
    }
    
    public List<Servico> listarPorNome(String n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Servico> consulta = gerente.createNamedQuery("Servico.porNome", Servico.class);
        consulta.setParameter("servico", "%" + n + "%");

        return consulta.getResultList();

    }
}
