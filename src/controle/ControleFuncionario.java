/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Funcionario;
import modelo.Hospede;
import modelo.Quarto;
import util.GerenciadorConexao;

/**
 *
 * @author aluno
 */
public class ControleFuncionario {
      public void inserir(Funcionario f) 
    {
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // inicia uma transação
        gerente.getTransaction().begin();
        
        // salvar a sala no banco de dados
        gerente.persist(f);
        
        // finaliza a transação
        gerente.getTransaction().commit();
        
        // finaliza a conexao com o banco
        gerente.close();
    }
    
    // método para excluir uma sala passada por parâmetro
    public void excluir(Funcionario f)
    {
        //cria um entitymanager para as operações com banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // pegar o objeto do banco utilizando sua chave primária
        Funcionario funcionarioExcluir = gerente.find(Funcionario.class, f.getFuncionario());
        
        // iniciar uma transação
        gerente.getTransaction().begin();
        
        // excluir a sala do banco de dados
        gerente.remove(funcionarioExcluir);
        
        // faz um commit na transação
        gerente.getTransaction().commit();
        
        // fecha a conexão
        gerente.close();
        
    }
    
    // método para sobrepor um registro na tabela
    // obs. a chave primária não pode ser alterada
    public void alterar(Funcionario f)
    {
        // criar uma entitymanager
        EntityManager gerente = GerenciadorConexao.getGerente(); 
        gerente.getTransaction().begin();
        gerente.merge(f);
        gerente.getTransaction().commit();
        gerente.close();
    }
    
    public List<Funcionario> listarTodas()
    {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // criar um objeto do tipo Consulta
        TypedQuery<Funcionario> consulta = 
                    gerente.createNamedQuery("Funcionario.Todos", Funcionario.class);
        
        // retorna a lista de objetos da consulta
        return consulta.getResultList();
        
    }
    
    public List<Funcionario> listarPorNome(String n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Funcionario> consulta = gerente.createNamedQuery("Funcionario.porNome", Funcionario.class);
        consulta.setParameter("nome_funcionario", "%" + n + "%");

        return consulta.getResultList();

    }
    
    public List<Funcionario> listarPorCPF(String c) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Funcionario> consulta = gerente.createNamedQuery("Funcionario.porCPF", Funcionario.class);
        consulta.setParameter("id_funcionario", "%" + c + "%");

        return consulta.getResultList();

    }
    public Funcionario buscarUsuario(String u) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Funcionario> consulta = gerente.createNamedQuery("Funcionario.porUsuario", Funcionario.class);
        consulta.setParameter("usuario",  u );
        try {
          return consulta.getSingleResult();
        } catch(Exception e) {
          return null;     
        }
    }
}
