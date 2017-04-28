
package fr.afcepf.atod.wine.business.ws.paypal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour definitionsLinkdescription complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� encType.
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
     * D�finit la valeur de la propri�t� encType.
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
     * Obtient la valeur de la propri�t� href.
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
     * D�finit la valeur de la propri�t� href.
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
     * Obtient la valeur de la propri�t� mediaType.
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
     * D�finit la valeur de la propri�t� mediaType.
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
     * Obtient la valeur de la propri�t� method.
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
     * D�finit la valeur de la propri�t� method.
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
     * Obtient la valeur de la propri�t� rel.
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
     * D�finit la valeur de la propri�t� rel.
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
     * Obtient la valeur de la propri�t� schema.
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
     * D�finit la valeur de la propri�t� schema.
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
     * Obtient la valeur de la propri�t� targetSchema.
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
     * D�finit la valeur de la propri�t� targetSchema.
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
     * Obtient la valeur de la propri�t� title.
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
     * D�finit la valeur de la propri�t� title.
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
