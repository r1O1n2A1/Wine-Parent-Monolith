
package fr.afcepf.atod.wine.business.ws.paypal;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour error complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="error">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debugId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="details" type="{http://paypal.wine.afcepf.fr}errorDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fmfDetails" type="{http://paypal.wine.afcepf.fr}fmfDetails" minOccurs="0"/>
 *         &lt;element name="informationLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="links" type="{http://paypal.wine.afcepf.fr}definitionsLinkdescription" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processorResponse" type="{http://paypal.wine.afcepf.fr}processorResponse" minOccurs="0"/>
 *         &lt;element name="purchaseUnitReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "error", propOrder = {
    "code",
    "debugId",
    "details",
    "fmfDetails",
    "informationLink",
    "links",
    "message",
    "name",
    "processorResponse",
    "purchaseUnitReferenceId"
})
public class Error
    extends PayPalModel
{

    protected String code;
    protected String debugId;
    @XmlElement(nillable = true)
    protected List<ErrorDetails> details;
    protected FmfDetails fmfDetails;
    protected String informationLink;
    @XmlElement(nillable = true)
    protected List<DefinitionsLinkdescription> links;
    protected String message;
    protected String name;
    protected ProcessorResponse processorResponse;
    protected String purchaseUnitReferenceId;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtient la valeur de la propriété debugId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebugId() {
        return debugId;
    }

    /**
     * Définit la valeur de la propriété debugId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebugId(String value) {
        this.debugId = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDetails }
     * 
     * 
     */
    public List<ErrorDetails> getDetails() {
        if (details == null) {
            details = new ArrayList<ErrorDetails>();
        }
        return this.details;
    }

    /**
     * Obtient la valeur de la propriété fmfDetails.
     * 
     * @return
     *     possible object is
     *     {@link FmfDetails }
     *     
     */
    public FmfDetails getFmfDetails() {
        return fmfDetails;
    }

    /**
     * Définit la valeur de la propriété fmfDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link FmfDetails }
     *     
     */
    public void setFmfDetails(FmfDetails value) {
        this.fmfDetails = value;
    }

    /**
     * Obtient la valeur de la propriété informationLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationLink() {
        return informationLink;
    }

    /**
     * Définit la valeur de la propriété informationLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationLink(String value) {
        this.informationLink = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefinitionsLinkdescription }
     * 
     * 
     */
    public List<DefinitionsLinkdescription> getLinks() {
        if (links == null) {
            links = new ArrayList<DefinitionsLinkdescription>();
        }
        return this.links;
    }

    /**
     * Obtient la valeur de la propriété message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété processorResponse.
     * 
     * @return
     *     possible object is
     *     {@link ProcessorResponse }
     *     
     */
    public ProcessorResponse getProcessorResponse() {
        return processorResponse;
    }

    /**
     * Définit la valeur de la propriété processorResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessorResponse }
     *     
     */
    public void setProcessorResponse(ProcessorResponse value) {
        this.processorResponse = value;
    }

    /**
     * Obtient la valeur de la propriété purchaseUnitReferenceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseUnitReferenceId() {
        return purchaseUnitReferenceId;
    }

    /**
     * Définit la valeur de la propriété purchaseUnitReferenceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseUnitReferenceId(String value) {
        this.purchaseUnitReferenceId = value;
    }

}
