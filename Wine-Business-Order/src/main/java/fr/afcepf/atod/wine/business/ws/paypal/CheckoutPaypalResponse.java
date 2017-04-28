
package fr.afcepf.atod.wine.business.ws.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour checkoutPaypalResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="checkoutPaypalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkoutDone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkoutPaypalResponse", propOrder = {
    "checkoutDone"
})
public class CheckoutPaypalResponse {

    protected String checkoutDone;

    /**
     * Obtient la valeur de la propriété checkoutDone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutDone() {
        return checkoutDone;
    }

    /**
     * Définit la valeur de la propriété checkoutDone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutDone(String value) {
        this.checkoutDone = value;
    }

}
