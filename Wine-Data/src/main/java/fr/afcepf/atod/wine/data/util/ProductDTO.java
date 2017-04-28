package fr.afcepf.atod.wine.data.util;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * by roronoa
 */
public class ProductDTO implements Serializable {
	private static final int MAX_SIZE = 50;
	/**
	 * id
	 */
	protected Integer idProduct;

	/**
	 * name
	 */
	protected String name;

	/**
	 * price
	 */
	protected Double price;

	/**
	 * description
	 */
	protected String description;
	
	/**
     * imagesUrl
     */
    private String images;

	/**
	 * created at
	 **/
	private Date createdAt;

	protected Integer idSpeEvent;

	/**
	 * link order <=> product
	 */

	protected Set<Integer> idOrderDetails;

	/**
	 * suppliers
	 */
	private Set<Integer> idProductSuppliers = new HashSet<Integer>(0);
	
	@Transient
	private List<String> imgsWS;

	// -------- Constructors ------------ //

	/**
	 * Default constructor
	 */
	public ProductDTO() {
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param price
	 * @param description
	 */
	public ProductDTO(Integer id, String name, Double price, String description) {
		this.idProduct = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public ProductDTO(Integer id, String name, Double price, String description, Date createdAt,
			Set<Integer> orderDetails, Set<Integer> productSuppliers) {
		super();
		this.idProduct = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.createdAt = createdAt;
		this.idOrderDetails = orderDetails;
		this.idProductSuppliers = productSuppliers;
	}

	public ProductDTO(Integer idProduct, String name, Double price, String description, Date createdAt,
			Integer speEvent, Set<Integer> orderDetails, Set<Integer> productSuppliers) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.price = price;
		this.description = description;
		this.createdAt = createdAt;
		this.idSpeEvent = speEvent;
		this.idOrderDetails = orderDetails;
		this.idProductSuppliers = productSuppliers;
	}

	// ------- Getters && Setters ---------//

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product", unique = true, nullable = false)
	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer id) {
		this.idProduct = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String imagesUrl) {
		this.images = imagesUrl;
	}

	@Override
	public String toString() {
		return "Product [id=" + idProduct + ", name=" + name + ", price=" + price + ", description=" + description
				+ "]";
	}
	
	@Transient
	public List<String> getImgsWS() {
		return imgsWS;
	}

	public void setImgsWS(List<String> imgsWS) {
		this.imgsWS = imgsWS;
	}

	public Integer getIdSpeEvent() {
		return idSpeEvent;
	}

	public void setIdSpeEvent(Integer idSpeEvent) {
		this.idSpeEvent = idSpeEvent;
	}

	public Set<Integer> getIdOrderDetails() {
		return idOrderDetails;
	}

	public void setIdOrderDetails(Set<Integer> idOrderDetails) {
		this.idOrderDetails = idOrderDetails;
	}

	public Set<Integer> getIdProductSuppliers() {
		return idProductSuppliers;
	}

	public void setIdProductSuppliers(Set<Integer> idProductSuppliers) {
		this.idProductSuppliers = idProductSuppliers;
	}
	
	
	
}