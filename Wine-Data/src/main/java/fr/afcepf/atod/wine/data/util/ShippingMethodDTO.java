package fr.afcepf.atod.wine.data.util;
import java.util.Set;

/**
 * 
 */
public class ShippingMethodDTO {
    private static final int MAX_SIZE = 50;   

    /**
     * id
     */
    private Integer id;

    /**
     * information
     */
    private String information;
    
    /**
     * orders
     */
    private Set<Integer> idOrders;

    // ------------- Constructors --------------//
    
    /**
     * Default constructor
     */
    public ShippingMethodDTO() {
    }
    
    /**
     * 
     * @param id
     * @param information 
     */
    public ShippingMethodDTO(Integer id, String information) {
        this.id = id;
        this.information = information;
    }
    
    // --------------- getters && setters ------------- //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

	public Set<Integer> getIdOrders() {
		return idOrders;
	}

	public void setIdOrders(Set<Integer> idOrders) {
		this.idOrders = idOrders;
	}
    
}