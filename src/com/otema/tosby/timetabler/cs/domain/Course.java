package com.otema.tosby.timetabler.cs.domain;

import java.util.ArrayList;

public class Course {

    private String number = null;
    private String name = null;
    private int NumberOfStudents;
    private ArrayList<Instructor> instructor;

    public Course(String number, String name, ArrayList<Instructor> instructor, int NumberOfStudents) {
        this.number = number;
        this.name = name;
        this.instructor = instructor;
        this.NumberOfStudents = NumberOfStudents;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Instructor> getInstructor() {
        return instructor;
    }

    public int getNumberOfStudents() {
        return NumberOfStudents;
    }
public String toString(){
    return name;
}
}
