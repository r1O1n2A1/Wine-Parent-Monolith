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
public class CountryDTO implements Serializable {
    /**
     * size columns
     */
    private static final int MAX_SIZE = 50;
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;
    
    /**
     * set Regions
     */
    private Set<Integer> idRegions;
    
    // ------- Constructors -------//
    
    /**
     * Default constructor
     */
    public CountryDTO() {
    }

    public CountryDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // ------ Getters && Setters --------- //
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Set<Integer> getIdRegions() {
		return idRegions;
	}

	public void setIdRegions(Set<Integer> idRegions) {
		this.idRegions = idRegions;
	}

    

}