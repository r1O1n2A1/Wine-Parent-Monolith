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
public class ProductTypeDTO implements Serializable {
    /**
     * columns size
     */
    private static final int MAX_SIZE = 50;
  
    /**
     * id
     */
    private Integer id;

    /**
     * type
     */
    private String type;
    
    /**
     * products wine
     */
    private Set<Integer> idProductsWine;
    
    
    
    // ---------- Constructors -----------//
      /**
     * Default constructor
     */
    public ProductTypeDTO() {
    }
    /**
     * 
     * @param id
     * @param type 
     */
    public ProductTypeDTO(Integer id, String type) {
        this.id = id;
        this.type = type;
    }
        

    // ----------- Getters && Setters ----------//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
	
    public Set<Integer> getIdProductsWine() {
		return idProductsWine;
	}
	public void setIdProductsWine(Set<Integer> idProductsWine) {
		this.idProductsWine = idProductsWine;
	}
	@Override
	public String toString() {
		return "ProductType [id=" + id + ", type=" + type + "]";
	}
    
}