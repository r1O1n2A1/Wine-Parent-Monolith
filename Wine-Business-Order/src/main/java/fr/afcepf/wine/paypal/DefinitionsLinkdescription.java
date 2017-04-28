
package fr.afcepf.wine.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for definitionsLinkdescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="definitionsLinkdescription">
 *   &lt;complexContent>
 *     &lt;extension base="{http://paypal.wine.afcepf.fr}payPalModel">
 *       &lt;sequence>
 *         &lt;element name="encType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="href" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schema" type="{http://paypal.wine.afcepf.fr}definitionsLinkdescription" minOccurs="0"/>
 *         &lt;element name="targetSchema" type="{http://paypal.wine.afcepf.fr}definitionsLinkdescription" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "definitionsLinkdescription", propOrder = {
    "encType",
    "href",
    "mediaType",
    "method",
    "rel",
    "schema",
    "targetSchema",
    "title"
})
public class DefinitionsLinkdescription
    extends PayPalModel
{

    protected String encType;
    protected String href;
    protected String mediaType;
    protected String method;
    protected String rel;
    protected DefinitionsLinkdescription schema;
    protected DefinitionsLinkdescription targetSchema;
    protected String title;

    /**
     * Gets the value of the encType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncType() {
        return encType;
    }

    /**
     * Sets the value of the encType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncType(String value) {
        this.encType = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the rel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRel() {
        return rel;
    }

    /**
     * Sets the value of the rel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRel(String value) {
        this.rel = value;
    }

    /**
     * Gets the value of the schema property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionsLinkdescription }
     *     
     */
    public DefinitionsLinkdescription getSchema() {
        return schema;
    }

    /**
     * Sets the value of the schema property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionsLinkdescription }
     *     
     */
    public void setSchema(DefinitionsLinkdescription value) {
        this.schema = value;
    }

    /**
     * Gets the value of the targetSchema property.
     * 
     * @return
     *     possible object is
     *     {@link DefinitionsLinkdescription }
     *     
     */
    public DefinitionsLinkdescription getTargetSchema() {
        return targetSchema;
    }

    /**
     * Sets the value of the targetSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefinitionsLinkdescription }
     *     
     */
    public void setTargetSchema(DefinitionsLinkdescription value) {
        this.targetSchema = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
