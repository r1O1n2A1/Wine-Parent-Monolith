
package fr.afcepf.atod.webservice.image;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceImageService", targetNamespace = "http://images.wine.al30.afcepf.fr", wsdlLocation = "http://localhost:28080/Wine-Utile-1.0.0/downloadUploadServices?wsdl")
public class ServiceImageService
    extends Service
{

    private final static URL SERVICEIMAGESERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEIMAGESERVICE_EXCEPTION;
    private final static QName SERVICEIMAGESERVICE_QNAME = new QName("http://images.wine.al30.afcepf.fr", "ServiceImageService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:28080/Wine-Utile-1.0.0/downloadUploadServices?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEIMAGESERVICE_WSDL_LOCATION = url;
        SERVICEIMAGESERVICE_EXCEPTION = e;
    }

    public ServiceImageService() {
        super(__getWsdlLocation(), SERVICEIMAGESERVICE_QNAME);
    }

    public ServiceImageService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEIMAGESERVICE_QNAME, features);
    }

    public ServiceImageService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEIMAGESERVICE_QNAME);
    }

    public ServiceImageService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEIMAGESERVICE_QNAME, features);
    }

    public ServiceImageService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceImageService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IServiceImage
     */
    @WebEndpoint(name = "ServiceImagePort")
    public IServiceImage getServiceImagePort() {
        return super.getPort(new QName("http://images.wine.al30.afcepf.fr", "ServiceImagePort"), IServiceImage.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IServiceImage
     */
    @WebEndpoint(name = "ServiceImagePort")
    public IServiceImage getServiceImagePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://images.wine.al30.afcepf.fr", "ServiceImagePort"), IServiceImage.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEIMAGESERVICE_EXCEPTION!= null) {
            throw SERVICEIMAGESERVICE_EXCEPTION;
        }
        return SERVICEIMAGESERVICE_WSDL_LOCATION;
    }

}
