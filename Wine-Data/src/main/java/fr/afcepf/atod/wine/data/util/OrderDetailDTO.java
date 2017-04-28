/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.afcepf.atod.wine.data.util;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author rononoa
 */
public class OrderDetailDTO implements Serializable {
    /**
     * id
     */
    private Integer Id;
    
    /**
     * quantite
     */
    private int quantite;
    
    /**
     * order
     */
    private Integer idOrder;
    
    /**
     * Product
     */
    private Integer idProduct_ordered;
    
    // ------ Constructors ------- //

    public OrderDetailDTO() {
    }

    /**
     * 
     * @param Id
     * @param quantite
     * @param order
     * @param product 
     */
    public OrderDetailDTO(Integer Id, int quantite, Integer order, Integer product) {
        this.Id = Id;
        this.quantite = quantite;
        this.idOrder = order;
        this.idProduct_ordered = product;
    }
    
    
    // ------ Getters && Setters ------//

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	public Integer getIdProduct_ordered() {
		return idProduct_ordered;
	}

	public void setIdProduct_ordered(Integer idProduct_ordered) {
		this.idProduct_ordered = idProduct_ordered;
	}

    
        
}
