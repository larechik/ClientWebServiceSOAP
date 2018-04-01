package com.makhnovetc.ifmo.soap.client;
import com.makhnovetc.ifmo.soap.lab3.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.List;
public class WebServiceClient {

    public static void main(String[] args) throws MalformedURLException, InvalidFieldException, NullFieldException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello! Check service type: 1-standalone, 2-J2EE");
        String servType = null;
        try {
            servType = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PersonWebService service = null;
        switch (servType) {
            case "1":
                service = new PersonService(new URL("http://localhost:8080/PersonService")).getPersonWebServicePort();
                break;
            case "2":
                service = new PersonService(new URL("http://desktop-pfbom38:8080/WebServiceSOAPJ2EE-1.0-SNAPSHOT/PersonService")).getPersonWebServicePort();
                break;
        }

        //PersonWebService service = new PersonService(new URL("http://desktop-pfbom38:8080/WebServiceSOAPJ2EE-1.0-SNAPSHOT/PersonService")).getPersonWebServicePort();
        System.out.println("Select the type of action: 1 - select; 2 - insert; 3 - update; 4 - delete");
        String actionType = null;
        try {
            actionType = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        switch (actionType) {
            case "1":
                findPersons(service,br);
                break;
            case "2":
                insertPerson(service,br);
                break;
            case "3":
                updatePerson(service,br);
                break;
            case "4":
                deletePerson(service,br);
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

    private static void findPersons(PersonWebService service, BufferedReader br) {
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
        String readreq = null;
        try {
            readreq = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

        List<Person> persons = null;
        try {
            persons = service.findPeople(id,name,middlename,surname,dob,sex);
        } catch (InvalidDateFormatException e) {
            e.printStackTrace();
        } catch (NullFieldException e) {
            e.printStackTrace();
        }
        for (Person person : persons) {
            System.out.println("Person{" + "id=" + person.getId()+ ", name=" + person.getName() +
                    ", middle name=" + person.getMiddlename() +", surname=" + person.getSurname() +
                    ", date of birthday=" + person.getDob() + ", sex=" + person.getSex() +'}');
        }
        System.out.println("Total persons: " + persons.size());
    }

    private static void insertPerson(PersonWebService service, BufferedReader br) {
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
            String readreq = null;
            try {
                readreq = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
            int id= 0;
            try {
                id = service.insertPerson(name,middlename,surname,dob,sex);
            } catch (NullFieldException e) {
                e.printStackTrace();
            }
            System.out.println("id = "+id);
        }
    }
    private static void updatePerson(PersonWebService service, BufferedReader br) throws InvalidFieldException, NullFieldException {
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
            String readreq = null;
            try {
                readreq = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
            String status = null;

                status = updatePerson(service,id,name,middlename,surname,dob,sex);
            System.out.println("status: " + status);
        }
    }
    public static String updatePerson(PersonWebService service,String id,String name,String middlename,String surname,String dob,String sex) throws InvalidFieldException, NullFieldException {
            return service.updatePerson(id, name, middlename, surname, dob, sex);
    }
    private static void deletePerson(PersonWebService service, BufferedReader br) throws InvalidFieldException, NullFieldException {
        System.out.println("Please, enter the id of the line you want deleted...");
        String delId = null;
        try {
            delId = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String status = null;
            status = deletePerson(service,delId);
        System.out.println("status: " + status);
    }

    public static String deletePerson(PersonWebService service, String id) throws InvalidFieldException, NullFieldException {
            return service.deletePerson(id);

    }



}
