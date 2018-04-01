
package com.makhnovetc.ifmo.soap.lab3;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonWebService", targetNamespace = "http://soap.ifmo.makhnovetc.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonWebService {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws NullFieldException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertPerson", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.InsertPerson")
    @ResponseWrapper(localName = "insertPersonResponse", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.InsertPersonResponse")
    public int insertPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws NullFieldException
    ;

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws InvalidFieldException
     * @throws NullFieldException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.UpdatePersonResponse")
    public String updatePerson(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5)
        throws InvalidFieldException, NullFieldException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     * @throws InvalidFieldException
     * @throws NullFieldException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.DeletePersonResponse")
    public String deletePerson(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws InvalidFieldException, NullFieldException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.makhnovetc.ifmo.soap.lab3.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersonsQuery", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.GetPersonsQuery")
    @ResponseWrapper(localName = "getPersonsQueryResponse", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.GetPersonsQueryResponse")
    public List<Person> getPersonsQuery(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.makhnovetc.ifmo.soap.lab3.Person>
     * @throws NullFieldException
     * @throws InvalidDateFormatException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findPeople", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.FindPeople")
    @ResponseWrapper(localName = "findPeopleResponse", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.FindPeopleResponse")
    public List<Person> findPeople(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5)
        throws InvalidDateFormatException, NullFieldException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkDate", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.CheckDate")
    @ResponseWrapper(localName = "checkDateResponse", targetNamespace = "http://soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab3.CheckDateResponse")
    public boolean checkDate(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
