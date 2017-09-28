package com.otema.tosby.timetabler.cs;

import com.otema.tosby.timetabler.cs.domain.Course;
import com.otema.tosby.timetabler.cs.domain.Department;
import com.otema.tosby.timetabler.cs.domain.Instructor;
import com.otema.tosby.timetabler.cs.domain.MeetingTime;
import com.otema.tosby.timetabler.cs.domain.Room;
import java.util.ArrayList;

public class Data {

    private ArrayList<Room> rooms;
    private ArrayList<Instructor> intstructors;
    private ArrayList<Course> courses;
    private ArrayList<Department> depts;
    private ArrayList<MeetingTime> meetingtimes;
    private int numberOfClasses = 0;

    private Data() {
        initialize();
    }

    private Data initialize() {
        return this;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Instructor> getIntstructors() {
        return intstructors;
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
