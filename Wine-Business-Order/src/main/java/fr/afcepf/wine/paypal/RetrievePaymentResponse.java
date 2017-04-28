
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for retrievePaymentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the paymentDone property.
     * 
     */
    public boolean isPaymentDone() {
        return paymentDone;
    }

    /**
     * Sets the value of the paymentDone property.
     * 
     */
    public void setPaymentDone(boolean value) {
        this.paymentDone = value;
    }

}
