package org.example.Models;
import java.util.Objects;

public class Person {

    private Person AppUser;

    AppUser appUser = new AppUser(1, "nisse", "password123");
 //   Person person = new Person(61, "David", "A.M", "blabla@gmail.com", appUser);
 //  AppUser userA = new AppUser(456, "Lorie", "password555");
 //   Person persA = new Person(9124, "Babbi", "babidi", "At@gmail.com", appUser);




    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser userCredentials;



    public Person(int id, String firstName, String lastName,
                  String email, AppUser userCredentials) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setUserCredentials(userCredentials);


    }

    public Person() {

    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null && firstName.isEmpty())
            throw new RuntimeException("Firstname is null or empty");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null && lastName.isEmpty())
            throw new RuntimeException("Lastname is null or empty");
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null && email.isEmpty())
            throw new RuntimeException("Email is invalid");
        this.email = email;
    }

    public AppUser getUserCredentials(org.example.Models.AppUser appUser) {  // why?!? Dig deeper into this
                                                                             // when u have more time!
        return appUser;
    }

    public void setUserCredentials(AppUser userCredentials) {
        if (userCredentials == null && userCredentials.toString().isEmpty())
            throw new RuntimeException("UserCredentials is null");
      //  AppUser appUser = new AppUser(1, "nisse", "password123");
        this.userCredentials = userCredentials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName)
                && Objects.equals(email, person.email)
                && Objects.equals(userCredentials, person.userCredentials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, userCredentials);
    }

    @Override
    public String toString() {
        return "Person{" +
                "AppUser=" + AppUser +
                ", appUser=" + appUser +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", userCredentials=" + userCredentials +
                '}';
    }

}

