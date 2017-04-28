package fr.afcepf.atod.wine.data.util;

import java.io.Serializable;
import java.util.Set;

/**
 * by roronoa
 */
public class RegionDTO implements Serializable {
    /**
     * useful size columns
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
     * country
     */
    private Integer idCountry;
    
    /**
     * set cities
     */
    private Set<Integer> idCities;
    // -------- Constructors ---------//

    /**
     * Default constructor
     */
    public RegionDTO() {
        
    }
    /**
     * 
     * @param id
     * @param name
     * @param country 
     */
    public RegionDTO(Integer id, String name, Integer country) {
        this.id = id;
        this.name = name;
        this.idCountry = country;
    }
    
    // --------- getters && setters ----//

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
	public Integer getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(Integer idCountry) {
		this.idCountry = idCountry;
	}
	public Set<Integer> getIdCities() {
		return idCities;
	}
	public void setIdCities(Set<Integer> idCities) {
		this.idCities = idCities;
	}

    

    
}