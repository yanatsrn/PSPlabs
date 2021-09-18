package lab2.activities;

import lab2.entities.Person;

import java.awt.*;
import java.util.*;
import java.util.List;

public class EmployeeActivitiesImpl implements EmployeeActivities {

    private List<Person> people;
    private static int ID_OF_PERSON = 1;

    public EmployeeActivitiesImpl() {
        people = new ArrayList<Person>();
        ID_OF_PERSON++;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public static int getIdOfPerson() {
        return ID_OF_PERSON;
    }

    public static void setIdOfPerson(int idOfPerson) {
        ID_OF_PERSON = idOfPerson;
    }

    @Override
    public String toString() {
        return "Персонал " + '\n' + people + '\n';
    }

    @Override
    public void add(Person obj) {
        people.add(obj);
    }
}

