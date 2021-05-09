package org.example.Models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MeetingTest {

    static Person person = new Person();
    static List<Person> attendants = new ArrayList<>();


    public static final int id = 6421;
    public static final String topic = "Programming is fun!";
    public static final LocalDate meetingDate = LocalDate.of(2021, 05, 16);
    public static final LocalTime start = LocalTime.now().withHour(8).withMinute(50);
    public static final LocalTime end = LocalTime.now().withHour(2).withMinute(30);
    public static final Person organizer = person;
    public static final List<Person> Attendants = attendants;

    private Meeting testObject;


    public static void main(String[] args) {
        LocalTime now = LocalTime.of(16, 15, 23, 16);
        System.out.println(now);
    }

    /*
        private int id;
        private String topic;
        private LocalDate meetingDate;
        private LocalTime start;
        private LocalTime end;
        private Person organizer;
        private List<Person> attendants;
    */
    @BeforeEach
    void setUp() {
        testObject = new Meeting(id, topic, meetingDate, start, end, person, attendants);
    }


    @Test
    @DisplayName("Testing the methods")
    void theTestMadeIt() {
        assertNotNull(testObject);
        assertEquals(id, testObject.getId());
        assertEquals(topic, testObject.getTopic());
        assertEquals(meetingDate, testObject.getMeetingDate());
        assertEquals(start, testObject.getStart());
        assertEquals(end, testObject.getEnd());
        assertEquals(person, testObject.getOrganizer());
        assertEquals(attendants, testObject.getAttendants());

        System.out.println(testObject.getId());
        System.out.println(testObject.getTopic());
        System.out.println(testObject.getMeetingDate());
        System.out.println(testObject.getStart());
        System.out.println(testObject.getEnd());
        System.out.println(testObject.getOrganizer());
        System.out.println(testObject.getAttendants());

    }
}