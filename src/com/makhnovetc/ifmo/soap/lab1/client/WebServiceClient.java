package com.makhnovetc.ifmo.soap.lab1.client;
import com.makhnovetc.ifmo.soap.lab1.mypackage.Person;
import com.makhnovetc.ifmo.soap.lab1.mypackage.PersonService;
import com.makhnovetc.ifmo.soap.lab1.mypackage.PersonWebService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
public class WebServiceClient {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Hello! Check service type: 1-standalone, 2-J2EE");
        //String servType = br.readLine();
        PersonWebService service = new PersonService().getPersonWebServicePort();
        System.out.println("Please, write your query...");
        System.out.println("id-for column id");
        System.out.println("fn-for column name");
        System.out.println("mn-for column middle_name");
        System.out.println("sr-for column surname");
        System.out.println("dob-for column id");
        System.out.println("sex-for column telephone");
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
                case "ln":
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
        for (Person person : persons) {
            System.out.println("Person{" + "id=" + person.getId()+ ", name=" + person.getName() +
                    ", middle name=" + person.getMiddlename() +", surname=" + person.getSurname() +
                    ", date of birthday=" + person.getDob() + ", sex=" + person.getSex() +'}');
        }
        System.out.println("Total persons: " + persons.size());
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
}
