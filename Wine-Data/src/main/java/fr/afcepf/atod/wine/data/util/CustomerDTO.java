package fr.afcepf.atod.wine.data.util;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * by roronoa
 */
public class CustomerDTO extends UserDTO implements Serializable {

    /**
     * activated
     */
	private Boolean activated;
	
	/**
     * comments
     */
    private Set<Integer> idComments;

    
    /**
     * orders
     */
    private Set<Integer> idOrders;
    
    // ------------- constructors ---------------- //
    /**
     * Default constructor
     */
    public CustomerDTO() {
        
    }

    /**
     * 
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
     * @param civility
     * @param adress
     * @param activated 
     */       
    
    public CustomerDTO(Integer id, String lastname, 
                    String firstname, Date birthdate, String email,
                    String login, String password, String phonenumber,
                    Date createdAt, Date updatedAt, String civility,
                    Integer adress, Boolean activated ) {
        super(id, lastname, firstname, birthdate, email, login, password,
               phonenumber, createdAt, updatedAt, civility, adress);
        this.activated=activated;
    }
    
    // ------------ Getters && setters --------------//

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

	public Set<Integer> getIdComments() {
		return idComments;
	}

	public void setIdComments(Set<Integer> idComments) {
		this.idComments = idComments;
	}

	public Set<Integer> getIdOrders() {
		return idOrders;
	}

	public void setIdOrders(Set<Integer> idOrders) {
		this.idOrders = idOrders;
	}

    
        
}
