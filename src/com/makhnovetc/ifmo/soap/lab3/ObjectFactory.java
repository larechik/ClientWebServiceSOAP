
package com.makhnovetc.ifmo.soap.lab3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.makhnovetc.ifmo.soap.lab3 package. 
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

    private final static QName _InsertPersonResponse_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "insertPersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "deletePerson");
    private final static QName _FindPeople_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "findPeople");
    private final static QName _CheckDateResponse_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "checkDateResponse");
    private final static QName _NullFieldException_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "NullFieldException");
    private final static QName _InsertPerson_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "insertPerson");
    private final static QName _CheckDate_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "checkDate");
    private final static QName _InvalidDateFormatException_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "InvalidDateFormatException");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "deletePersonResponse");
    private final static QName _GetPersonsQuery_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "getPersonsQuery");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "updatePersonResponse");
    private final static QName _FindPeopleResponse_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "findPeopleResponse");
    private final static QName _GetPersonsQueryResponse_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "getPersonsQueryResponse");
    private final static QName _UpdatePerson_QNAME = new QName("http://soap.ifmo.makhnovetc.com/", "updatePerson");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.makhnovetc.ifmo.soap.lab3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link InsertPersonResponse }
     * 
     */
    public InsertPersonResponse createInsertPersonResponse() {
        return new InsertPersonResponse();
    }

    /**
     * Create an instance of {@link FindPeople }
     * 
     */
    public FindPeople createFindPeople() {
        return new FindPeople();
    }

    /**
     * Create an instance of {@link NullFieldExceptionBean }
     * 
     */
    public NullFieldExceptionBean createNullFieldExceptionBean() {
        return new NullFieldExceptionBean();
    }

    /**
     * Create an instance of {@link CheckDateResponse }
     * 
     */
    public CheckDateResponse createCheckDateResponse() {
        return new CheckDateResponse();
    }

    /**
     * Create an instance of {@link CheckDate }
     * 
     */
    public CheckDate createCheckDate() {
        return new CheckDate();
    }

    /**
     * Create an instance of {@link InsertPerson }
     * 
     */
    public InsertPerson createInsertPerson() {
        return new InsertPerson();
    }

    /**
     * Create an instance of {@link GetPersonsQuery }
     * 
     */
    public GetPersonsQuery createGetPersonsQuery() {
        return new GetPersonsQuery();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link InvalidDateFormatExceptionBean }
     * 
     */
    public InvalidDateFormatExceptionBean createInvalidDateFormatExceptionBean() {
        return new InvalidDateFormatExceptionBean();
    }

    /**
     * Create an instance of {@link FindPeopleResponse }
     * 
     */
    public FindPeopleResponse createFindPeopleResponse() {
        return new FindPeopleResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link GetPersonsQueryResponse }
     * 
     */
    public GetPersonsQueryResponse createGetPersonsQueryResponse() {
        return new GetPersonsQueryResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "insertPersonResponse")
    public JAXBElement<InsertPersonResponse> createInsertPersonResponse(InsertPersonResponse value) {
        return new JAXBElement<InsertPersonResponse>(_InsertPersonResponse_QNAME, InsertPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeople }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "findPeople")
    public JAXBElement<FindPeople> createFindPeople(FindPeople value) {
        return new JAXBElement<FindPeople>(_FindPeople_QNAME, FindPeople.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "checkDateResponse")
    public JAXBElement<CheckDateResponse> createCheckDateResponse(CheckDateResponse value) {
        return new JAXBElement<CheckDateResponse>(_CheckDateResponse_QNAME, CheckDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NullFieldExceptionBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "NullFieldException")
    public JAXBElement<NullFieldExceptionBean> createNullFieldException(NullFieldExceptionBean value) {
        return new JAXBElement<NullFieldExceptionBean>(_NullFieldException_QNAME, NullFieldExceptionBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "insertPerson")
    public JAXBElement<InsertPerson> createInsertPerson(InsertPerson value) {
        return new JAXBElement<InsertPerson>(_InsertPerson_QNAME, InsertPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "checkDate")
    public JAXBElement<CheckDate> createCheckDate(CheckDate value) {
        return new JAXBElement<CheckDate>(_CheckDate_QNAME, CheckDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidDateFormatExceptionBean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "InvalidDateFormatException")
    public JAXBElement<InvalidDateFormatExceptionBean> createInvalidDateFormatException(InvalidDateFormatExceptionBean value) {
        return new JAXBElement<InvalidDateFormatExceptionBean>(_InvalidDateFormatException_QNAME, InvalidDateFormatExceptionBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsQuery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "getPersonsQuery")
    public JAXBElement<GetPersonsQuery> createGetPersonsQuery(GetPersonsQuery value) {
        return new JAXBElement<GetPersonsQuery>(_GetPersonsQuery_QNAME, GetPersonsQuery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindPeopleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "findPeopleResponse")
    public JAXBElement<FindPeopleResponse> createFindPeopleResponse(FindPeopleResponse value) {
        return new JAXBElement<FindPeopleResponse>(_FindPeopleResponse_QNAME, FindPeopleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonsQueryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "getPersonsQueryResponse")
    public JAXBElement<GetPersonsQueryResponse> createGetPersonsQueryResponse(GetPersonsQueryResponse value) {
        return new JAXBElement<GetPersonsQueryResponse>(_GetPersonsQueryResponse_QNAME, GetPersonsQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.ifmo.makhnovetc.com/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

}
