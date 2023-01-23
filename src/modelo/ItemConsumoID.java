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
public class ItemConsumoID implements Serializable {

    private int hospedagem;
    private int produto;

    public ItemConsumoID() {
    }

    public int getId_Produto() {
        return produto;
    }

    public void setId_Produto(int produto) {
        this.produto = produto;
    }

    public int getId_Hospedagem() {
        return hospedagem;
    }

    public void setId_Hospedagem(int hospedagem) {
        this.hospedagem = hospedagem;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.produto;
        hash = 29 * hash + this.hospedagem;
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
        final ItemConsumoID other = (ItemConsumoID) obj;
        if (this.produto != other.produto) {
            return false;
        }
        return this.hospedagem == other.hospedagem;
    }

    @Override
    public String toString() {
        return "ItemConsumoID{" + "produto=" + produto + ", hospedagem=" + hospedagem + '}';
    }

}
