/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Tipo;

import util.GerenciadorConexao;

/**
 *
 * @author moorshk
 */
public class ControleTipo {
     public void inserir(Tipo t) 
    {
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // inicia uma transação
        gerente.getTransaction().begin();
        
        // salvar a sala no banco de dados
        gerente.persist(t);
        
        // finaliza a transação
        gerente.getTransaction().commit();
        
        // finaliza a conexao com o banco
        gerente.close();
    }
    
    // método para excluir uma sala passada por parâmetro
    public void excluir(Tipo t)
    {
        //cria um entitymanager para as operações com banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // pegar o objeto do banco utilizando sua chave primária
        Tipo TipoExcluir = gerente.find(Tipo.class, t.getId_tipo());
        
        // iniciar uma transação
        gerente.getTransaction().begin();
        
        // excluir a sala do banco de dados
        gerente.remove(TipoExcluir);
        
        // faz um commit na transação
        gerente.getTransaction().commit();
        
        // fecha a conexão
        gerente.close();
        
    }
    
    // método para sobrepor um registro na tabela
    // obs. a chave primária não pode ser alterada
    public void alterar(Tipo t)
    {
        // criar uma entitymanager
        EntityManager gerente = GerenciadorConexao.getGerente(); 
        gerente.getTransaction().begin();
        gerente.merge(t);
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Tipo> listarTodos()
    {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // criar um objeto do tipo Consulta
        TypedQuery<Tipo> consulta = 
                    gerente.createNamedQuery("Tipo.Todos", Tipo.class);
        
        // retorna a lista de objetos da consulta
        return consulta.getResultList();
        
    }
    
    public List<Tipo> listarPorNome(String n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Tipo> consulta = gerente.createNamedQuery("Tipo.porNome",Tipo.class);
        consulta.setParameter("nome", n );

        return consulta.getResultList();

    }
}
