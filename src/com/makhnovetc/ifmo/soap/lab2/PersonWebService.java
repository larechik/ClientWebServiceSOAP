
package com.makhnovetc.ifmo.soap.lab2;

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
@WebService(name = "PersonWebService", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonWebService {


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
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.UpdatePersonResponse")
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
        String arg5);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "insertPerson", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.InsertPerson")
    @ResponseWrapper(localName = "insertPersonResponse", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.InsertPersonResponse")
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
        String arg4);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<com.makhnovetc.ifmo.soap.lab2.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findPeople", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.FindPeople")
    @ResponseWrapper(localName = "findPeopleResponse", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.FindPeopleResponse")
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
        String arg5);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.DeletePersonResponse")
    public String deletePerson(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.makhnovetc.ifmo.soap.lab2.Person>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPersonsQuery", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.GetPersonsQuery")
    @ResponseWrapper(localName = "getPersonsQueryResponse", targetNamespace = "http://lab1.soap.ifmo.makhnovetc.com/", className = "com.makhnovetc.ifmo.soap.lab2.GetPersonsQueryResponse")
    public List<Person> getPersonsQuery(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
