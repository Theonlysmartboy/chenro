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
        Instructor instructor5 = new Instructor("I6","Odhiambo");
        instructors = new ArrayList<Instructor>(Arrays.asList(instructor, instructor1, instructor2, instructor3, instructor4,instructor5));
        Course course = new Course("C1", "325K",new ArrayList<Instructor>(Arrays.asList(instructor, instructor1)),25);
        Course course1 = new Course("C2", "325K",new ArrayList<Instructor>(Arrays.asList(instructor1, instructor2)),30);
        Course course2 = new Course("C3", "325K",new ArrayList<Instructor>(Arrays.asList(instructor2, instructor3)),35);
        Course course3 = new Course("C4", "325K",new ArrayList<Instructor>(Arrays.asList(instructor3, instructor4)),45);
        Course course4 = new Course("C5", "325K",new ArrayList<Instructor>(Arrays.asList(instructor4, instructor)),15);
        Course course5 = new Course("C6", "325K",new ArrayList<Instructor>(Arrays.asList(instructor1, instructor4)),25);
        Course course6 = new Course("C7", "325K",new ArrayList<Instructor>(Arrays.asList(instructor3, instructor2)),35);
        courses = new ArrayList<Course>(Arrays.asList(course, course1, course2, course3, course4, course5, course6));
        Department dept = new Department("IT",new ArrayList<Course>(Arrays.asList(course, course2)));
        Department dept1 = new Department("CS",new ArrayList<Course>(Arrays.asList(course1, course3,course4)));
        Department dept2 = new Department("MIT",new ArrayList<Course>(Arrays.asList(course5, course6)));
        depts = new ArrayList<Department>(Arrays.asList(dept, dept1, dept2));
        depts.forEach(x ->numberOfClasses += x.getCourse().size());
        
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
