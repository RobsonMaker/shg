/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Produto;
import util.GerenciadorConexao;

/**
 *
 * @author aluno
 */
public class ControleProduto {
    // método para inserir uma sala no banco de dados

    public void inserir(Produto p) {
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();

        // inicia uma transação
        gerente.getTransaction().begin();

        // salvar a sala no banco de dados
        gerente.persist(p);

        // finaliza a transação
        gerente.getTransaction().commit();

        // finaliza a conexao com o banco
        gerente.close();
    }

    // método para excluir uma sala passada por parâmetro
    public void excluir(Produto p) {
        //cria um entitymanager para as operações com banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // pegar o objeto do banco utilizando sua chave primária
        Produto produtoExcluir = gerente.find(Produto.class, p.getProduto());

        // iniciar uma transação
        gerente.getTransaction().begin();

        // excluir a sala do banco de dados
        gerente.remove(produtoExcluir);

        // faz um commit na transação
        gerente.getTransaction().commit();

        // fecha a conexão
        gerente.close();

    }

    // método para sobrepor um registro na tabela
    // obs. a chave primária não pode ser alterada
    public void alterar(Produto p) {
        // criar uma entitymanager
        EntityManager gerente = GerenciadorConexao.getGerente();
        gerente.getTransaction().begin();
        gerente.merge(p);
        gerente.getTransaction().commit();
        gerente.close();
    }

    public List<Produto> listarTodas() {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Produto> consulta
                = gerente.createNamedQuery("Produto.Todas", Produto.class);

        // retorna a lista de objetos da consulta
        return consulta.getResultList();

    }

    public List<Produto> listarPorNome(String n) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<Produto> consulta = gerente.createNamedQuery("Produto.porNome", Produto.class);
        consulta.setParameter("nome_produto", "%" + n + "%");

        return consulta.getResultList();

    }
}
