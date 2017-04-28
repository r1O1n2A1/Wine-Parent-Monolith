
package fr.afcepf.atod.ws.soap.shipping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for followOrderResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="followOrderResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusShippingOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "followOrderResponse", propOrder = {
    "statusShippingOrder"
})
public class FollowOrderResponse {

    protected String statusShippingOrder;

    /**
     * Gets the value of the statusShippingOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusShippingOrder() {
        return statusShippingOrder;
    }

    /**
     * Sets the value of the statusShippingOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusShippingOrder(String value) {
        this.statusShippingOrder = value;
    }

}
