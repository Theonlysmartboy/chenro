package com.otema.tosby.timetabler.cs;

import com.otema.tosby.timetabler.cs.domain.Course;
import com.otema.tosby.timetabler.cs.domain.Department;
import com.otema.tosby.timetabler.cs.domain.Instructor;
import com.otema.tosby.timetabler.cs.domain.MeetingTime;
import com.otema.tosby.timetabler.cs.domain.Room;
import java.util.ArrayList;
import java.util.Arrays;

public class Data {

    private ArrayList<Room> rooms;
    private ArrayList<Instructor> instructors;
    private ArrayList<Course> courses;
    private ArrayList<Department> depts;
    private ArrayList<MeetingTime> meetingtimes;
    private int numberOfClasses = 0;

    private Data() {
        initialize();
    }

    private Data initialize() {
        Room room1 = new Room("R1", 25);
        Room room2 = new Room("R2", 25);
        Room room3 = new Room("R3", 25);
        rooms = new ArrayList<Room>(Arrays.asList(room1, room2, room3));
        MeetingTime time = new MeetingTime("MT1","Mon 07:00 - 11:00");
        MeetingTime time1 = new MeetingTime("MT2","Mon 12:00 - 16:00");
        MeetingTime time2 = new MeetingTime("MT3","Mon 16:00 - 20:00");
        MeetingTime time3 = new MeetingTime("MT4","Tue 07:00 - 11:00");
        MeetingTime time4 = new MeetingTime("MT5","Mon 12:00 - 16:00");
        meetingtimes = new ArrayList<MeetingTime>(Arrays.asList(time, time1, time2, time3, time4));
        Instructor instructor = new Instructor("I1","John");
        Instructor instructor1 = new Instructor("I2","Jane");
        Instructor instructor2 = new Instructor("I3","Janet");
        Instructor instructor3 = new Instructor("I4","Joseph");
        Instructor instructor4 = new Instructor("I5","Tosby");
        instructors = new ArrayList<Instructor>(Arrays.asList(instructor, instructor1, instructor2, instructor3, instructor4));
        Course course = new Course("C1", "325K",new ArrayList<Instructor>(Arrays.asList(instructor, instructor1)),25);

        return this;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Instructor> getIntstructors() {
        return instructors;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Department> getDepts() {
        return depts;
    }

    public ArrayList<MeetingTime> getMeetingtimes() {
        return meetingtimes;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

}
