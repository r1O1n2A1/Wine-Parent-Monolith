
package fr.afcepf.atod.wine.business.ws.shipping;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.afcepf.atod.ws.soap.shipping package. 
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

    private final static QName _FollowOrder_QNAME = new QName("shipping.soap.ws.atod.afcepf.fr", "followOrder");
    private final static QName _GetIdShippingResponse_QNAME = new QName("shipping.soap.ws.atod.afcepf.fr", "getIdShippingResponse");
    private final static QName _SetShipping_QNAME = new QName("shipping.soap.ws.atod.afcepf.fr", "setShipping");
    private final static QName _FollowOrderResponse_QNAME = new QName("shipping.soap.ws.atod.afcepf.fr", "followOrderResponse");
    private final static QName _SetShippingResponse_QNAME = new QName("shipping.soap.ws.atod.afcepf.fr", "setShippingResponse");
    private final static QName _Exception_QNAME = new QName("shipping.soap.ws.atod.afcepf.fr", "Exception");
    private final static QName _GetIdShipping_QNAME = new QName("shipping.soap.ws.atod.afcepf.fr", "getIdShipping");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.afcepf.atod.ws.soap.shipping
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetShipping }
     * 
     */
    public SetShipping createSetShipping() {
        return new SetShipping();
    }

    /**
     * Create an instance of {@link SetShipping.DetailsOrder }
     * 
     */
    public SetShipping.DetailsOrder createSetShippingDetailsOrder() {
        return new SetShipping.DetailsOrder();
    }

    /**
     * Create an instance of {@link FollowOrder }
     * 
     */
    public FollowOrder createFollowOrder() {
        return new FollowOrder();
    }

    /**
     * Create an instance of {@link FollowOrder.DetailOrder }
     * 
     */
    public FollowOrder.DetailOrder createFollowOrderDetailOrder() {
        return new FollowOrder.DetailOrder();
    }

    /**
     * Create an instance of {@link GetIdShippingResponse }
     * 
     */
    public GetIdShippingResponse createGetIdShippingResponse() {
        return new GetIdShippingResponse();
    }

    /**
     * Create an instance of {@link FollowOrderResponse }
     * 
     */
    public FollowOrderResponse createFollowOrderResponse() {
        return new FollowOrderResponse();
    }

    /**
     * Create an instance of {@link SetShippingResponse }
     * 
     */
    public SetShippingResponse createSetShippingResponse() {
        return new SetShippingResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetIdShipping }
     * 
     */
    public GetIdShipping createGetIdShipping() {
        return new GetIdShipping();
    }

    /**
     * Create an instance of {@link SetShipping.DetailsOrder.Entry }
     * 
     */
    public SetShipping.DetailsOrder.Entry createSetShippingDetailsOrderEntry() {
        return new SetShipping.DetailsOrder.Entry();
    }

    /**
     * Create an instance of {@link FollowOrder.DetailOrder.Entry }
     * 
     */
    public FollowOrder.DetailOrder.Entry createFollowOrderDetailOrderEntry() {
        return new FollowOrder.DetailOrder.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FollowOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "shipping.soap.ws.atod.afcepf.fr", name = "followOrder")
    public JAXBElement<FollowOrder> createFollowOrder(FollowOrder value) {
        return new JAXBElement<FollowOrder>(_FollowOrder_QNAME, FollowOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdShippingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "shipping.soap.ws.atod.afcepf.fr", name = "getIdShippingResponse")
    public JAXBElement<GetIdShippingResponse> createGetIdShippingResponse(GetIdShippingResponse value) {
        return new JAXBElement<GetIdShippingResponse>(_GetIdShippingResponse_QNAME, GetIdShippingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetShipping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "shipping.soap.ws.atod.afcepf.fr", name = "setShipping")
    public JAXBElement<SetShipping> createSetShipping(SetShipping value) {
        return new JAXBElement<SetShipping>(_SetShipping_QNAME, SetShipping.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FollowOrderResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "shipping.soap.ws.atod.afcepf.fr", name = "followOrderResponse")
    public JAXBElement<FollowOrderResponse> createFollowOrderResponse(FollowOrderResponse value) {
        return new JAXBElement<FollowOrderResponse>(_FollowOrderResponse_QNAME, FollowOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetShippingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "shipping.soap.ws.atod.afcepf.fr", name = "setShippingResponse")
    public JAXBElement<SetShippingResponse> createSetShippingResponse(SetShippingResponse value) {
        return new JAXBElement<SetShippingResponse>(_SetShippingResponse_QNAME, SetShippingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "shipping.soap.ws.atod.afcepf.fr", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdShipping }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "shipping.soap.ws.atod.afcepf.fr", name = "getIdShipping")
    public JAXBElement<GetIdShipping> createGetIdShipping(GetIdShipping value) {
        return new JAXBElement<GetIdShipping>(_GetIdShipping_QNAME, GetIdShipping.class, null, value);
    }

}
