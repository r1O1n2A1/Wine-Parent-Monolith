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
public class OrderDTO implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * created at
     */
    private Date createdAt;

    /**
     * paid at
     */
    private Date paidAt;

    
    /**
     * shipping method
     */
    private Integer idShippingMethod;

    /**
     * customer
     */
    private Integer idCustomer;

    /**
     * payment info
     */
    private Integer idPaymentInfo;
    
    /**
     * details
     */
    private  Set<Integer> idOrdersDetail;

    
    // ------------ Constructors  ----------------// 

     /**
     * Default constructor
     */
    public OrderDTO() {
    }

    public OrderDTO(Integer id, Date createdAt, Date paidAt,
    		Integer shippingMethod, Integer customer,
    		Integer paymentInfo) {
        this.id = id;
        this.createdAt = createdAt;
        this.paidAt = paidAt;
        this.idShippingMethod = shippingMethod;
        this.idCustomer = customer;
        this.idPaymentInfo = paymentInfo;
    }
    
    
    // ----------- Getters && Setters -----------//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }

	public Integer getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}

	public Integer getIdPaymentInfo() {
		return idPaymentInfo;
	}

	public void setIdPaymentInfo(Integer idPaymentInfo) {
		this.idPaymentInfo = idPaymentInfo;
	}

	public Set<Integer> getIdOrdersDetail() {
		return idOrdersDetail;
	}

	public void setIdOrdersDetail(Set<Integer> idOrdersDetail) {
		this.idOrdersDetail = idOrdersDetail;
	}

	public Integer getIdShippingMethod() {
		return idShippingMethod;
	}

	public void setIdShippingMethod(Integer idShippingMethod) {
		this.idShippingMethod = idShippingMethod;
	}

}