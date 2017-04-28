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
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * By Roronoa
 */
public class CommentDTO implements Serializable {
    /**
     * use to calculate max size column
     */
    private static final int MAX_SIZE = 50;
    /**
     * id
     */
    private Integer Id;

    /**
     * title
     */
    private String title;

    /**
     * text
     */
    private String text;

    /**
     * validated comment?
     */
    private Boolean isValidated;

    /**
     * date
     */
    private Date datePublished;

    /**
     * admin
     */
    private Integer idAdmin;
    
    
    private Integer idCustomer;
    
    // ------------ Constructors ------------ //
    
    /**
     * Default constructor
     */
    public CommentDTO() {
    }
    /**
     * @param Id
     * @param title
     * @param text
     * @param validated
     * @param date
     * @param admin 
     * @param customer 
     */
    public CommentDTO(Integer Id, String title, String text,
                   Boolean validated, Date date, Integer admin, Integer customer) {
        this.Id             = Id;
        this.title          = title;
        this.text           = text;
        this.isValidated    = validated;
        this.datePublished  = date;
        this.idAdmin          = admin;
        this.idCustomer       = customer;
    }
    
    // --------- Getters && Setters --------- //

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getIsValidated() {
        return isValidated;
    }

    public void setIsValidated(Boolean isValidated) {
        this.isValidated = isValidated;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }
    
	public Integer getIdAdmin() {
		return idAdmin;
	}
	
	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}

    

    
}