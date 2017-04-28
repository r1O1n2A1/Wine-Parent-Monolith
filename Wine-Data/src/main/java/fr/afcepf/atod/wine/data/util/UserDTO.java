package fr.afcepf.atod.wine.data.util;

import java.io.Serializable;
import java.util.Date;

/**
 * by Roronoa
 */
public class UserDTO implements Serializable {
    /**
     * size columns
     */
    private static final int MAX_SIZE = 50;
    /**
     * id
     */
    protected Integer id;

    /**
     * lastname
     */
    protected  String lastname;

    /**
     * first name
     */
    protected  String firstname;

    /**
     * birthdate
     */
    protected  Date birthdate;

    /**
     * email
     */
    protected  String mail;

    /**
     * login
     */
    protected  String login;

    /**
     * password
     */
    protected  String password;

    /**
     * phonenumber
     */
    protected  String phonenumber;

    /**
     * user account created @
     */
    protected  Date createdAt;

    /**
     * user account updated @
     */
    protected  Date updatedAt;
   
    /**
     * civility
     */
    protected  String idCivility;

    /**
     * adress
     */
    protected  Integer idAdress;
    
    
    /**
     * Default constructor
     */
    public UserDTO() {
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
     */
    public UserDTO(Integer id, String lastname, String firstname, Date birthdate,
                String email, String login, String password, String phonenumber,
                Date createdAt, Date updatedAt, String civility, Integer adress) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthdate = birthdate;
        this.mail = email;
        this.login = login;
        this.password = password;
        this.phonenumber = phonenumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.idCivility = civility;
        this.idAdress = adress;
    }
    // --------- getters && setters ------------ //

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
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
    
	public String getIdCivility() {
		return idCivility;
	}
	
	public void setIdCivility(String idCivility) {
		this.idCivility = idCivility;
	}
	
	public Integer getIdAdress() {
		return idAdress;
	}
	
	public void setIdAdress(Integer idAdress) {
		this.idAdress = idAdress;
	}

}