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

/**
 *
 * @author aluno
 */
@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "Funcionario.Todos", query = "SELECT f FROM Funcionario f" ),
    
    @NamedQuery(name = "Funcionario.porCPF", 
                query = "SELECT f FROM Funcionario f WHERE f.cpf LIKE :id_funcionario"),
        
    // consulta pra trazer todas as salas que possuem em sua descricao
    // o texto existente no parâmetro :desc
    @NamedQuery(name = "Funcionario.porNome", query = "SELECT f from Funcionario f WHERE f.nome LIKE :nome_funcionario"),
      @NamedQuery(name = "Funcionario.porUsuario", query = "SELECT f from Funcionario f WHERE f.usuario LIKE :usuario")
})
@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable{
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario", length = 6)
    private int funcionario;
    @Column(name = "cpf", length = 14)
    private String cpf;
    @Column(name = "nome", length = 40)
    private String nome;
    @Column(name = "rg", length = 15)
    private String rg;
    @Column(name = "estado_sivil", length = 15)
    private String estado_sivil;
    @Column(name = "telefone_cont", length = 15)
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
    @Column(name = "funcao", length = 50)
    private String funcao;
    @Column(name = "valor_salario")
    private double valor_salario;
    @Column(name = "turno", length = 20)
    private String turno;
    @Column(name = "usuario", length = 15)
    private String usuario;
    @Column(name = "senha", length = 15)
    private String password;
    

    public Funcionario() {
    }

    public Funcionario(int funcionario, String cpf, String nome, String rg, String estado_sivil, String telefone_cont, String endereco, String cidade, String cep, String uf, Date data_nascimento, String funcao, double valor_salario, String turno, String usuario, String password) {
        this.funcionario = funcionario;
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
        this.funcao = funcao;
        this.valor_salario = valor_salario;
        this.turno = turno;
        this.usuario = usuario;
        this.password = password;
    }

    

    

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getValor_salario() {
        return valor_salario;
    }

    public void setValor_salario(double valor_salario) {
        this.valor_salario = valor_salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.funcionario;
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
        final Funcionario other = (Funcionario) obj;
        return this.funcionario == other.funcionario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "funcionario=" + funcionario + ", cpf=" + cpf + ", nome=" + nome + ", rg=" + rg + ", estado_sivil=" + estado_sivil + ", telefone_cont=" + telefone_cont + ", endereco=" + endereco + ", cidade=" + cidade + ", cep=" + cep + ", uf=" + uf + ", data_nascimento=" + data_nascimento + ", funcao=" + funcao + ", valor_salario=" + valor_salario + ", turno=" + turno + ", usuario=" + usuario + ", password=" + password + '}';
    }

    

    
    
    
}
