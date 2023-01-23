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
    @NamedQuery(name = "Servico.Todos", query = "SELECT s FROM Servico s"),

    @NamedQuery(name = "Servico.porId",
            query = "SELECT s FROM Servico s WHERE s.servico = :id_servico"),

    // consulta pra trazer todas as salas que possuem em sua descricao
    // o texto existente no parâmetro :desc
    @NamedQuery(name = "Servico.porNome",
            query = "SELECT s from Servico s WHERE s.nome_servico LIKE :servico")
})

@Entity
@Table(name = "servico")
public class Servico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_servico")
    private int servico;
    @Column(name = "nome_servico", length = 25)
    private String nome_servico;
    @Column(name = "descricao", length = 80)
    private String descricao;
    @Column(name = "valor")
    private double valor;

    public Servico() {
    }

    public Servico(int servico, String nome_servico, Funcionario id_funcionario, String descricao, double valor) {
        this.servico = servico;
        this.nome_servico = nome_servico;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int get_servico() {
        return servico;
    }

    public void set_servico(int servico) {
        this.servico = servico;
    }

    public String getNomeServico() {
        return nome_servico;
    }

    public void setNomeServico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.servico;
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
        final Servico other = (Servico) obj;
        return this.servico == other.servico;
    }

    @Override
    public String toString() {
        return "Servico{" + "servico=" + servico + ", nome_servico=" + nome_servico + ", descricao=" + descricao + ", valor=" + valor + '}';
    }

}
