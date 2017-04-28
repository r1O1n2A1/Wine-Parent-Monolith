package fr.afcepf.atod.wine.data.util;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * 
 */
public class SpecialEventDTO implements Serializable {
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
	 * begining event
	 */
	private Date startDate;

	/**
	 * end event
	 */
	private Date endDate;

	/**
	 * event: created @
	 */
	private Date createdAt;

	/**
	 * 
	 */
	private String description;

	/**
	 * 
	 */
	private Boolean activated;
	/**
	 * admin
	 */
	private Integer idAdmin;

	private Integer pourcentage;

	private Set<Integer> idProducts;

	// ------- constructeurs -------//

	/**
	 * Default constructor
	 */
	public SpecialEventDTO() {
	}

	/**
	 * 
	 * @param id
	 * @param Title
	 * @param startDate
	 * @param endDate
	 * @param createdAt
	 * @param description
	 * @param activated
	 * @param admin
	 */
	public SpecialEventDTO(Integer id, String title, Date startDate, Date endDate, Date createdAt, String description,
			Boolean activated, Integer admin, Integer pourcentage) {
		super();
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdAt = createdAt;
		this.description = description;
		this.activated = activated;
		this.idAdmin = admin;
		this.pourcentage = pourcentage;
	}

	public SpecialEventDTO(Integer id, String title, Date startDate, Date endDate, Date createdAt, String description,
			Boolean activated, Integer admin, Integer pourcentage, Set<Integer> products) {
		super();
		this.id = id;
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.createdAt = createdAt;
		this.description = description;
		this.activated = activated;
		this.idAdmin = admin;
		this.pourcentage = pourcentage;
		this.idProducts = products;
	}
	// ------- Getters et setters -------//

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(Integer pourcentage) {
		this.pourcentage = pourcentage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String Title) {
		this.title = Title;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActivated() {
		return activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	public Integer getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(Integer idAdmin) {
		this.idAdmin = idAdmin;
	}

	public Set<Integer> getIdProducts() {
		return idProducts;
	}

	public void setIdProducts(Set<Integer> idProducts) {
		this.idProducts = idProducts;
	}
	
	

}