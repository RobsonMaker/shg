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

@Entity
@Table(name = "ConsumoServico")
@IdClass(ConsumoServicoID.class)
public class ConsumoServico implements Serializable {
           
    
    @Id
    @ManyToOne
    @JoinColumn(name = "id_hospedagem", referencedColumnName = "id_hospedagem")
    private Hospedagem hospedagem;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "id_servico", referencedColumnName = "id_servico")
    private Servico servico;

    @Column(name = "quantidade")
    private int quantidade;

    @Column(name = "valor")
    private double preco;

    public ConsumoServico() {
    }

    public ConsumoServico( Hospedagem hospedagem, Servico servico, int quantidade, double preco) {
        
        this.hospedagem = hospedagem;
        this.servico = servico;
        this.quantidade = quantidade;
        this.preco = preco;
    }

   

    public Hospedagem getId_Hospedagem() {
        return hospedagem;
    }

    public void setId_Hospedagem(Hospedagem id_Hospedagem) {
        this.hospedagem = id_Hospedagem;
    }

    public Servico get_Servico() {
        return servico;
    }

    public void set_Servico(Servico id_servico) {
        this.servico = id_servico;
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
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.hospedagem);
        hash = 97 * hash + Objects.hashCode(this.servico);
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
        final ConsumoServico other = (ConsumoServico) obj;
        if (!Objects.equals(this.hospedagem, other.hospedagem)) {
            return false;
        }
        return Objects.equals(this.servico, other.servico);
    }

    

    @Override
    public String toString() {
        return "ItemConsumo{"+ " id_Hospedagem=" + hospedagem + ", id_Produto=" + servico + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
    
    
    
    
}
