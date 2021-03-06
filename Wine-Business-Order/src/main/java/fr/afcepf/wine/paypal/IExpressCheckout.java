
package fr.afcepf.wine.paypal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IExpressCheckout", targetNamespace = "http://paypal.wine.afcepf.fr")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IExpressCheckout {


    /**
     * 
     * @param detailsPayment
     * @return
     *     returns java.lang.String
     * @throws PayPalRESTException_Exception
     */
    @WebMethod
    @WebResult(name = "checkoutDone", targetNamespace = "")
    @RequestWrapper(localName = "checkoutPaypal", targetNamespace = "http://paypal.wine.afcepf.fr", className = "fr.afcepf.wine.paypal.CheckoutPaypal")
    @ResponseWrapper(localName = "checkoutPaypalResponse", targetNamespace = "http://paypal.wine.afcepf.fr", className = "fr.afcepf.wine.paypal.CheckoutPaypalResponse")
    public String checkoutPaypal(
        @WebParam(name = "detailsPayment", targetNamespace = "")
        fr.afcepf.wine.paypal.CheckoutPaypal.DetailsPayment detailsPayment)
        throws PayPalRESTException_Exception
    ;

    /**
     * 
     * @param paymentID
     * @return
     *     returns boolean
     * @throws PayPalRESTException_Exception
     */
    @WebMethod
    @WebResult(name = "paymentDone", targetNamespace = "")
    @RequestWrapper(localName = "retrievePayment", targetNamespace = "http://paypal.wine.afcepf.fr", className = "fr.afcepf.wine.paypal.RetrievePayment")
    @ResponseWrapper(localName = "retrievePaymentResponse", targetNamespace = "http://paypal.wine.afcepf.fr", className = "fr.afcepf.wine.paypal.RetrievePaymentResponse")
    public boolean retrievePayment(
        @WebParam(name = "paymentID", targetNamespace = "")
        String paymentID)
        throws PayPalRESTException_Exception
    ;

}
