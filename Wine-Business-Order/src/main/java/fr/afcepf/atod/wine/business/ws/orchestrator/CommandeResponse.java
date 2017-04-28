
package fr.afcepf.atod.wine.business.ws.orchestrator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusLivraison" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="statusPayment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="statusQuantite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="commentaire" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusLivraison",
    "statusPayment",
    "statusQuantite",
    "commentaire"
})
@XmlRootElement(name = "CommandeResponse")
public class CommandeResponse {

    protected boolean statusLivraison;
    protected boolean statusPayment;
    protected boolean statusQuantite;
    @XmlElement(required = true)
    protected String commentaire;

    /**
     * Obtient la valeur de la propriété statusLivraison.
     * 
     */
    public boolean isStatusLivraison() {
        return statusLivraison;
    }

    /**
     * Définit la valeur de la propriété statusLivraison.
     * 
     */
    public void setStatusLivraison(boolean value) {
        this.statusLivraison = value;
    }

    /**
     * Obtient la valeur de la propriété statusPayment.
     * 
     */
    public boolean isStatusPayment() {
        return statusPayment;
    }

    /**
     * Définit la valeur de la propriété statusPayment.
     * 
     */
    public void setStatusPayment(boolean value) {
        this.statusPayment = value;
    }

    /**
     * Obtient la valeur de la propriété statusQuantite.
     * 
     */
    public boolean isStatusQuantite() {
        return statusQuantite;
    }

    /**
     * Définit la valeur de la propriété statusQuantite.
     * 
     */
    public void setStatusQuantite(boolean value) {
        this.statusQuantite = value;
    }

    /**
     * Obtient la valeur de la propriété commentaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * Définit la valeur de la propriété commentaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommentaire(String value) {
        this.commentaire = value;
    }

}
