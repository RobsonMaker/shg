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



@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "Quarto.Todos", query = "SELECT q FROM Quarto q" ),
    
    @NamedQuery(name = "Quarto.porId", 
                query = "SELECT q FROM Quarto q WHERE q.quarto = :quarto"),
        
    // consulta pra trazer todas as salas que possuem em sua descricao
    // o texto existente no parâmetro :desc
   
        
        @NamedQuery(name = "Quarto.porStatus", 
                query = "SELECT q from Quarto q WHERE q.status LIKE :status"),
        
        @NamedQuery(name = "Quarto.porNumero", 
                query = "SELECT q from Quarto q WHERE q.numero_quarto LIKE :numero"),
                        
        
})

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "quarto")
public class Quarto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_quarto", length = 6)
    private int quarto;
    
    @ManyToOne()
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo")
    private Tipo id_tipo;
    
    @Column(name = "bloco", length = 10)
    private String bloco;
    
    @Column(name = "numero_quarto", length = 6)
    private Integer numero_quarto;
    @Column(name = "status", length = 20)
    private String status;

    
    public Quarto() {
    }
    
    public Quarto(int quarto, String tipo, String bloco, double preco_diaria, Integer numero_quarto, String status) {
        this.quarto = quarto;
  
        this.bloco = bloco;

        this.numero_quarto = numero_quarto;
        this.status = status;
    }

    public Tipo getTipo() {
        return id_tipo;
    }

    public void setTipo(Tipo id_tipo) {
        this.id_tipo = id_tipo;
    }
    
    

    public int get_quarto() {
        return quarto;
    }

    public void set_quarto(int quarto) {
        this.quarto = quarto;
    }

 

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

 

    public Integer getNumero_quarto() {
        return numero_quarto;
    }

    public void setNumero_quarto(Integer numero_quarto) {
        this.numero_quarto = numero_quarto;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.quarto;
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
        final Quarto other = (Quarto) obj;
        return this.quarto == other.quarto;
    }

    @Override
    public String toString() {
        return "Quarto{" + "quarto=" + quarto + ", + , bloco=" + bloco  + ", numero_quarto=" + numero_quarto + ", status=" + status + '}';
    }


    
    
    
}
