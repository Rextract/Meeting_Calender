package org.example.data;

import org.example.Models.Meeting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MeetingRepository {

    private static final MeetingRepository INSTANCE;

    static {
        INSTANCE = new MeetingRepository();
    }


    public static MeetingRepository getInstance(){
        return INSTANCE;
    }

    private MeetingRepository(){
        List<Meeting> meetings = new ArrayList<Meeting>();
        meetings = null;
    }
    //END of singleton No More STATICS !


    private List<Meeting> meetings;


    public List<Meeting> findAll(){
        return getInstance().findAll();
    }

    public List<Meeting> findByAttendeePersonId(int personId){
        return getInstance().findByAttendeePersonId(personId);
    }

    public Meeting findById(int id){
        return findById(id);
    }

    public List<Meeting> findByMeetingDate(LocalDate date){
        return findByMeetingDate(date);
    }

    public List<Meeting> findByMeetingsBetween(LocalDateTime LocalDateTime){
        return findByMeetingsBetween(LocalDateTime);
    }

    public List<Meeting> findByOrganizerPersonId(int organizerPersonId){
        return findByOrganizerPersonId(organizerPersonId);
    }

    public List<Meeting> findByTopic (String topic){
        return findByTopic(topic);
    }

    public int getMeetingCount(){
        return getInstance().getMeetingCount();
    }

    public Meeting persist(Meeting persist){
        return persist;
    }

    public boolean remove (int remove){
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeetingRepository that = (MeetingRepository) o;
        return Objects.equals(meetings, that.meetings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetings);
    }
}
