
package fr.afcepf.atod.ws.soap.shipping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getIdShippingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIdShippingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isExistingIdShipping" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIdShippingResponse", propOrder = {
    "isExistingIdShipping"
})
public class GetIdShippingResponse {

    protected boolean isExistingIdShipping;

    /**
     * Gets the value of the isExistingIdShipping property.
     * 
     */
    public boolean isIsExistingIdShipping() {
        return isExistingIdShipping;
    }

    /**
     * Sets the value of the isExistingIdShipping property.
     * 
     */
    public void setIsExistingIdShipping(boolean value) {
        this.isExistingIdShipping = value;
    }

}
