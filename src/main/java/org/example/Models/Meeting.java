package org.example.Models;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;

public class Meeting {

    private Person Meeting;
    private AppUser Person;

    private int id;
    private String topic;
    private LocalDate meetingDate;
    private LocalTime start;
    private LocalTime end;
    private Person organizer;
    private List<Person> attendants;

    public Meeting(int id, String topic, LocalDate meetingDate, LocalTime start, LocalTime end,
                   org.example.Models.Person organizer,
                   List<org.example.Models.Person> attendants) {

        this.id = id;
        setTopic(topic);
        setMeetingDate(meetingDate);
        setStart(start);
        setEnd(end);
        setOrganizer(organizer);
        setAttendants(attendants);
    }

    public int getId() {
        return id;
    }

    public void addAttendant (Person person){
        attendants.contains(person);

    }

    public void removeAttendant (Person person){
        attendants.clear();

    }


    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        if (topic == null) throw new RuntimeException("Topic was found null");
        this.topic = topic;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        if (meetingDate == null) throw new RuntimeException("Meeting Date was null");
        this.meetingDate = meetingDate;
    }

    public LocalTime getStart() {
        return start;
    }

    public void setStart(LocalTime start) {
        if (start == null) throw new RuntimeException("Start was null");
        this.start = start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public void setEnd(LocalTime end) {
        if (end == null) throw new RuntimeException("End was null");
        this.end = end;
    }

    public Person getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Person organizer) {
        if (organizer == null) throw new RuntimeException("Organizer was found null");
        this.organizer = organizer;
    }

    public List<Person> getAttendants() {
        return attendants;
    }

    public void setAttendants(List<Person> attendants) {
        this.attendants = attendants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meeting = (Meeting) o;
        return id == meeting.id && Objects.equals(Meeting, meeting.Meeting)
                && Objects.equals(Person, meeting.Person)
                && Objects.equals(topic, meeting.topic)
                && Objects.equals(meetingDate, meeting.meetingDate)
                && Objects.equals(start, meeting.start)
                && Objects.equals(end, meeting.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Meeting, Person, id, topic, meetingDate, start, end);
    }
}
