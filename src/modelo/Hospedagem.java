/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author aluno
 */
@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "Hospedagem.Todos", query = "SELECT h FROM Hospedagem h"), 
   @NamedQuery(name = "Hospedagem.porStatus", query = "SELECT h FROM Hospedagem h WHERE h.status = :status"),
   @NamedQuery(name = "Hospedagem.porData", query = "SELECT h FROM Hospedagem h WHERE h.dataCheckin = :data"),
    @NamedQuery(name = "Hospedagem.porEmAtraso", query = "SELECT h FROM Hospedagem h WHERE h.status ='Aberto' AND h.dataCheckout < :data"),
    @NamedQuery(name = "Hospedagem.porFechadaHoje", query = "SELECT h FROM Hospedagem h WHERE h.dataCheckout = :data"),
    @NamedQuery(name = "Hospedagem.porHospede", query = "SELECT h FROM Hospedagem h WHERE h.hospede.nome LIKE :nomeHospede"),
    @NamedQuery(name = "Hospedagem.porHospedeCpf", query = "SELECT h FROM Hospedagem h WHERE h.hospede.cpf LIKE :cpfHospede"),
    @NamedQuery(name = "Hospedagem.porQuartoNumero", query = "SELECT h FROM Hospedagem h WHERE h.quarto.numero_quarto LIKE :numeroQuarto"),
    @NamedQuery(name = "Hospedagem.porFuncionarioNome", query = "SELECT h FROM Hospedagem h WHERE h.funcionario.nome LIKE :nomeFuncionario"),
    @NamedQuery(name = "Hospedagem.porId", query = "SELECT h FROM Hospedagem h WHERE h.hospedagem = :id_hospedagem")
//        
// consulta pra trazer todas as salas que possuem em sua descricao
// o texto existente no parâmetro :desc
// @NamedQuery(name = "Hospede.porNome", query = "SELECT h from Hospedagem h WHERE h.hospede.nome LIKE :nome_hospede")
})
@Entity
@Table(name = "hospedagem")
public class Hospedagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hospedagem")
    private int hospedagem;

    @ManyToOne()
    @JoinColumn(name = "id_hospede", referencedColumnName = "id_hospede")
    private Hospede hospede;
    
    @ManyToOne()
    @JoinColumn(name = "funcionario", referencedColumnName = "id_funcionario")
    private Funcionario funcionario;

    @OneToMany(mappedBy = "hospedagem", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<ItemConsumo> listaItemConsumo = new ArrayList<>();

    @OneToMany(mappedBy ="hospedagem",orphanRemoval = true, cascade = CascadeType.ALL)
    private List<ConsumoServico> ListaConsumoServicos = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "id_quarto", referencedColumnName = "id_quarto")
    private Quarto quarto;

    @JoinColumn(name = "preco_diaria_total", referencedColumnName = "preco_diaria")
    private double preco_diaria_total;

    @Column(name = "qtd_diaria")
    private int qtd_diaria;
    @Column(name = "dataCheckin")
    @Temporal(TemporalType.DATE)
    private Date dataCheckin;
    @Column(name = "dataCheckout")
    @Temporal(TemporalType.DATE)
    private Date dataCheckout;
    @Column(name = "formaPagamento", length = 15)
    private String formaPagamento;

    @Column(name = "status", length = 15)
    private String status;

    public Hospedagem() {
    }

    public int getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(int hospedagem) {
        this.hospedagem = hospedagem;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public List<ItemConsumo> getListaItemConsumo() {
        return listaItemConsumo;
    }

    public void setListaItemConsumo(List<ItemConsumo> listaItemConsumo) {
        this.listaItemConsumo = listaItemConsumo;
    }

    public List<ConsumoServico> getListaConsumoServicos() {
        return ListaConsumoServicos;
    }

    public void setListaConsumoServicos(List<ConsumoServico> ListaConsumoServicos) {
        this.ListaConsumoServicos = ListaConsumoServicos;
    }
    
    

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public double getPreco_diaria_total() {
        return preco_diaria_total;
    }

    public void setPreco_diaria_total(double preco_diaria_total) {
        this.preco_diaria_total = preco_diaria_total;
    }

    public int getQtd_diaria() {
        return qtd_diaria;
    }

    public void setQtd_diaria(int qtd_diaria) {
        this.qtd_diaria = qtd_diaria;
    }

    public Date getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(Date dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public Date getDataCheckout() {
        return dataCheckout;
    }

    public void setDataCheckout(Date dataCheckout) {
        this.dataCheckout = dataCheckout;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.hospedagem;
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
        final Hospedagem other = (Hospedagem) obj;
        return this.hospedagem == other.hospedagem;
    }

    @Override
    public String toString() {
        return "Hospedagem{" + "hospedagem=" + hospedagem + ", hospede=" + hospede + ", listaItemConsumo=" + listaItemConsumo + ", ListaConsumoServicos=" + ListaConsumoServicos + ", quarto=" + quarto + ", preco_diaria_total=" + preco_diaria_total + ", qtd_diaria=" + qtd_diaria + ", dataCheckin=" + dataCheckin + ", dataCheckout=" + dataCheckout + ", formaPagamento=" + formaPagamento + ", status=" + status + '}';
    }

    


}
