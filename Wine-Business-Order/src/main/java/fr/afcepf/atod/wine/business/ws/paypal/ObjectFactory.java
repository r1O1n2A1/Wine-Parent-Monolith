
package fr.afcepf.atod.wine.business.ws.paypal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.afcepf.wine.paypal package. 
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

    private final static QName _CheckoutPaypal_QNAME = new QName("http://paypal.wine.afcepf.fr", "checkoutPaypal");
    private final static QName _RetrievePaymentResponse_QNAME = new QName("http://paypal.wine.afcepf.fr", "retrievePaymentResponse");
    private final static QName _RetrievePayment_QNAME = new QName("http://paypal.wine.afcepf.fr", "retrievePayment");
    private final static QName _PayPalRESTException_QNAME = new QName("http://paypal.wine.afcepf.fr", "PayPalRESTException");
    private final static QName _CheckoutPaypalResponse_QNAME = new QName("http://paypal.wine.afcepf.fr", "checkoutPaypalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.afcepf.wine.paypal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckoutPaypal }
     * 
     */
    public CheckoutPaypal createCheckoutPaypal() {
        return new CheckoutPaypal();
    }

    /**
     * Create an instance of {@link CheckoutPaypal.DetailsPayment }
     * 
     */
    public CheckoutPaypal.DetailsPayment createCheckoutPaypalDetailsPayment() {
        return new CheckoutPaypal.DetailsPayment();
    }

    /**
     * Create an instance of {@link RetrievePaymentResponse }
     * 
     */
    public RetrievePaymentResponse createRetrievePaymentResponse() {
        return new RetrievePaymentResponse();
    }

    /**
     * Create an instance of {@link RetrievePayment }
     * 
     */
    public RetrievePayment createRetrievePayment() {
        return new RetrievePayment();
    }

    /**
     * Create an instance of {@link CheckoutPaypalResponse }
     * 
     */
    public CheckoutPaypalResponse createCheckoutPaypalResponse() {
        return new CheckoutPaypalResponse();
    }

    /**
     * Create an instance of {@link PayPalRESTException }
     * 
     */
    public PayPalRESTException createPayPalRESTException() {
        return new PayPalRESTException();
    }

    /**
     * Create an instance of {@link DefinitionsLinkdescription }
     * 
     */
    public DefinitionsLinkdescription createDefinitionsLinkdescription() {
        return new DefinitionsLinkdescription();
    }

    /**
     * Create an instance of {@link PayPalModel }
     * 
     */
    public PayPalModel createPayPalModel() {
        return new PayPalModel();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link FmfDetails }
     * 
     */
    public FmfDetails createFmfDetails() {
        return new FmfDetails();
    }

    /**
     * Create an instance of {@link ErrorDetails }
     * 
     */
    public ErrorDetails createErrorDetails() {
        return new ErrorDetails();
    }

    /**
     * Create an instance of {@link ProcessorResponse }
     * 
     */
    public ProcessorResponse createProcessorResponse() {
        return new ProcessorResponse();
    }

    /**
     * Create an instance of {@link CheckoutPaypal.DetailsPayment.Entry }
     * 
     */
    public CheckoutPaypal.DetailsPayment.Entry createCheckoutPaypalDetailsPaymentEntry() {
        return new CheckoutPaypal.DetailsPayment.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutPaypal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "checkoutPaypal")
    public JAXBElement<CheckoutPaypal> createCheckoutPaypal(CheckoutPaypal value) {
        return new JAXBElement<CheckoutPaypal>(_CheckoutPaypal_QNAME, CheckoutPaypal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "retrievePaymentResponse")
    public JAXBElement<RetrievePaymentResponse> createRetrievePaymentResponse(RetrievePaymentResponse value) {
        return new JAXBElement<RetrievePaymentResponse>(_RetrievePaymentResponse_QNAME, RetrievePaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrievePayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "retrievePayment")
    public JAXBElement<RetrievePayment> createRetrievePayment(RetrievePayment value) {
        return new JAXBElement<RetrievePayment>(_RetrievePayment_QNAME, RetrievePayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayPalRESTException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "PayPalRESTException")
    public JAXBElement<PayPalRESTException> createPayPalRESTException(PayPalRESTException value) {
        return new JAXBElement<PayPalRESTException>(_PayPalRESTException_QNAME, PayPalRESTException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutPaypalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://paypal.wine.afcepf.fr", name = "checkoutPaypalResponse")
    public JAXBElement<CheckoutPaypalResponse> createCheckoutPaypalResponse(CheckoutPaypalResponse value) {
        return new JAXBElement<CheckoutPaypalResponse>(_CheckoutPaypalResponse_QNAME, CheckoutPaypalResponse.class, null, value);
    }

}
