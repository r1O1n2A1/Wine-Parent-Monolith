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
@Table(name = "ProductVintage")
@Entity
public class ProductVintageDTO implements Serializable {
    /**
     * columns size
     */
    private static final int MAX_SIZE = 50;
  
    /**
     * id
     */
    private Integer id;

    /**
     * year
     */
    private Integer year;
    
    /**
     * products wine
     */
    private Set<Integer> idProductsWine;
    
    
    
    // ---------- Constructors -----------//
      /**
     * Default constructor
     */
    public ProductVintageDTO() {
    }
    /**
     * 
     * @param id
     * @param type 
     */
    public ProductVintageDTO(Integer id, Integer year) {
        this.id = id;
        this.year = year;
    }
        

    // ----------- Getters && Setters ----------//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	public Set<Integer> getIdProductsWine() {
		return idProductsWine;
	}
	public void setIdProductsWine(Set<Integer> idProductsWine) {
		this.idProductsWine = idProductsWine;
	}
	@Override
	public String toString() {
		return "ProductVintage[id=" + id + ", year=" + year + "]";
	}
    
}