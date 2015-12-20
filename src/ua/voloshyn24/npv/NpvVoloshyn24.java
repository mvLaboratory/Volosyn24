
package ua.voloshyn24.npv;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "npv_voloshyn24", targetNamespace = "http://npv.voloshyn24.ua", wsdlLocation = "http://natur1ca:8080/npv_voloshyn24/ws/task.1cws?wsdl")
public class NpvVoloshyn24
    extends Service
{

    private final static URL NPVVOLOSHYN24_WSDL_LOCATION;
    private final static WebServiceException NPVVOLOSHYN24_EXCEPTION;
    private final static QName NPVVOLOSHYN24_QNAME = new QName("http://npv.voloshyn24.ua", "npv_voloshyn24");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://natur1ca:8080/npv_voloshyn24/ws/task.1cws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NPVVOLOSHYN24_WSDL_LOCATION = url;
        NPVVOLOSHYN24_EXCEPTION = e;
    }

    public NpvVoloshyn24() {
        super(__getWsdlLocation(), NPVVOLOSHYN24_QNAME);
    }

    public NpvVoloshyn24(WebServiceFeature... features) {
        super(__getWsdlLocation(), NPVVOLOSHYN24_QNAME, features);
    }

    public NpvVoloshyn24(URL wsdlLocation) {
        super(wsdlLocation, NPVVOLOSHYN24_QNAME);
    }

    public NpvVoloshyn24(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NPVVOLOSHYN24_QNAME, features);
    }

    public NpvVoloshyn24(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NpvVoloshyn24(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NpvVoloshyn24PortType
     */
    @WebEndpoint(name = "npv_voloshyn24Soap")
    public NpvVoloshyn24PortType getNpvVoloshyn24Soap() {
        return super.getPort(new QName("http://npv.voloshyn24.ua", "npv_voloshyn24Soap"), NpvVoloshyn24PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NpvVoloshyn24PortType
     */
    @WebEndpoint(name = "npv_voloshyn24Soap")
    public NpvVoloshyn24PortType getNpvVoloshyn24Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://npv.voloshyn24.ua", "npv_voloshyn24Soap"), NpvVoloshyn24PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NPVVOLOSHYN24_EXCEPTION!= null) {
            throw NPVVOLOSHYN24_EXCEPTION;
        }
        return NPVVOLOSHYN24_WSDL_LOCATION;
    }

}