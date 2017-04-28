package fr.afcepf.atod.wine.data.util;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * by roronoa
 */
public class SupplierDTO implements Serializable{
    /**
     * size columns
     */
    private static final int MAX_SIZE  = 50;
   
    /**
     * id
     */
    private Integer idSupplier;
    
    /**
     * name
     */
    private String companyName;

    /**
     * phone
     */
    private String phoneNumber;

    /**
     * mail
     */
    private String mail;

    /**
     * created @t
     */
    private Date createdAt;

    /**
     * products
     */
    private Set<Integer> idProductSuppliers;
    
    // ---------- Constructors ----------//
    
     /**
     * Default constructor
     */
    public SupplierDTO() {
    }
    /**
     * 
     * @param id
     * @param companyName
     * @param phoneNumber
     * @param mail
     * @param createdAt 
     */
    public SupplierDTO(Integer id, String companyName, String phoneNumber,
            String mail, Date createdAt) {
        this.idSupplier = id;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.createdAt = createdAt;
    }
    
    
    
    // -------- Getters && Setters ------//

    public SupplierDTO(Integer id, String companyName, String phoneNumber, String mail, Date createdAt,
			Set<Integer> productSuppliers) {
		super();
		this.idSupplier = id;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
		this.createdAt = createdAt;
		this.idProductSuppliers = productSuppliers;
	}
    
	public Integer getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Integer id) {
        this.idSupplier = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    
	public Set<Integer> getIdProductSuppliers() {
		return idProductSuppliers;
	}
	
	public void setIdProductSuppliers(Set<Integer> idProductSuppliers) {
		this.idProductSuppliers = idProductSuppliers;
	}
    
    
    
}