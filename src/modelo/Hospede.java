/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
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

/**
 *
 * @author aluno
 */

@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "Hospede.Todos", query = "SELECT h FROM Hospede h" ),
    
    @NamedQuery(name = "Hospede.porCPF", 
                query = "SELECT h FROM Hospede h WHERE h.cpf LIKE :id_hospede"),
        
    // consulta pra trazer todas as salas que possuem em sua descricao
    // o texto existente no parâmetro :desc
    @NamedQuery(name = "Hospede.porNome", query = "SELECT h from Hospede h WHERE h.nome LIKE :nome_hospede"),
    
    @NamedQuery(name = "Hospede.porId", 
                query = "SELECT h FROM Hospede h WHERE h.hospede = :hospede_id"),
})
@Entity
@Table(name = "hospede")
public class Hospede implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hospede", length = 6)
    private int hospede;
    @Column(name = "cpf", length = 15)
    private String cpf;
    @Column(name = "nome", length = 40)
    private String nome;
    @Column(name = "rg", length = 15)
    private String rg;
    @Column(name = "estado_sivil", length = 15)
    private String estado_sivil;
    @Column(name = "telefone_cont", length = 14)
    private String telefone_cont;
    @Column(name = "endereco", length = 40)
    private String endereco;
    @Column(name = "cidade", length = 20)
    private String cidade;
    @Column(name = "cep", length = 15)
    private String cep;
    @Column(name = "uf", length = 10)
    private String uf;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date data_nascimento;

    public Hospede() {
    }

    public Hospede(String cpf, String nome, String rg, String estado_sivil, String telefone_cont, String endereco, String cidade, String cep, String uf, Date data_nascimento, int hospede) {
        this.cpf = cpf;
        this.nome = nome;
        this.rg = rg;
        this.estado_sivil = estado_sivil;
        this.telefone_cont = telefone_cont;
        this.endereco = endereco;
        this.cidade = cidade;
        this.cep = cep;
        this.uf = uf;
        this.data_nascimento = data_nascimento;
        this.hospede = hospede;
    }

    public int getHospede() {
        return hospede;
    }

    public void setHospede(int hospede) {
        this.hospede = hospede;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEstado_sivil() {
        return estado_sivil;
    }

    public void setEstado_sivil(String estado_sivil) {
        this.estado_sivil = estado_sivil;
    }

    public String getTelefone_cont() {
        return telefone_cont;
    }

    public void setTelefone_cont(String telefone_cont) {
        this.telefone_cont = telefone_cont;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.hospede;
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
        final Hospede other = (Hospede) obj;
        return this.hospede == other.hospede;
    }

    @Override
    public String toString() {
        return "Hospede{" + "hospede=" + hospede + ", cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + ", estado_sivil=" + estado_sivil + ", telefone_cont=" + telefone_cont + ", endereco=" + endereco + ", cidade=" + cidade + ", cep=" + cep + ", uf=" + uf + ", data_nascimento=" + data_nascimento + '}';
    }

    
    
    

}
