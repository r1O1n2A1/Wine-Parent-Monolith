
package fr.afcepf.atod.ws.soap.shipping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getIdShipping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getIdShipping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idShipping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIdShipping", propOrder = {
    "idShipping"
})
public class GetIdShipping {

    protected String idShipping;

    /**
     * Gets the value of the idShipping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdShipping() {
        return idShipping;
    }

    /**
     * Sets the value of the idShipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdShipping(String value) {
        this.idShipping = value;
    }

}
