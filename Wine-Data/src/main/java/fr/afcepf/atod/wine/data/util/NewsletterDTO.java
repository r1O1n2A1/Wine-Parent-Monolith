package fr.afcepf.atod.wine.data.util;

import java.io.Serializable;
import java.util.Date;
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
 * creation table Newsletter
 */
public class NewsletterDTO implements Serializable {
    private static final int MAX_SIZE = 50;

    /**
     * id
     */
    private Integer id;

    /**
     * title
     */
    private String title;

    /**
     * body
     */
    private String body;

    /**
     * newsletter created @t
     */
    private Date createdAt;

    /**
     * newsletter update @t
     */
    private Date updatedAt;

    /**
     * newsletter published @t
     */
    private Date publishedAt;
    
    /**
     *  admin
     */
    private Integer idAdmin;

    // ----- Constructors ------//
    
    /**
     * Default constructor
     */
    public NewsletterDTO() {
    }
    /**
     * 
     * @param id
     * @param title
     * @param body
     * @param createdAt
     * @param updatedAt
     * @param publishedAt
     * @param admin 
     */   
    public NewsletterDTO(Integer id, String title, String body, Date createdAt,
                      Date updatedAt, Date publishedAt, Integer admin) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.publishedAt = publishedAt;
        this.idAdmin = admin;
    }

    // ------ getters && setters ------- //
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }
    
	public Integer getIdAdmin() {
		return idAdmin;
	}
	
	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}
    
    
       
}