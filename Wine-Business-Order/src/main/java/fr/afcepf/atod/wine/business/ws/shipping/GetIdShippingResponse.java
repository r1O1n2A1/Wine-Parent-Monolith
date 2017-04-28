
package fr.afcepf.atod.wine.business.ws.shipping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getIdShippingResponse complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� isExistingIdShipping.
     * 
     */
    public boolean isIsExistingIdShipping() {
        return isExistingIdShipping;
    }

    /**
     * D�finit la valeur de la propri�t� isExistingIdShipping.
     * 
     */
    public void setIsExistingIdShipping(boolean value) {
        this.isExistingIdShipping = value;
    }

}
