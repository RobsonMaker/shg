/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author aluno
 */
@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "ItemConsumo.Todos", query = "SELECT i FROM ItemConsumo i ORDER BY i.hospedagem.hospedagem"),
    @NamedQuery(name = "ItemConsumo.PorHospedagem", query = "SELECT i FROM ItemConsumo i WHERE i.hospedagem.hospedagem = :id_hospedagem")

})
@Entity
@Table(name = "itemConsumo")
@IdClass(ItemConsumoID.class)
public class ItemConsumo implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_hospedagem", referencedColumnName = "id_hospedagem")
    private Hospedagem hospedagem;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_produto", referencedColumnName = "id_produto")
    private Produto produto;

    @Column(name = "quantidade")
    private int quantidade;

    @Column(name = "preco")
    private double preco;

    public ItemConsumo() {
    }

    public ItemConsumo(int id, Hospedagem hospedagem, Produto produto, int quantidade, double preco) {

        this.hospedagem = hospedagem;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    

    public Produto getId_Produto() {
        return produto;
    }

    public void setId_Produto(Produto id_Produto) {
        this.produto = id_Produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.hospedagem);
        hash = 53 * hash + Objects.hashCode(this.produto);
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
        final ItemConsumo other = (ItemConsumo) obj;
        if (!Objects.equals(this.hospedagem, other.hospedagem)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

  

  

}
