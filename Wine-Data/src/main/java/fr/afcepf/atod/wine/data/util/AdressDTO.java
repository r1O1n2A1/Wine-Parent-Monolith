package fr.afcepf.atod.wine.data.util;
import java.io.Serializable;
import java.util.*;
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
public class AdressDTO implements Serializable {
    /**
     * size max columns
     */
   private static final int MAX_SIZE = 50;

    /**
     * id
     */
    private Integer id;

    /**
     * street
     */
    private String street;

    /**
     * number
     */
    private String number;

    /**
     * billing
     */
    private boolean billing;

    /**
     * city
     */
    private Integer idCity;
    
     /**
      * users
      */
     private Set<Integer> idUsers;
     
     // ---------- constructors ----------- //
     
     /**
     * Default constructor
     */
    public AdressDTO() {
    }

    public AdressDTO(Integer id, String street, String number,
                  boolean billing, Integer city) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.billing = billing;
        this.idCity = city;
    }
        
    // ------------ getters && setters -------- //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isBilling() {
        return billing;
    }

    public void setBilling(boolean billing) {
        this.billing = billing;
    }

	public Integer getIdCity() {
		return idCity;
	}

	public void setIdCity(Integer idCity) {
		this.idCity = idCity;
	}

	public Set<Integer> getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Set<Integer> idUsers) {
		this.idUsers = idUsers;
	}

    
    
}