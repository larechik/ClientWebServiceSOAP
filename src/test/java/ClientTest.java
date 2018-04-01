import com.makhnovetc.ifmo.soap.client.WebServiceClient;
import com.makhnovetc.ifmo.soap.lab3.InvalidFieldException;
import com.makhnovetc.ifmo.soap.lab3.NullFieldException;
import com.makhnovetc.ifmo.soap.lab3.PersonService;
import com.makhnovetc.ifmo.soap.lab3.PersonWebService;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ClientTest {
    PersonWebService service;
    @BeforeMethod
    public void setUp(){
        try {
            service = new PersonService(new URL("http://localhost:8080/PersonService")).getPersonWebServicePort();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkDeletePersonWithNullId() {
        String status = null;
        try {
            status = WebServiceClient.deletePerson(service,"");
        } catch (NullFieldException e) {
            e.printStackTrace();
        } catch (InvalidFieldException e) {
            e.printStackTrace();
        }
        Assert.assertFalse(status.isEmpty());
    }

    @Test
    public void checkUpdate(){
        try {
            String status = WebServiceClient.updatePerson(service,"4213","name","middlename","surname","dob","sex");
        } catch (NullFieldException e) {
            e.printStackTrace();
        } catch (InvalidFieldException e) {
            e.printStackTrace();
        }
    }

}
