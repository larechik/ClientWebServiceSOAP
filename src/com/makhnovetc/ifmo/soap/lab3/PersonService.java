
package com.makhnovetc.ifmo.soap.lab3;

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
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PersonService", targetNamespace = "http://soap.ifmo.makhnovetc.com/", wsdlLocation = "http://localhost:8080/PersonService?wsdl")
public class PersonService
    extends Service
{

    private final static URL PERSONSERVICE_WSDL_LOCATION;
    private final static WebServiceException PERSONSERVICE_EXCEPTION;
    private final static QName PERSONSERVICE_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "PersonService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/PersonService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PERSONSERVICE_WSDL_LOCATION = url;
        PERSONSERVICE_EXCEPTION = e;
    }

    public PersonService() {
        super(__getWsdlLocation(), PERSONSERVICE_QNAME);
    }

    public PersonService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PERSONSERVICE_QNAME, features);
    }

    public PersonService(URL wsdlLocation) {
        super(wsdlLocation, PERSONSERVICE_QNAME);
    }

    public PersonService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PERSONSERVICE_QNAME, features);
    }

    public PersonService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PersonService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PersonWebService
     */
    @WebEndpoint(name = "PersonWebServicePort")
    public PersonWebService getPersonWebServicePort() {
        return super.getPort(new QName("http://soap.ifmo.makhnovetc.com/", "PersonWebServicePort"), PersonWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PersonWebService
     */
    @WebEndpoint(name = "PersonWebServicePort")
    public PersonWebService getPersonWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soap.ifmo.makhnovetc.com/", "PersonWebServicePort"), PersonWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PERSONSERVICE_EXCEPTION!= null) {
            throw PERSONSERVICE_EXCEPTION;
        }
        return PERSONSERVICE_WSDL_LOCATION;
    }

}
