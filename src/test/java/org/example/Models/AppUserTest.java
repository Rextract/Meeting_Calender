package org.example.Models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {

    public static final int id = 12345678;
    public static final int ID = id;
    public static final String username = "TESTING USERNAME 1234";
    public static final String USERNAME = username;
    public static final String password = "TESTING PASSWORD 5678";
    public static final String PASSWORD = password;
    private AppUser testObject;


    @BeforeEach
    void setUp() {
        testObject = new AppUser(ID, USERNAME, PASSWORD);
    }

    @Test
    @DisplayName("Testobject has the correct data")
    void testObjectWasASuccess(){
        assertNotNull(testObject);
        assertEquals(ID, testObject.getId());
        assertEquals(USERNAME, testObject.getUsername());
        assertEquals(PASSWORD, testObject.getPassword());

        System.out.println(testObject.getId());
        System.out.println(testObject.getUsername());
        System.out.println(testObject.getPassword());
    }

    @Test
    @DisplayName("Copy of the testObject equals true and hashcode same")
    void copy_equals_testObjects(){
        AppUser copy = new AppUser(ID, USERNAME, PASSWORD);

        assertEquals(copy, testObject);
        assertEquals(copy.hashCode(), testObject.hashCode());
    }

}