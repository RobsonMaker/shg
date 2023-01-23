/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "Produto.Todas", query = "SELECT p FROM Produto p" ),
    
    @NamedQuery(name = "Produto.porId", 
                query = "SELECT p FROM Produto p WHERE p.produto = :id_produto"),
        
    // consulta pra trazer todas as salas que possuem em sua descricao
    // o texto existente no parâmetro :desc
    @NamedQuery(name = "Produto.porNome", query = "SELECT p from Produto p WHERE p.nome_produto LIKE :nome_produto")
})

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "produto")
public class Produto implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private int produto;
    
    @Column(name = "nome_produto", length = 20)
    private String nome_produto;
    @Column(name = "descricao", length = 80)
    private String descricao;
    @Column(name = "qtd")
    private int qtd;
    @Column(name = "valor")
    private double valor;

    public Produto() {
    }

    public Produto(int produto, String nome_produto, String descricao, int qtd, double valor) {
        this.produto = produto;
        this.nome_produto = nome_produto;
        this.descricao = descricao;
        this.qtd = qtd;
        this.valor = valor;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    
    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.produto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.produto == other.produto;
    }

    @Override
    public String toString() {
        return "Produto{" + "produto=" + produto + ", nome_produto=" + nome_produto + ", descricao=" + descricao  + ", qtd=" + qtd + ", valor=" + valor + '}';
    }

   
 
}
