/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.ItemConsumo;
import util.GerenciadorConexao;

/**
 *
 * @author aluno
 */
public class ControleItemHospedagem {
    
    
    public List<ItemConsumo> listarPorHospedagem(Integer i) {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();

        // criar um objeto do tipo Consulta
        TypedQuery<ItemConsumo> consulta = gerente.createNamedQuery("ItemConsumo.PorHospedagem", ItemConsumo.class);
        consulta.setParameter("id_hospedagem", i );

        return consulta.getResultList();

    }
}
