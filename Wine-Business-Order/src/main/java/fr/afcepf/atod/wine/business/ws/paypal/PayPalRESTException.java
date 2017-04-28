
package fr.afcepf.atod.wine.business.ws.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PayPalRESTException complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PayPalRESTException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{http://paypal.wine.afcepf.fr}error" minOccurs="0"/>
 *         &lt;element name="responsecode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayPalRESTException", propOrder = {
    "details",
    "responsecode",
    "message"
})
public class PayPalRESTException {

    protected Error details;
    protected Integer responsecode;
    protected String message;

    /**
     * Obtient la valeur de la propriété details.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getDetails() {
        return details;
    }

    /**
     * Définit la valeur de la propriété details.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setDetails(Error value) {
        this.details = value;
    }

    /**
     * Obtient la valeur de la propriété responsecode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponsecode() {
        return responsecode;
    }

    /**
     * Définit la valeur de la propriété responsecode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponsecode(Integer value) {
        this.responsecode = value;
    }

    /**
     * Obtient la valeur de la propriété message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
