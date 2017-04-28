
package fr.afcepf.atod.wine.business.ws.gestionstock;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wine_mania.wsdl.gestionstock package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProductRequest_QNAME = new QName("http://www.wine-mania.com/wsdl/GestionStock.wsdl", "GetProductRequest");
    private final static QName _GetProductResponse_QNAME = new QName("http://www.wine-mania.com/wsdl/GestionStock.wsdl", "GetProductResponse");
    private final static QName _GetStockProductResponse_QNAME = new QName("http://www.wine-mania.com/wsdl/GestionStock.wsdl", "GetStockProductResponse");
    private final static QName _GetStockProductRequest_QNAME = new QName("http://www.wine-mania.com/wsdl/GestionStock.wsdl", "GetStockProductRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wine_mania.wsdl.gestionstock
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStockProductResponse }
     * 
     */
    public GetStockProductResponse createGetStockProductResponse() {
        return new GetStockProductResponse();
    }

    /**
     * Create an instance of {@link GetProductResponse }
     * 
     */
    public GetProductResponse createGetProductResponse() {
        return new GetProductResponse();
    }

    /**
     * Create an instance of {@link GetProductRequest }
     * 
     */
    public GetProductRequest createGetProductRequest() {
        return new GetProductRequest();
    }

    /**
     * Create an instance of {@link GetStockProductRequest }
     * 
     */
    public GetStockProductRequest createGetStockProductRequest() {
        return new GetStockProductRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wine-mania.com/wsdl/GestionStock.wsdl", name = "GetProductRequest")
    public JAXBElement<GetProductRequest> createGetProductRequest(GetProductRequest value) {
        return new JAXBElement<GetProductRequest>(_GetProductRequest_QNAME, GetProductRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wine-mania.com/wsdl/GestionStock.wsdl", name = "GetProductResponse")
    public JAXBElement<GetProductResponse> createGetProductResponse(GetProductResponse value) {
        return new JAXBElement<GetProductResponse>(_GetProductResponse_QNAME, GetProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wine-mania.com/wsdl/GestionStock.wsdl", name = "GetStockProductResponse")
    public JAXBElement<GetStockProductResponse> createGetStockProductResponse(GetStockProductResponse value) {
        return new JAXBElement<GetStockProductResponse>(_GetStockProductResponse_QNAME, GetStockProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStockProductRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.wine-mania.com/wsdl/GestionStock.wsdl", name = "GetStockProductRequest")
    public JAXBElement<GetStockProductRequest> createGetStockProductRequest(GetStockProductRequest value) {
        return new JAXBElement<GetStockProductRequest>(_GetStockProductRequest_QNAME, GetStockProductRequest.class, null, value);
    }

}
