
package fr.afcepf.atod.webservice.image;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WineServerUtilException", targetNamespace = "http://images.wine.al30.afcepf.fr")
public class WineServerUtilException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private WineServerUtilException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public WineServerUtilException_Exception(String message, WineServerUtilException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public WineServerUtilException_Exception(String message, WineServerUtilException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: fr.afcepf.al30.wine.images.WineServerUtilException
     */
    public WineServerUtilException getFaultInfo() {
        return faultInfo;
    }

}