/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author moorshk
 */
@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "Tipo.Todos", query = "SELECT t FROM Tipo t"),

    @NamedQuery(name = "Tipo.porId",
            query = "SELECT t FROM Tipo t WHERE t.id_tipo = :id_tipo"),

    // consulta pra trazer todas as salas que possuem em sua descricao
    // o texto existente no parâmetro :desc
    @NamedQuery(name = "Tipo.porNome",
            query = "SELECT t from Tipo t WHERE t.nome_tipo = :nome")
})

@Entity
@Table(name = "tipo")
public class Tipo implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private int id_tipo;
    @Column(name = "nome_tipo", length = 20)
    private String nome_tipo;
    @Column(name = "preco")
    private double preco;

    public Tipo() {
    }

    public Tipo(int id_tipo, String nome_tipo, double preco) {
        this.id_tipo = id_tipo;
        this.nome_tipo = nome_tipo;
        this.preco = preco;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getNome_tipo() {
        return nome_tipo;
    }

    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
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
        hash = 59 * hash + this.id_tipo;
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
        final Tipo other = (Tipo) obj;
        return this.id_tipo == other.id_tipo;
    }

    @Override
    public String toString() {
        return "Tipo{" + "id_tipo=" + id_tipo + ", nome_tipo=" + nome_tipo + ", preco=" + preco + '}';
    }
    
    
   
}
