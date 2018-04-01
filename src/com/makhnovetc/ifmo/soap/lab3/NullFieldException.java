
package com.makhnovetc.ifmo.soap.lab3;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NullFieldException", targetNamespace = "http://soap.ifmo.makhnovetc.com/")
public class NullFieldException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ExceptionBean faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public NullFieldException(String message, ExceptionBean faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public NullFieldException(String message, ExceptionBean faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.makhnovetc.ifmo.soap.lab3.ExceptionBean
     */
    public ExceptionBean getFaultInfo() {
        return faultInfo;
    }

}
