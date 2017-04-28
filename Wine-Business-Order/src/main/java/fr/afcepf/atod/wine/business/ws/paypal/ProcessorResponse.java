
package fr.afcepf.atod.wine.business.ws.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour processorResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="processorResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="adviceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cvvCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eciSubmitted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vpas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processorResponse", propOrder = {
    "adviceCode",
    "avsCode",
    "cvvCode",
    "eciSubmitted",
    "responseCode",
    "vpas"
})
public class ProcessorResponse
    extends PayPalModel
{

    protected String adviceCode;
    protected String avsCode;
    protected String cvvCode;
    protected String eciSubmitted;
    protected String responseCode;
    protected String vpas;

    /**
     * Obtient la valeur de la propriété adviceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdviceCode() {
        return adviceCode;
    }

    /**
     * Définit la valeur de la propriété adviceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdviceCode(String value) {
        this.adviceCode = value;
    }

    /**
     * Obtient la valeur de la propriété avsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvsCode() {
        return avsCode;
    }

    /**
     * Définit la valeur de la propriété avsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvsCode(String value) {
        this.avsCode = value;
    }

    /**
     * Obtient la valeur de la propriété cvvCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvvCode() {
        return cvvCode;
    }

    /**
     * Définit la valeur de la propriété cvvCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvvCode(String value) {
        this.cvvCode = value;
    }

    /**
     * Obtient la valeur de la propriété eciSubmitted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciSubmitted() {
        return eciSubmitted;
    }

    /**
     * Définit la valeur de la propriété eciSubmitted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciSubmitted(String value) {
        this.eciSubmitted = value;
    }

    /**
     * Obtient la valeur de la propriété responseCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Définit la valeur de la propriété responseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Obtient la valeur de la propriété vpas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpas() {
        return vpas;
    }

    /**
     * Définit la valeur de la propriété vpas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpas(String value) {
        this.vpas = value;
    }

}
