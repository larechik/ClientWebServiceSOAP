package com.makhnovetc.ifmo.soap.lab1.client;

import com.makhnovetc.ifmo.soap.lab2.PersonService;
import com.makhnovetc.ifmo.soap.lab2.PersonWebService;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;


import javax.xml.ws.Service;
import java.net.URL;

public class JaxWsClientPoolFactory extends
        BasePooledObjectFactory<ProxyWrapper<PersonWebService>> {
    private PersonWebService service = null;

    public JaxWsClientPoolFactory(PersonWebService service){
        this.service = service;
    }

    @Override
    public ProxyWrapper<PersonWebService> create() throws Exception {
        ProxyWrapper<PersonWebService> proxyWrapper = new ProxyWrapper<PersonWebService>( new PersonService(new URL("http://localhost:8080/PersonService")).getPersonWebServicePort());
        return proxyWrapper;
    }

    @Override
    public PooledObject<ProxyWrapper<PersonWebService>> wrap(ProxyWrapper<PersonWebService> personWebServiceProxyWrapper) {
        return new DefaultPooledObject<ProxyWrapper<PersonWebService>>(personWebServiceProxyWrapper);
    }
}
