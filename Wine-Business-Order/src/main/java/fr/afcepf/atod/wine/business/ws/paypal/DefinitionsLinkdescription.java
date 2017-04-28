
package fr.afcepf.atod.wine.business.ws.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour definitionsLinkdescription complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété encType.
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
     * Définit la valeur de la propriété encType.
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
     * Obtient la valeur de la propriété href.
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
     * Définit la valeur de la propriété href.
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
     * Obtient la valeur de la propriété mediaType.
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
     * Définit la valeur de la propriété mediaType.
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
     * Obtient la valeur de la propriété method.
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
     * Définit la valeur de la propriété method.
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
     * Obtient la valeur de la propriété rel.
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
     * Définit la valeur de la propriété rel.
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
     * Obtient la valeur de la propriété schema.
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
     * Définit la valeur de la propriété schema.
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
     * Obtient la valeur de la propriété targetSchema.
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
     * Définit la valeur de la propriété targetSchema.
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
     * Obtient la valeur de la propriété title.
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
     * Définit la valeur de la propriété title.
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
