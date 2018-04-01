import com.makhnovetc.ifmo.soap.client.WebServiceClient;
import com.makhnovetc.ifmo.soap.lab3.PersonService;
import com.makhnovetc.ifmo.soap.lab3.PersonWebService;
import com.makhnovetc.ifmo.soap.lab3.NullFieldException;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.jws.WebService;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientTest {
    @Test
    public void checkDeletePersonWithNullId() throws MalformedURLException, NullFieldException {
        PersonWebService service = new PersonService(new URL("http://localhost:8080/PersonService")).getPersonWebServicePort();
        String status = WebServiceClient.deletePerson(service,"");
        Assert.assertFalse(status.isEmpty());
    }

}
