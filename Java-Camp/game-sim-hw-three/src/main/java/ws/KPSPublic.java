
package ws;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.4
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "KPSPublic", targetNamespace = "http://tckimlik.nvi.gov.tr/WS", wsdlLocation = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL")
public class KPSPublic
    extends Service
{

    private final static URL KPSPUBLIC_WSDL_LOCATION;
    private final static WebServiceException KPSPUBLIC_EXCEPTION;
    private final static QName KPSPUBLIC_QNAME = new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublic");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        KPSPUBLIC_WSDL_LOCATION = url;
        KPSPUBLIC_EXCEPTION = e;
    }

    public KPSPublic() {
        super(__getWsdlLocation(), KPSPUBLIC_QNAME);
    }

    public KPSPublic(WebServiceFeature... features) {
        super(__getWsdlLocation(), KPSPUBLIC_QNAME, features);
    }

    public KPSPublic(URL wsdlLocation) {
        super(wsdlLocation, KPSPUBLIC_QNAME);
    }

    public KPSPublic(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, KPSPUBLIC_QNAME, features);
    }

    public KPSPublic(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public KPSPublic(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap")
    public KPSPublicSoap getKPSPublicSoap() {
        return super.getPort(new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap"), KPSPublicSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns KPSPublicSoap
     */
    @WebEndpoint(name = "KPSPublicSoap")
    public KPSPublicSoap getKPSPublicSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap"), KPSPublicSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (KPSPUBLIC_EXCEPTION!= null) {
            throw KPSPUBLIC_EXCEPTION;
        }
        return KPSPUBLIC_WSDL_LOCATION;
    }

}
