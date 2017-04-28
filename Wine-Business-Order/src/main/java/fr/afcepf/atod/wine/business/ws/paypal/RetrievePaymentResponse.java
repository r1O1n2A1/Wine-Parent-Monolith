
package fr.afcepf.atod.wine.business.ws.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour retrievePaymentResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="retrievePaymentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paymentDone" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "retrievePaymentResponse", propOrder = {
    "paymentDone"
})
public class RetrievePaymentResponse {

    protected boolean paymentDone;

    /**
     * Obtient la valeur de la propriété paymentDone.
     * 
     */
    public boolean isPaymentDone() {
        return paymentDone;
    }

    /**
     * Définit la valeur de la propriété paymentDone.
     * 
     */
    public void setPaymentDone(boolean value) {
        this.paymentDone = value;
    }

}
