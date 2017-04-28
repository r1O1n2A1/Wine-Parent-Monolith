package fr.afcepf.atod.wine.data.util;
import java.io.Serializable;
import java.util.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * by roronoa
 */
public class ProductVarietalDTO implements Serializable {
    /**
     * columns
     */
    private static final int MAX_SIZE = 50;
    /**
     * id
     */
    private Integer id;

    /**
     * description
     */
    private String description;
    
    /**
     * products
     */
    private Set<Integer> idProductsWine;
    
    
    // -------- Construtors -----------//
    
     /**
     * Default constructor
     */
    public ProductVarietalDTO() {
    }
    
    public ProductVarietalDTO(Integer id, String description) {
        this.id = id;
        this.description = description;
    }
    
    // -------- Getters && Setters ----------//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
	public Set<Integer> getIdProductsWine() {
		return idProductsWine;
	}

	public void setIdProductsWine(Set<Integer> idProductsWine) {
		this.idProductsWine = idProductsWine;
	}

	@Override
	public String toString() {
		return "ProductVarietal [id=" + id + ", description=" + description + "]";
	}
}