package Opgave3;

import Opgave2.Counter;

import java.util.HashSet;
import java.util.Set;

public class PersonAdminstrator {
    private static PersonAdminstrator single_instance = null;
    private Set<Person> personSet = new HashSet<>();

    private PersonAdminstrator(){}

    public static PersonAdminstrator getInstance() {
        if (single_instance == null) {
            single_instance = new PersonAdminstrator();
        }
        return single_instance;
    }



    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void addPerson(Person person){
        personSet.add(person);
    }

    public void removePerson(Person person){
        personSet.remove(person);
    }
}
