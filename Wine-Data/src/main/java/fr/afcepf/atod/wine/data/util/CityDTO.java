package fr.afcepf.atod.wine.data.util;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * by roronoa
 */
public class CityDTO implements Serializable {
    /**
     * max size columns
     */
    private static final int MAX_SIZE = 50;
   
    /**
     * 
     */
    private Integer id;

    /**
     * zipcode
     */
    private String zipcode;

    /**
     * name
     */
    private String name;

    /**
     * region
     */
    private Integer idRegion;
    
    /**
     * adress's'
     */
    private Set<Integer> idAdressset;
    
    // ------------ constructors ------------// 
    
     /**
     * Default constructor
     */
    public CityDTO() {
    }
    /**
     * 
     * @param id
     * @param zipcode
     * @param name
     * @param region 
     */
    public CityDTO(Integer id, String zipcode, String name, Integer region) {
        this.id = id;
        this.zipcode = zipcode;
        this.name = name;
        this.idRegion = region;
    }
    
    // ------------ getters && setters --------//
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	public Set<Integer> getIdAdressset() {
		return idAdressset;
	}
	public void setIdAdressset(Set<Integer> idAdressset) {
		this.idAdressset = idAdressset;
	}
    
    
    
}