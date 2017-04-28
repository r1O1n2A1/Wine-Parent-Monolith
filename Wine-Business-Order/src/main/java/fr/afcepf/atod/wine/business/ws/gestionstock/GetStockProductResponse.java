
package fr.afcepf.atod.wine.business.ws.gestionstock;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour GetStockProductResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="GetStockProductResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isEnoughStock" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStockProductResponse", propOrder = {
    "isEnoughStock"
})
public class GetStockProductResponse {

    protected boolean isEnoughStock;

    /**
     * Obtient la valeur de la propriété isEnoughStock.
     * 
     */
    public boolean isIsEnoughStock() {
        return isEnoughStock;
    }

    /**
     * Définit la valeur de la propriété isEnoughStock.
     * 
     */
    public void setIsEnoughStock(boolean value) {
        this.isEnoughStock = value;
    }

}
