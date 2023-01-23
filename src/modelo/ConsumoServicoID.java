/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author aluno
 */
public class ConsumoServicoID implements Serializable{
    private int servico;
    private int hospedagem;

    public ConsumoServicoID() {
    }

    public int getServico() {
        return servico;
    }

    public void setServico(int servico) {
        this.servico = servico;
    }

    public int getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(int hospedagem) {
        this.hospedagem = hospedagem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.servico;
        hash = 53 * hash + this.hospedagem;
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
        final ConsumoServicoID other = (ConsumoServicoID) obj;
        if (this.servico != other.servico) {
            return false;
        }
        return this.hospedagem == other.hospedagem;
    }
    
    
}
