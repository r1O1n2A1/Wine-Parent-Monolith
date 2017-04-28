
package fr.afcepf.atod.wine.business.ws.orchestrator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idPayment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idLivraison" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idProduit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="qteProduit" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "idPayment",
    "idLivraison",
    "idProduit",
    "qteProduit"
})
@XmlRootElement(name = "CommandeRequest")
public class CommandeRequest {

    @XmlElement(required = true)
    protected String idPayment;
    @XmlElement(required = true)
    protected String idLivraison;
    @XmlElement(required = true)
    protected Integer idProduit;
    @XmlElement(required = true)
    protected Integer qteProduit;

    /**
     * Obtient la valeur de la propri�t� idPayment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPayment() {
        return idPayment;
    }

    /**
     * D�finit la valeur de la propri�t� idPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPayment(String value) {
        this.idPayment = value;
    }

    /**
     * Obtient la valeur de la propri�t� idLivraison.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLivraison() {
        return idLivraison;
    }

    /**
     * D�finit la valeur de la propri�t� idLivraison.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLivraison(String value) {
        this.idLivraison = value;
    }

    /**
     * Obtient la valeur de la propri�t� idProduit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProduit() {
        return idProduit;
    }

    /**
     * D�finit la valeur de la propri�t� idProduit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProduit(Integer value) {
        this.idProduit = value;
    }

    /**
     * Obtient la valeur de la propri�t� qteProduit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQteProduit() {
        return qteProduit;
    }

    /**
     * D�finit la valeur de la propri�t� qteProduit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQteProduit(Integer value) {
        this.qteProduit = value;
    }

}
