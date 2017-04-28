package fr.afcepf.atod.wine.data.util;

import java.io.Serializable;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import fr.afcepf.atod.wine.entity.Adress;
import fr.afcepf.atod.wine.entity.Civility;
/**
 * by roronoa
 */
public class AdminDTO extends UserDTO implements Serializable {
   
    /**
     * bi directionnalite
     */
    private Set<Integer> idEvents;

    /**
     * bi directionnalite
     */
    private Set<Integer> idComments;

    /**
     * bi directionnalite
     */
    private Set<Integer> idNews;

    
    
     // ------- Constructors ------ //
    /**
     * Default constructor
     */
    public AdminDTO() {
        
    }



	public Set<Integer> getIdEvents() {
		return idEvents;
	}



	public void setIdEvents(Set<Integer> idEvents) {
		this.idEvents = idEvents;
	}



	public Set<Integer> getIdComments() {
		return idComments;
	}



	public void setIdComments(Set<Integer> idComments) {
		this.idComments = idComments;
	}



	public Set<Integer> getIdNews() {
		return idNews;
	}



	public void setIdNews(Set<Integer> idNews) {
		this.idNews = idNews;
	}



	public AdminDTO(Set<Integer> idEvents, Set<Integer> idComments, Set<Integer> idNews) {
		super();
		this.idEvents = idEvents;
		this.idComments = idComments;
		this.idNews = idNews;
	}
    
    /**
     * @param id
     * @param lastname
     * @param firstname
     * @param birthdate
     * @param email
     * @param login
     * @param password
     * @param phonenumber
     * @param createdAt
     * @param updatedAt
     * @param label
     * @param adress 
     */
    
	public AdminDTO(Integer id, String lastname, String firstname,
            Date birthdate, String email, String login, String password,
            String phonenumber, Date createdAt, Date updatedAt, 
            String label, Integer adress) {
        super(id, lastname, firstname, birthdate, email, login, password,
                phonenumber, createdAt, updatedAt, label, adress);
    }


    // -------- getters && setters -------- //

    
    
}