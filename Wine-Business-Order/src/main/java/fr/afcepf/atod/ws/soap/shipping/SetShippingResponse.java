
package fr.afcepf.atod.ws.soap.shipping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setShippingResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setShippingResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priceShipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setShippingResponse", propOrder = {
    "priceShipping"
})
public class SetShippingResponse {

    protected String priceShipping;

    /**
     * Gets the value of the priceShipping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceShipping() {
        return priceShipping;
    }

    /**
     * Sets the value of the priceShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceShipping(String value) {
        this.priceShipping = value;
    }

}
