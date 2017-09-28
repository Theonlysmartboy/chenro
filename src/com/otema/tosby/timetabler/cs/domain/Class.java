
package com.otema.tosby.timetabler.cs.domain;

public class Class {
    private int Id;
    private Department dept;
    private Course course;
    private Instructor instructor;
    private MeetingTime meetingtime;
    private Room room;

    public Class(int Id, Department dept, Course course) {
        this.Id = Id;
        this.dept = dept;
        this.course = course;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setMeetingtime(MeetingTime meetingtime) {
        this.meetingtime = meetingtime;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getId() {
        return Id;
    }

    public Department getDept() {
        return dept;
    }

    public Course getCourse() {
        return course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public MeetingTime getMeetingtime() {
        return meetingtime;
    }

    public Room getRoom() {
        return room;
    }
    
}
