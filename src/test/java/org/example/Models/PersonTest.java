package org.example.Models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//CHECK WHATS WRONG WITH THIS TEST

class PersonTest {

  static AppUser appUser = new AppUser(2321, "Billy", "bob123");



//   static AppUser appUser = new AppUser(2321, "Billy", "bob123");

    public static final int id = 20052;
    public static final String firstName = "Dave";
    public static final String lastName = "Behave";
    public static final String email = "Ello@hotmail.com";

    public static final AppUser userCredentials = appUser;

    private Person testObject;

 /*   public PersonTest resolveParameter (ParameterContext parameterContext,
                                    ExtensionContext extensionContext)
        throws ParameterResolutionException {
        return new PersonTest();
    }
*/
    @BeforeEach
    void setUp() {
        testObject = new Person(id, firstName, lastName, email, userCredentials);}

    @Test
    @DisplayName("Testing to see if Person class works")
    void Testing() {
        assertNotNull(testObject);
        assertEquals(id, testObject.getId());
        assertEquals(firstName, testObject.getFirstName());
        assertEquals(lastName, testObject.getLastName());
        assertEquals(email, testObject.getEmail());
        assertEquals(userCredentials, testObject.getUserCredentials(appUser));

        System.out.println(testObject.getId());
        System.out.println(testObject.getFirstName());
        System.out.println(testObject.getLastName());
        System.out.println(testObject.getEmail());
        System.out.println(testObject.getUserCredentials(appUser));

    }

    @DisplayName("Testing if ToString works")
    @Test
    void testToString() {
        assertNotNull(testObject);
        assertEquals(id, testObject.getId());
        assertEquals(firstName, testObject.getFirstName());
        assertEquals(lastName, testObject.getLastName());
        assertEquals(email, testObject.getEmail());
        assertEquals(userCredentials, testObject.getUserCredentials(appUser));

        System.out.println(testObject.getId());
        System.out.println(testObject.getFirstName());
        System.out.println(testObject.getLastName());
        System.out.println(testObject.getEmail());
        System.out.println(testObject.getUserCredentials(appUser));
    }
}