
package com.makhnovetc.ifmo.soap.lab1.mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.makhnovetc.ifmo.soap.lab1.mypackage package. 
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

    private final static QName _FindPeopleResponse_QNAME = new QName("http://lab1.soap.ifmo.makhnovetc.com/", "findPeopleResponse");
    private final static QName _GetPersonsQueryResponse_QNAME = new QName("http://lab1.soap.ifmo.makhnovetc.com/", "getPersonsQueryResponse");
    private final static QName _GetPersonsQuery_QNAME = new QName("http://lab1.soap.ifmo.makhnovetc.com/", "getPersonsQuery");
    private final static QName _FindPeople_QNAME = new QName("http://lab1.soap.ifmo.makhnovetc.com/", "findPeople");
    private final static QName _GetPersons_QNAME = new QName("http://lab1.soap.ifmo.makhnovetc.com/", "getPersons");
    private final static QName _GetPersonsResponse_QNAME = new QName("http://lab1.soap.ifmo.makhnovetc.com/", "getPersonsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.makhnovetc.ifmo.soap.lab1.mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonsQuery }
     * 
     */
    public GetPersonsQuery createGetPersonsQuery() {
        return new GetPersonsQuery();
    }

    /**
     * Create an instance of {@link FindPeople }
     * 
     */
    public FindPeople createFindPeople() {
        return new FindPeople();
    }

    /**
     * Create an instance of {@link GetPersonsQueryResponse }
     * 
     */
    public GetPersonsQueryResponse createGetPersonsQueryResponse() {
        return new GetPersonsQueryResponse();
    }

    /**
     * Create an instance of {@link FindPeopleResponse }
     * 
     */
    public FindPeopleResponse createFindPeopleResponse() {
        return new FindPeopleResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.soap.ifmo.makhnovetc.com/", name = "findPeopleResponse")
    public JAXBElement<FindPeopleResponse> createFindPeopleResponse(FindPeopleResponse value) {
        return new JAXBElement<FindPeopleResponse>(_FindPeopleResponse_QNAME, FindPeopleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.soap.ifmo.makhnovetc.com/", name = "getPersonsQueryResponse")
    public JAXBElement<GetPersonsQueryResponse> createGetPersonsQueryResponse(GetPersonsQueryResponse value) {
        return new JAXBElement<GetPersonsQueryResponse>(_GetPersonsQueryResponse_QNAME, GetPersonsQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.soap.ifmo.makhnovetc.com/", name = "getPersonsQuery")
    public JAXBElement<GetPersonsQuery> createGetPersonsQuery(GetPersonsQuery value) {
        return new JAXBElement<GetPersonsQuery>(_GetPersonsQuery_QNAME, GetPersonsQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeople }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.soap.ifmo.makhnovetc.com/", name = "findPeople")
    public JAXBElement<FindPeople> createFindPeople(FindPeople value) {
        return new JAXBElement<FindPeople>(_FindPeople_QNAME, FindPeople.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.soap.ifmo.makhnovetc.com/", name = "getPersons")
    public JAXBElement<GetPersonsQuery> createGetPersons(GetPersonsQuery value) {
        return new JAXBElement<GetPersonsQuery>(_GetPersons_QNAME, GetPersonsQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lab1.soap.ifmo.makhnovetc.com/", name = "getPersonsResponse")
    public JAXBElement<GetPersonsQueryResponse> createGetPersonsResponse(GetPersonsQueryResponse value) {
        return new JAXBElement<GetPersonsQueryResponse>(_GetPersonsResponse_QNAME, GetPersonsQueryResponse.class, null, value);
    }

}
