
package fr.afcepf.atod.wine.business.ws.shipping;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getIdShipping complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété idShipping.
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
     * Définit la valeur de la propriété idShipping.
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
