package fr.afcepf.atod.wine.data.util;

import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

public class ProductSupplierDTO  implements Serializable {
	
	private Integer idProductSupplierId;
	private Integer quantity;
	
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getIdProductSupplierId() {
		return idProductSupplierId;
	}

	public void setIdProductSupplierId(Integer idProductSupplierId) {
		this.idProductSupplierId = idProductSupplierId;
	}
	
	
}
