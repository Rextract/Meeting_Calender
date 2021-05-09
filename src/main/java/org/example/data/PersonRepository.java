package org.example.data;

import org.example.Models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonRepository {

    private static final PersonRepository INSTANCE;

    static {
        INSTANCE = new PersonRepository();
    }



    public static PersonRepository getInstance(){
        return INSTANCE;
    }

    private PersonRepository(){
        List<Person> people = new ArrayList<Person>();
        people = null;
    }
    //END of singleton no more static!


    private List<Person> peopleStorage;


    public List<Person> findAll(){
        return getInstance().findAll();
    }

    public Person findByEmail(String Person){
        return getInstance().findByEmail(Person);
    }

    public List<Person> findByFirstName(String firstname){
        return getInstance().findByFirstName(firstname);
    }

    public Person findById (int id){
        return getInstance().findById(id);
    }

    public  List<Person> findByLastName(String lastname){
        return getInstance().findByLastName(lastname);
    }

    public Person findByUsername(String username){
        return getInstance().findByUsername(username);
    }

    public int getPeopleCount(){
        return getInstance().getPeopleCount();
    }

    public Person persist(Person persist){
        return persist;
    }

    public boolean remove(int remove){
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonRepository that = (PersonRepository) o;
        return Objects.equals(peopleStorage, that.peopleStorage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peopleStorage);
    }
}
