package com.makhnovetc.ifmo.soap.lab1.client;
import com.makhnovetc.ifmo.soap.lab2.Person;
import com.makhnovetc.ifmo.soap.lab2.PersonService;
import com.makhnovetc.ifmo.soap.lab2.PersonWebService;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;

import javax.xml.ws.Service;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class WebServiceClient {
    private static ObjectPool<ProxyWrapper<PersonWebService>> pool = null;

    public static void main(String[] args) throws IOException, InterruptedException {
        WebServiceClient webServiceClient = new WebServiceClient();
        webServiceClient.init();
        webServiceClient.webServiceClient();
    }
    public void init() throws MalformedURLException {
        if (pool == null){
            final PersonWebService service = new PersonService(new URL("http://localhost:8080/PersonService")).getPersonWebServicePort();
            pool = new GenericObjectPool<ProxyWrapper<PersonWebService>>(new JaxWsClientPoolFactory(service));

        }
    }
    public void webServiceClient() throws InterruptedException {

        webServiceClient(10,1);
    }

    public void webServiceClient(int numTreads, int count) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(numTreads);
        for (int i=0;i<numTreads;i++){

            new Thread(new ClientRunner(count,countDownLatch)).start();
        }
        countDownLatch.await();

    }

    public static void startClient(PersonWebService port) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*System.out.println("Hello! Check service type: 1-standalone, 2-J2EE");
        String servType = br.readLine();*/
        //PersonWebService service = new PersonService(new URL("http://localhost:8080/PersonService")).getPersonWebServicePort();
        /*switch (servType) {
            case "1":
                service = new PersonService(new URL("http://localhost:8080/PersonService")).getPersonWebServicePort();
                break;
            case "2":
                service = new PersonService(new URL("http://desktop-pfbom38:8080/WebServiceSOAPJ2EE-1.0-SNAPSHOT/PersonService")).getPersonWebServicePort();
                break;
        }*/

        //PersonWebService service = new PersonService(new URL("http://desktop-pfbom38:8080/WebServiceSOAPJ2EE-1.0-SNAPSHOT/PersonService")).getPersonWebServicePort();
        System.out.println("Select the type of action: 1 - select; 2 - insert; 3 - update; 4 - delete");
        String actionType = br.readLine();
        switch (actionType) {
            case "1":
                findPersons(port,br);
                break;
            case "2":
                insertPerson(port,br);
                break;
            case "3":
                updatePerson(port,br);
                break;
            case "4":
                deletePerson(port,br);
                break;
                default:
                    System.out.println("Wrong choose");
                    break;
        }
    }
    private static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            printPerson(person);
        }

        System.out.println("Total persons: " + persons.size());

    }

    private static void printPerson(Person p) {
        System.out.println("id:" + p.getId() + ", name:" + p.getName() +", middle name:" + p.getMiddlename() +
                ", surname:" + p.getSurname() + ", dob:" + p.getDob() + ", sex:" + p.getSex());
    }

    private static void findPersons(PersonWebService service, BufferedReader br) throws IOException {
        System.out.println("Please, write your query...");
        System.out.println("id-for column id");
        System.out.println("fn-for column name");
        System.out.println("mn-for column middle_name");
        System.out.println("sr-for column surname");
        System.out.println("dob-for column dob");
        System.out.println("sex-for column sex");
        System.out.println("Example:");
        System.out.println("fn=Alexandr");
        System.out.println("Enter your request with delim \",\"");
        String readreq = br.readLine();
        String req[] = readreq.split(",");
        String id = "", name = "", surname = "", middlename = "", dob = "", sex = "";
        for (int j = 0; j < req.length; j++) {
            String temp[] = req[j].split("=");
            switch (temp[0]) {
                case "id":
                    id = temp[1] ;
                    break;
                case "fn":
                    name = temp[1];
                    break;
                case "mn":
                    middlename = temp[1];
                    break;
                case "sr":
                    surname = temp[1];
                    break;
                case "dob":
                    dob = temp[1];
                    break;
                case "sex":
                    sex = temp[1];
                    break;
            }
        }

        List<Person> persons = service.findPeople(id,name,middlename,surname,dob,sex);
        printPersons(persons);
        System.out.println("Total persons: " + persons.size());
    }

    private static void insertPerson(PersonWebService service, BufferedReader br) throws IOException {
        boolean test = true;
        while (test) {
            System.out.println("Please, write your query...");
            System.out.println("fn-for column name");
            System.out.println("mn-for column middle_name");
            System.out.println("sr-for column surname");
            System.out.println("dob-for column dob");
            System.out.println("sex-for column sex");
            System.out.println("Example:");
            System.out.println("fn=Alexandr");
            System.out.println("Enter your request with delim \",\"");
            String readreq = br.readLine();
            String req[] = readreq.split(",");
            String name = "", surname = "", middlename = "", dob = "", sex = "";
            for (int j = 0; j < req.length; j++) {
                String temp[] = req[j].split("=");
                switch (temp[0]) {
                    case "fn":
                        name = temp[1];
                        break;
                    case "mn":
                        middlename = temp[1];
                        break;
                    case "sr":
                        surname = temp[1];
                        break;
                    case "dob":
                        dob = temp[1];
                        break;
                    case "sex":
                        sex = temp[1];
                        break;
                }
            }
            if (!(name.isEmpty()||middlename.isEmpty()||surname.isEmpty()||dob.isEmpty()||sex.isEmpty())){
                test = false;
            }else {
                System.out.println("name="+name+" middlename="+middlename+" surname="+surname+" dob="+dob+" sex="+sex);
                System.out.println("You did not specify all the options");
            }
            System.out.println("name="+name+" middlename="+middlename+" surname="+surname+" dob="+dob+" sex="+sex);
            int id= service.insertPerson(name,middlename,surname,dob,sex);
            System.out.println("id = "+id);
        }

    }
    private static void updatePerson(PersonWebService service, BufferedReader br) throws IOException {
        boolean test = true;
        while (test) {
            System.out.println("Please, enter new fields values and the id of the line you want...");
            System.out.println("id-for column id");
            System.out.println("fn-for column name");
            System.out.println("mn-for column middle_name");
            System.out.println("sr-for column surname");
            System.out.println("dob-for column dob");
            System.out.println("sex-for column sex");
            System.out.println("Example:");
            System.out.println("fn=Alexandr");
            System.out.println("Enter your request with delim \",\"");
            String readreq = br.readLine();
            String req[] = readreq.split(",");
            String id = "", name = "", surname = "", middlename = "", dob = "", sex = "";
            for (int j = 0; j < req.length; j++) {
                String temp[] = req[j].split("=");
                switch (temp[0]) {
                    case "id":
                        id = temp[1];
                        break;
                    case "fn":
                        name = temp[1];
                        break;
                    case "mn":
                        middlename = temp[1];
                        break;
                    case "sr":
                        surname = temp[1];
                        break;
                    case "dob":
                        dob = temp[1];
                        break;
                    case "sex":
                        sex = temp[1];
                        break;
                }
            }
            if (!(id.isEmpty() || name.isEmpty() || middlename.isEmpty() || surname.isEmpty() || dob.isEmpty() || sex.isEmpty())) {
                test = false;
            } else {
                System.out.println("name=" + name + " middlename=" + middlename + " surname=" + surname + " dob=" + dob + " sex=" + sex);
                System.out.println("You did not specify all the options");
            }
            String status = service.updatePerson(id, name, middlename, surname, dob, sex);
            System.out.println("status: " + status);

        }
    }
    private static void deletePerson(PersonWebService service, BufferedReader br) throws IOException {
        System.out.println("Please, enter the id of the line you want deleted...");
        String delId = br.readLine();
        String status = service.deletePerson(delId);
        System.out.println("status: " + status);
    }

    public class ClientRunner implements Runnable{
        private final int count;
        private final CountDownLatch countDownLatch;

        public ClientRunner(int count,CountDownLatch countDownLatch){
            this.count = count;
            this.countDownLatch = countDownLatch;

        }

        @Override
        public void run() {

            ProxyWrapper<PersonWebService> proxyWrapper = null;

            try {
                proxyWrapper = pool.borrowObject();
                PersonWebService port = proxyWrapper.getItem();

                for(int i=0;i<count;i++){

                    startClient(port);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();

        }
}

}
