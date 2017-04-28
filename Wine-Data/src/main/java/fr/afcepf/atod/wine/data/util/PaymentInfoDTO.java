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
 * by roro
 */
public class PaymentInfoDTO implements Serializable {

    private static final int MAX_SIZE = 50;

    /**
     * id
     */
    private Integer id;

    /**
     * payment method
     */
    private String paymentMethod;

    private Set<Integer> idOrders;
    
    // ------ Constructors -------- //
    
    /**
     * Default constructor
     */
    public PaymentInfoDTO() {
    }
    /**
     * 
     * @param id
     * @param paymentMethod 
     */
      public PaymentInfoDTO(Integer id, String paymentMethod) {
        this.id = id;
        this.paymentMethod = paymentMethod;
    }
    // ------ Getters && Setters ---------//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
	public Set<Integer> getIdOrders() {
		return idOrders;
	}
	public void setIdOrders(Set<Integer> idOrders) {
		this.idOrders = idOrders;
	}

    

    
}